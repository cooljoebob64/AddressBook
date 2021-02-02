package com.tts.addressor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddressorTest {

    Addressor testAddressor;
    Entry testEntry;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        testAddressor = Addressor.createEmptyAddressor();
        testEntry = Entry.createEntry(
                "TestFirst",
                "TestLast",
                "TestPhone",
                "TestEmail");
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void createEmptyAddressor() {
        Addressor newAddressor = Addressor.createEmptyAddressor();
//        assertTrue(newAddressor instanceof Addressor);
        assertNotEquals(newAddressor, null);
    }

    @Test
    void addEntry() {
        testAddressor.addEntry(testEntry);
        ArrayList<Entry> searchResult = testAddressor.searchEntries(testEntry.getEmailAddress(), Addressor.SearchType.EMAIL);

        String expected = testEntry.getEmailAddress();
        String actual = searchResult.get(0).getEmailAddress();
        assertTrue(actual.contains(expected));
    }

    @Test
    void removeEntry() {
        testAddressor.addEntry(testEntry);
        testAddressor.removeEntry(testEntry.getEmailAddress());
        ArrayList<Entry> searchResult = testAddressor.searchEntries(testEntry.getEmailAddress(), Addressor.SearchType.EMAIL);

        boolean expected = true;
        boolean actual = searchResult.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void searchEntries() {
        testAddressor.addEntry(testEntry);
        ArrayList<Entry> searchResult = testAddressor.searchEntries(testEntry.getEmailAddress());

        String expected = testEntry.getEmailAddress();
        String actual = searchResult.get(0).getEmailAddress();
        assertTrue(actual.contains(expected));
    }

    @Test
    void searchEntriesByType() {
        testAddressor.addEntry(testEntry);
        ArrayList<Entry> searchResult = testAddressor.searchEntries(testEntry.getEmailAddress(), Addressor.SearchType.EMAIL);

        String expected = testEntry.getEmailAddress();
        String actual = searchResult.get(0).getEmailAddress();
        assertTrue(actual.contains(expected));
    }

    @Test
    void printAddressBook() {
        testAddressor.printAddressBook();
        assertNotEquals(null, outContent.toString());
    }

    @Test
    void deleteAddressBook() {
        testAddressor.addEntry(testEntry);
        testAddressor.deleteAddressBook();

        ArrayList<Entry> searchResult = testAddressor.searchEntries(testEntry.getEmailAddress(), Addressor.SearchType.EMAIL);

        boolean expected = true;
        boolean actual = searchResult.isEmpty();
        assertEquals(expected,actual);
    }
}
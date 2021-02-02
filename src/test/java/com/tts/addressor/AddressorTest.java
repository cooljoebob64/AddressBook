package com.tts.addressor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressorTest {

    @Test
    void createEmptyAddressor(){
        Addressor newAddressor = Addressor.createEmptyAddressor();
//        assertTrue(newAddressor instanceof Addressor);
        assertNotEquals(newAddressor, null);
    }

    @Test
    void addEntry() {

    }

    @Test
    void removeEntry() {
    }

    @Test
    void searchEntries() {
    }

    @Test
    void printAddressBook() {
    }

    @Test
    void deleteAddressBook() {
    }

    @Test
    void quit() {
    }
}
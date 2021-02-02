package com.tts.addressor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    Entry testEntry;
    Entry testBlankEntry;

    final static String TEST_FIRSTNAME = "TestFirst";
    final static String TEST_LASTNAME = "TestLast";
    final static String TEST_PHONE = "TestPhone";
    final static String TEST_EMAIL = "TestEmail@Email.com";

    enum TEST_DATA{
        testEntryFilled(TEST_FIRSTNAME, TEST_LASTNAME, TEST_PHONE, TEST_EMAIL);

        private final String firstName;
        private final String lastName;
        private final String phone;
        private final String email;

        TEST_DATA(String firstname, String lastname, String phone, String email){
            this.firstName = firstname;
            this.lastName = lastname;
            this.phone = phone;
            this.email = email;
        }
    }

    @BeforeEach
    void setUp() {
        testEntry = Entry.createEntry(
                TEST_DATA.testEntryFilled.firstName,
                TEST_DATA.testEntryFilled.lastName,
                TEST_DATA.testEntryFilled.phone,
                TEST_DATA.testEntryFilled.email);
        testBlankEntry = Entry.createBlankEntry();
    }

    @Test
    void constructorEmpty(){
        assertNotEquals(testBlankEntry, null);
    }
    @Test
    void constructorFull(){
        assertNotEquals(testEntry, null);
    }

    @Test
    void getFirstName() {
        String expected = TEST_DATA.testEntryFilled.firstName;
        String actual = testEntry.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    void setFirstName() {
        String expected = "NEWTESTDATA";
        testEntry.setFirstName(expected);

        String actual = testEntry.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    void getLastName() {
        String expected = TEST_DATA.testEntryFilled.lastName;
        String actual = testEntry.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    void setLastName() {
        String expected = "NEWTESTDATA";
        testEntry.setLastName(expected);

        String actual = testEntry.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    void getPhoneNumber() {
        String expected = TEST_DATA.testEntryFilled.phone;
        String actual = testEntry.getPhoneNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setPhoneNumber() {
        String expected = "NEWTESTDATA";
        testEntry.setPhoneNumber(expected);

        String actual = testEntry.getPhoneNumber();

        assertEquals(expected, actual);
    }

    @Test
    void getEmailAddress() {
        String expected = TEST_DATA.testEntryFilled.email;
        String actual = testEntry.getEmailAddress();

        assertEquals(expected, actual);
    }

    @Test
    void setEmailAddress() {
        String expected = "NEWTESTDATA";
        testEntry.setEmailAddress(expected);

        String actual = testEntry.getEmailAddress();

        assertEquals(expected, actual);
    }
}
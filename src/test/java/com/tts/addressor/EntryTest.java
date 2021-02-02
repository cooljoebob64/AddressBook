package com.tts.addressor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    Entry testEntry;
    Entry testBlankEntry;

    @BeforeEach
    void setUp() {
        testEntry = Entry.createEntry(
                "TestFirst",
                "TestLast",
                "TestNum",
                "TestEmail@Email.com");
        testBlankEntry = Entry.createBlankEntry();
    }

    @Test
    void getFirstName() {
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getPhoneNumber() {
    }

    @Test
    void setPhoneNumber() {
    }

    @Test
    void getEmailAddress() {
    }

    @Test
    void setEmailAddress() {
    }
}
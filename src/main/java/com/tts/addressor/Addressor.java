package com.tts.addressor;

import java.util.ArrayList;

public class Addressor {

    private ArrayList<Entry> myList;

    private Addressor(){}

    public static Addressor createEmptyAddressor(){
        return new Addressor();
    }

    public void addEntry(Entry newEntry){}
    public void removeEntry(Entry removedEntry){}
    public void searchEntries(String searchQuery){}
    public void printAddressBook(){}
    public void deleteAddressBook(){}
    public void quit(){}

}

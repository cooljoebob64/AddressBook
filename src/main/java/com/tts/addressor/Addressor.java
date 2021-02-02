package com.tts.addressor;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Addressor {

    private ArrayList<Entry> myList;

    private Addressor(){
        myList = new ArrayList<>();
    }

    public enum SearchType {
        FIRSTNAME,
        LASTNAME,
        PHONE,
        EMAIL;
    }

    public static Addressor createEmptyAddressor(){
        return new Addressor();
    }

    public void addEntry (Entry newEntry)throws InputMismatchException{
        ArrayList<Entry> searchResults = searchEntries(newEntry.getEmailAddress(), SearchType.EMAIL);
        if(searchResults.isEmpty()){
            myList.add(newEntry);
        } else {
            throw new InputMismatchException("Email address already in book!");
        }
    }

    public void removeEntry(String email){
        Entry searchEntry;
        try{
            searchEntry = searchEntries(email,SearchType.EMAIL).get(0);
        } catch (NullPointerException e){
            System.out.println("Error - No entry found: " + e);
            return;
        }
        if(searchEntry!=null){
            myList.remove(searchEntry);
        }
    }

    public ArrayList<Entry> searchEntries(String searchQuery){
        return myList;
    }

    public ArrayList<Entry> searchEntries(String searchQuery, SearchType searchType){
        return myList;

    }

    public void printAddressBook(){
        if(myList.isEmpty()){
            System.out.println("No entries in this address book!");
        } else{
            System.out.println("The contents of this address book:");
            for(Entry entry:myList){
                System.out.println(entry.toString());
            }
        }
    }

    public void deleteAddressBook(){
        myList.clear();
    }
}

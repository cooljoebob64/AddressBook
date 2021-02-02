package com.tts;

import com.tts.addressor.Addressor;
import com.tts.addressor.Entry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Addressor myAddressor = Addressor.createEmptyAddressor();
    private static Scanner kb = new Scanner(System.in);
    private static boolean keepGoing = true;

    public static void main(String[] args) {

        System.out.println("Hello, and welcome to the Addressor program!");

        do {
            System.out.println("1) Add an entry");
            System.out.println("2) Remove an entry");
            System.out.println("3) Search for a specific entry");
            System.out.println("4) Print address book");
            System.out.println("5) Empty address book");
            System.out.println("6) Quit");
            System.out.println("Please enter the number of an operation to perform:");
            String response = kb.nextLine();

            switch (response) {
                case "1" -> {
                    addEntry();
                }
                case "2" -> {
                    removeEntry();
                }
                case "3" -> {
                    searchEntries();
                }
                case "4" -> {
                    printAddressBook();
                }
                case "5" -> {
                    emptyAddressBook();
                }
                case "6" -> {
                    quit();
                }
                default -> {
                    System.out.println("Invalid option, please choose again!");
                    pressEnter();
                }
            }
        } while (keepGoing);
    }

    private static void addEntry() {
        System.out.println("Let's add an entry!");
        System.out.println("First name (may be empty): ");
        String entryFirstName = kb.nextLine();
        System.out.println("Last name (may be empty): ");
        String entryLastName = kb.nextLine();
        System.out.println("Phone number (may be empty): ");
        String entryPhone = kb.nextLine();
        System.out.println("Email address (may not be empty, and must be unique): ");
        String entryEmail = kb.nextLine();

        try {
            myAddressor.addEntry(Entry.createEntry(entryFirstName, entryLastName, entryPhone, entryEmail));
        } catch (InputMismatchException e){
            System.out.println("Entry not added: " + e.getMessage());
        }
        pressEnter();
    }

    private static void removeEntry() {
        System.out.println("Enter the email address of the entry you would like to remove:");
        String removeChoice = kb.nextLine();
        try {
            myAddressor.removeEntry(removeChoice);
        } catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }
        pressEnter();
    }

    private static void searchEntries() {
        System.out.println("Searching entries!");
        pressEnter();
    }

    private static void printAddressBook() {
        System.out.println("Printing address book!");
        myAddressor.printAddressBook();
        pressEnter();
    }

    private static void emptyAddressBook() {
        System.out.println("Emptying address book!");
        pressEnter();
    }

    private static void quit() {
        System.out.println("Quitting!");
        keepGoing = false;
    }

    private static void pressEnter() {
        System.out.println("Press enter to continue!");
        kb.nextLine();
    }


}

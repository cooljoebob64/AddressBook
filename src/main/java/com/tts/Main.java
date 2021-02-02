package com.tts;

import com.tts.addressor.Addressor;

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
                }
            }
        } while (keepGoing);
    }

    private static void pressEnter() {
        System.out.println("Press enter to continue!");
        kb.nextLine();
    }

    private static void addEntry() {
        System.out.println("Adding entry!");
        pressEnter();
    }

    private static void removeEntry() {
        System.out.println("Removing entry!");
        pressEnter();
    }

    private static void searchEntries() {
        System.out.println("Searching entries!");
        pressEnter();
    }

    private static void printAddressBook() {
        System.out.println("Printing address book!");
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


}


# Java Application Assignment Feb 2nd 2021

1. Present the user with a list of options to interact with the database and take in their input
    - Main file/entrypoint
    - Scanner object
    - reference to your "database"
2. Allow the user to perform the following actions:
    - Add an entry
    - Remove and entry
    - Search for a specific entry
    - Print the contents of the address book
    - Delete the contents of the address book
    - Quit the program

## Entry Structure

- All entries should be contained in a class
- Entries have the following properties:
    - `firstName`
    - `lastName`
    - `phoneNumber`
    - `emailAddress`
- All fields should be private
- override `toString()`

## Address Book Structure

_All entries will have an association with Address Book_

- Address Book should be a class of some sort.
- This class will have an `ArrayList` of type `Entry`.
- This class will have the responsibilities of adding, removing, finding, and printing out entries.
- It will also have the responsibility of quitting the program.
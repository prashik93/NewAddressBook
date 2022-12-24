package com.addressbooksystem;

import java.util.Scanner;

public class Main {
    public static MultipleAddressBook multipleAddressBook = new MultipleAddressBook();
    public static void main(String[] args) {
        userInput ();
    }

    public static void userInput () {
        Scanner scnr = new Scanner(System.in);

        int count = 0;
        while (count == 0) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("\n1.Add Address Book \n2.Add In Existing Address Book \n3.Print Address Book \n4.Edit Address Book's Contact Detail " +
                    "\n5.Delete Address Book's Contact Detail \n6.Search Persons By City Or State \n7.View Persons By City \n8.Count Persons By City Or State " +
                    "\n9.Sort Entries By Persons Name \n10.Sort Entries By City Name \n11.Sort Entries By State Name \n12.Sort Entries By Zip Code " +
                    "\n13.Write In File Using File IO \n14.Read From File Using File IO \n17.Write In File Using Json File \n18.Read From File Using Json File \n0.Exit");
            System.out.print("Enter your choice : ");
            int userChoice = scnr.nextInt();

            switch (userChoice) {
                case  AddressBookConstants.ADD_ADDRESS_BOOK :
                    multipleAddressBook.addMultipleAddressBook();
                    break;
                case AddressBookConstants.ADD_IN_EXISTING_ADDRESS_BOOK :
                    multipleAddressBook.chooseAddressBookToAddContact();
                    break;
                case AddressBookConstants.PRINT_ADDRESS_BOOK :
                    multipleAddressBook.printAddressBookMap();
                    break;
                case AddressBookConstants.EDIT_ADDRESS_BOOK :
                    multipleAddressBook.editAddressBookMap();
                    break;
                case AddressBookConstants.DELETE_ADDRESS_BOOK :
                    multipleAddressBook.deleteContact();
                    break;
                case AddressBookConstants.SEARCH_PERSONS_BY_CITY_OR_STATE :
                    multipleAddressBook.searchPersonsByCityOrState();
                    break;
                case AddressBookConstants.VIEW_PERSONS_BY_CITY :
                    multipleAddressBook.viewPersonsByCity();
                    break;
                case AddressBookConstants.COUNT_PERSONS_BY_CITY_OR_STATE :
                    multipleAddressBook.countPersonsByCityOrState();
                    break;
                case AddressBookConstants.SORT_ENTRIES_BY_PERSONS_NAME :
                    multipleAddressBook.sortEntriesByPersonsName();
                    break;
                case AddressBookConstants.SORT_ENTRIES_BY_CITY :
                    multipleAddressBook.sortEntriesByCityName();
                    break;
                case AddressBookConstants.SORT_ENTRIES_BY_STATE :
                    multipleAddressBook.sortEntriesByStateName();
                    break;
                case AddressBookConstants.SORT_ENTRIES_BY_ZIP :
                    multipleAddressBook.sortEntriesByZipCode();
                    break;
                case AddressBookConstants.WRITE_IN_FILE_USING_IO :
                    multipleAddressBook.writeInAddressBookFile();
                    break;
                case AddressBookConstants.READ_FROM_FILE_USING_IO :
                    multipleAddressBook.readFromAddressBookFile();
                    break;
                case AddressBookConstants.WRITE_IN_FILE_USING_JSON :
                    multipleAddressBook.writeInAddressBookUsingJsonFile();
                    break;
                case AddressBookConstants.READ_FROM_FILE_USING_JSON :
                    multipleAddressBook.readFromAddressBookUsingJsonFile();
                    break;
                case AddressBookConstants.EXIT :
                    count += 1;
                default :
                    System.out.println("\nPlease give valid input!");
                    break;
            }
        }
    }
}
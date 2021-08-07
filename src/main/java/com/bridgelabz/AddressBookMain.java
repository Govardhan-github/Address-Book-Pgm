package com.bridgelabz;
import java.util.Scanner;
/*
Declaring Main method Here
Defining person Object
And Printing The Contact Details
 */
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook Book = new AddressBook();
        Book.getMenu();
        Book.showContact();
    }
}

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
        Book.addContact();//Calling Add Contacts Method
        System.out.println(Book.person);
        System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                Book.editContact();
                System.out.println("You have Entered following data");
                System.out.println(Book.person);
                System.out.println("Thank you for Using the Address book");
                break;
            case 2:
                Book.deleteContact();
                System.out.println("Addess Book details :" + Book.person);
                break;
        }
    }
}
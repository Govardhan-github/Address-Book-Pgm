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
        AddressBook person = new AddressBook();
        person.addContact();//Calling Add Contacts Method
        System.out.println("Enter Y To Edit The Contact");
        String op = sc.nextLine();
        //If Condition To Edit The Contact Details Of Person
        if(op.equals("y") || op.equals("Y")){
            person.editContact();//Calling The Edit Contact Method
            System.out.println("You have Entered following data");
            System.out.println("The Contact Details After Editing : " +person);
        }
    }
}
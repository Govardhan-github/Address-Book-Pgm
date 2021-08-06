package com.bridgelabz;
//Importing java packages
import java.util.Scanner;
public class AddressBook {
    Scanner sc = new Scanner(System.in);
/*
Declaring The Add Contact Method
And Entering The Contact Details By Using Scanner Class
And Printing The Contact Details Of Person
 */
ContactDetails person = new ContactDetails();
public void addContact(){
   // ContactDetails person = new ContactDetails();
    System.out.println("Enter First Name: ");
    String firstName = sc.nextLine();
    System.out.println("Enter last Name: ");
    String lastName = sc.nextLine();
    System.out.println("Enter your addressCity: ");
    String addressCity = sc.nextLine();
    System.out.println("Enter your state: ");
    String state = sc.nextLine();
    System.out.println("Enter zip code : ");
    Long zip = sc.nextLong();
    sc.nextLine();
    System.out.println("Enter phone number: ");
    Long phoneNumber = sc.nextLong();
    sc.nextLine();
    System.out.println("Enter your EMail ID: ");
    String email = sc.nextLine();
    person.setFirstName(firstName);
    person.setLastName(lastName);
    person.setAddressCity(addressCity);
    person.setState(state);
    person.setZip(zip);
    person.setPhoneNumber(phoneNumber);
    person.setEmail(email);
    System.out.println("The Details Of Contact Is : " +person);
    }
/*
Declaring The Edit Contact Method
TO Edit The Details Of Contact
The Details Of Contact Edit By Using FirstName
If First Name Is Match The Contact Will Edit
 */
public void editContact(){
    //Scanner editName = new Scanner(System.in);
    System.out.println("Enter the firstName of person");
    String editName = sc.nextLine();
    if(editName.equalsIgnoreCase(person.getFirstName()))
        addContact();
    else
            System.out.println("The Entered First Name Is Not Match");
    editContact();
    }
}

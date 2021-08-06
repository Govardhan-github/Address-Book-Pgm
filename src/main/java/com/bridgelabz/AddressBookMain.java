package com.bridgelabz;
/*
Declaring Main method Here
Defining newContact Object
And Printing The Contact Details
 */
public class AddressBookMain {
    public static void main(String[] args) {
        ContactDetails newContact = new ContactDetails();
        newContact.setFirstName("Govardhan Reddy");
        newContact.setLastName("Bajjuri");
        newContact.setAddressCity("Kodad");
        newContact.setState("Telangana");
        newContact.setZip(508204);
        newContact.setPhoneNumber(966610767);
        newContact.setEmail("gopi1998@gmail.com");
        System.out.println("The Contact is :" +newContact);
    }
}
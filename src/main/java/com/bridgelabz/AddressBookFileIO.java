package com.bridgelabz;
/*
Importing Java Packages
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/*
Declaring AddressBook File IO Class Here
And Giving The File Name
 */
public class AddressBookFileIO {
    public static String CONTACT_FILE_NAME = "Contacts.txt";
    /*
    Declaring The WriteData Method
    To Write The Data Into The File
     */
    public void writeData(List<ContactDetails> personContactList) {
        StringBuffer empBuffer = new StringBuffer();
        personContactList.forEach(employee-> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try{
            Files.write(Paths.get(CONTACT_FILE_NAME),empBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    Declaring The Print Data Method
    To Print The Contact Data In Console
     */
    public void printData() {
        try{
            Files.lines(new File( CONTACT_FILE_NAME).toPath())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

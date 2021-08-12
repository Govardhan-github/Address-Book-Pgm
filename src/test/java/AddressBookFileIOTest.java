import com.bridgelabz.AddressBookFileIOMain;
import com.bridgelabz.ContactDetails;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
public class AddressBookFileIOTest {
    /*
    Declaring The Test Method To written The Details Into File
    Writing The Contact Data Into File
    Printing The Contact Data From The File
     */
    @Test
public void givenContactDataItShouldBeWrittenIntoFile(){
        ContactDetails[] arrayOfContacts={
                new ContactDetails("GOPI","Reddy","KOdad","Hyderabad","Telangana","508204","9666110767","gopi@gamil.com"),
        };
        AddressBookFileIOMain addressBookFileIOMain =new AddressBookFileIOMain(Arrays.asList(arrayOfContacts));
        addressBookFileIOMain.writeContactData(AddressBookFileIOMain.IOServices.FILE_IO);
        addressBookFileIOMain.printData(AddressBookFileIOMain.IOServices.FILE_IO);
    }
}

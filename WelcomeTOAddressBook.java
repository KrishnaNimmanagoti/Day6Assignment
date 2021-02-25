package day6Assignment.addressBookSystem;

import java.util.Scanner;

public class AddressBookProgramUC1 {

    private String first;
    private String last;
    private String address;
    private String city;
    private String state;
    private String phoneNumber;
    private String email;
    
    public AddressBookProgramUC1() {
        
    	first = "";
        last = "";
        address = "";
        city = "";
        state = "";
        phoneNumber = "";
        email = "";
        
   
    }
	
	public void readEntry(){
        
		System.out.println("First Name:" + first );
        System.out.println("Last Name:" + last );
        System.out.println("Address:" + address );
        System.out.println("City:" + city );
        System.out.println("State:" + state );
        System.out.println("PhoneNumber:" + phoneNumber );
        System.out.println("Email:" + email );
    
	}
	
	//Keeps track of how many entries are in the book
		 
		AddressBookProgramUC3[] contents;
		
		public void initEntries(int e){
	        
			contents = new AddressBookProgramUC3[e];
	        
			for (int i = 0; i < contents.length; i++) {      //Initializes an array of entries, then loops through to initialize each individual entry
	        
				contents[i] = new AddressBookProgramUC3();
	        
			}
			
		}
	
public static void main(String[] args) {
		
		AddressBookProgramUC3 abp = new AddressBookProgramUC3();
		
		Scanner s = new Scanner(System.in);
		
		int howManyEntries;
		
		System.out.print("How many entries in book");
	
		howManyEntries = s.nextInt();
	    
	    if (howManyEntries > 0) {
	        
	    	abp.initEntries(howManyEntries);                 //This code decides how many entries are in each book in the library
	        
	    }
	    else System.out.println("You must create at least 1 Entry.");
	    
	    for ( int i = 0; i < abp.contents.length; i++ ) {
            
        	System.out.println("===========Entry " + i + " ===========");
            abp.contents[i].readEntry(); //Accessing the array of entries INSIDE the array of books/the library
            System.out.println("================================");
        
        }
	    
	    s.close();
	}

}

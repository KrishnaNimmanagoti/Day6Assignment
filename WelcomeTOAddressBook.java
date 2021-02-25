package day6Assignment.addressBookSystem;

import java.util.Scanner;

public class AddressBookProgramUC2 {
	
	private String first;
    private String last;
    private String address;
    private String city;
    private String state;
    private String phoneNumber;
    private String email;
    
    public AddressBookProgramUC2(String first, String last, String address, String city, String state, String phoneNumber, String email) {
        
    	this.first = first;
        this.last = last;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
    
    }
    
    public AddressBookProgramUC2() {
        
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
		
	//Adds an entry to the book
	
	private int entries = 0;
	
	public void add(String first, String last, String address, String city, String state, String phoneNumber, String email){
        
		if (entries<contents.length){
        
			contents[entries] = new AddressBookProgramUC3(first, last, address, city, state, phoneNumber, email);
        
			entries++;
        
		}
		else System.out.println("Error: book is full");
    }
	
	public static void main(String[] args) {					//Main method()
		
		AddressBookProgramUC3 abp = new AddressBookProgramUC3();
		
		Scanner s = new Scanner(System.in);
		
		int howManyEntries;
		
		System.out.print("How many entries in book");
	
		howManyEntries = s.nextInt();
	    
	    if (howManyEntries > 0) {
	        
	    	abp.initEntries(howManyEntries);                 //This code decides how many entries are in each book in the library
	        
	    }
	    else System.out.println("You must create at least 1 Entry.");
	    
	    boolean done = false;
        int selection;
	    
	    while (done == false){

            for ( int i = 0; i < abp.contents.length; i++ ) {
                
            	System.out.println("===========Entry " + i + " ===========");
                abp.contents[i].readEntry(); //Accessing the array of entries INSIDE the array of books/the library
                System.out.println("================================");
            
            }
         
            System.out.println("Select an option!");
            System.out.println("1. Add an entry");
            System.out.println("2. Exit the menu");
            System.out.print("> ");
            
            selection = s.nextInt();
            String first, last, address, city, state, phoneNumber, email;
            
            switch(selection){
            case 1: 
                System.out.print("First name? ");
                first = s.next();
                System.out.print("Last name? ");
                last = s.next();
                System.out.print("Address? ");
                address = s.next();
                System.out.print("City? ");
                city = s.next();
                System.out.print("State? ");
                state = s.next();
                System.out.print("PhoneNumber? ");
                phoneNumber = s.next();
                System.out.print("Email? ");
                email = s.next();
                
                abp.add(first, last, address, city, state, phoneNumber, email);
                break;
                
            case 2:
                done = true;
                break;
            
            default:
                System.out.print("Please choose a valid menu number\n");
                
            }
            
	    }
	    
	    s.close();
	}

}

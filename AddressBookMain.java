package com.addressbook.controller;

import java.util.Scanner;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AddressBookMain entry = new AddressBookMain();
	
		System.out.println("*****Welcome to Address Book Program*****");	
	
		Character ch = 'a';
		
		while(!ch.equals('q')) {
			
			 System.out.print("\n a) Add \n b) Edit \n d) Delte \n q) Quit \nEnter a character: ");
		      ch = sc.next().charAt(0);
		      
		      switch (ch) {
		        case 'a':
		        	   entry.addContact();
		        break;
		            	
		        case 'd' : entry.deleteContact(null);
		        break;
		        
		        case 'e' : entry.editContact(null);
		        break;

		        case 'q':
		        break;

		        default:
		          System.out.println("Please enter a valid character");
		          break;

		      }
		}
	}
	
	public void addContact() {
		System.out.println("\nCreating a new contact!");
		System.out.print("Enter First Name :	");
		String firstname = sc.next();
		System.out.print("Enter Last Name :	");
		String lastname = sc.next();
		System.out.print("Enter City :	");
		String city = sc.next();
		System.out.print("Enter State :	");
		String state = sc.next();
		System.out.print("Enter zip :	");
		String zip = sc.next();
		System.out.print("Enter Phone Number :	");
		String number = sc.next();
		System.out.print("Enter Email Address :	");
		String email = sc.next();
		
		Contacts newcontact = new Contacts();
		Address address = new Address();
		newcontact.setFirstName(firstname);
		newcontact.setLastName(lastname);
		newcontact.setPhoneNumber(number);
		newcontact.setEmailID(email);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		newcontact.setAddress(address);
		displayContact(newcontact);
		editContact(newcontact);
	}
	
	public void displayContact(Contacts contact) {
		System.out.println(contact);
	}
	
	public void displayContactD(Contacts contactD) {
		System.out.println(contactD);
	}
	
	public void editContact(Contacts contact) {
		int choice = 0;
		while (choice < 1 || choice > 4) {
			System.out.println("\nWhat would you like to update?");
			System.out.println("1. Name");
			System.out.println("2. Phone Number");
			System.out.println("3. Email Id");
			System.out.println("4. Address");
			System.out.print("\nEnter your choice : ");
			choice = sc.nextInt();
			
			if (!(choice >=1 && choice <= 4))
				System.out.println("\nInvalid choice!\nPlease try again.\n");
		}
		
		switch (choice) {
		case 1 :
			System.out.print("Enter the updated First Name :	");
			String firstname = sc.next();
			System.out.print("Enter the updated Last Name :	");
			String lastname = sc.next();
			contact.setFirstName(firstname);
			contact.setLastName(lastname);
			break;
			
		case 2 :
			System.out.print("Enter the updated Phone Number :	");
			String number = sc.next();
			contact.setPhoneNumber(number);
			break;
			
		case 3 :
			System.out.print("Enter the updated Email Address :	");
			String email = sc.next();
			contact.setEmailID(email);
			break;
			
		case 4 :
			System.out.print("Enter the updated City :	");
			String city = sc.next();
			System.out.print("Enter the updated State :	");
			String state = sc.next();
			System.out.print("Enter the updated zip :	");
			String zip = sc.next();
			contact.address.setCity(city);
			contact.address.setState(state);
			contact.address.setZip(zip);
			break;
		}
		
		System.out.println("\nIs there anything else you'd like to update?");
		System.out.print("Enter 'Y' or 'N' : ");
		char continueEdit = sc.next().charAt(0);
		if (continueEdit == 'Y' || continueEdit == 'y') {
			editContact(contact);

		}
		else if (continueEdit == 'N' || continueEdit == 'n') {
			System.out.println("\n\nHere is the updated Address Book.");
			displayContact(contact);
		}
		else {
			System.out.println("\nInvalid Input.\nPlease try again!");
		}
	}
	
	public void deleteContact(Contacts contactD) {
		
		int ch = 0;
		while (ch < 1 || ch > 4) {
			System.out.println("\nWhat would you like to delete?");
			System.out.println("1. Name");
			System.out.println("2. Phone Number");
			System.out.println("3. Email Id");
			System.out.println("4. Address");
			System.out.print("\nEnter your choice : ");
			ch = sc.nextInt();
			
			if (!(ch >=1 && ch <= 4))
				System.out.println("\nInvalid choice!\nPlease try again.\n");
		}
		
		switch (ch) {
		case 1 :
			System.out.print("Name deleted!");
			contactD.setFirstName("deleted");
			contactD.setLastName("deleted");
			break;
			
		case 2 :
			System.out.print("Phone number deleted!");
			contactD.setPhoneNumber("deleted");
			break;
			
		case 3 :
			System.out.print("Email deleted!");
			contactD.setEmailID("deleted");
			break;
			
		case 4 :
			System.out.print("Address deleted!");

			contactD.address.setCity("deleted");
			contactD.address.setState("deleted");
			contactD.address.setZip("deleted");
			break;
		}
		System.out.println("\nIs there anything else you'd like to delete?");
		System.out.print("Enter 'Y' or 'N' : ");
		char continueEdit = sc.next().charAt(0);
		if (continueEdit == 'Y' || continueEdit == 'y') {
			deleteContact(contactD);

		}
		else if (continueEdit == 'N' || continueEdit == 'n') {
			System.out.println("\n\nHere is the updated Address Book.");
			displayContact(contactD);
		}
		else {
			System.out.println("\nInvalid Input.\nPlease try again!");
		}
	}

}
		

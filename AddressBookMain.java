package com.addressbook.controller;

import java.util.Scanner;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AddressBookMain entry = new AddressBookMain();
	
		System.out.println("Welcome to Address Book Program in Java!");
		System.out.println("You can create Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");
	
		entry.addContact();
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

}
		
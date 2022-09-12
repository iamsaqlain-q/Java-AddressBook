package com.addressbook.controller;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		Character ch = 'a';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** Welcome to Address Book program *****");
		
		while(!ch.equals('q')) {
			
			 System.out.print("\na) Add \nq) Quit \nEnter a character: ");
		      ch = sc.next().charAt(0);
		      
		      switch (ch) {
		        case 'a':
		        	AddressBookServices con = new AddressBookServiceImpl();
		            con.createContact();
		            System.out.println("Added person's details : ");
		            con.displayContact();
		          break;

		        case 'q':
		          break;

		        default:
		          System.out.println("Please enter a valid character");
		          break;

		      }
		}
		
		sc.close();
		
	}

}

interface AddressBookServices{
	
	public void createContact();
	public void displayContact();
}

class AddressBookServiceImpl implements AddressBookServices{
	
	Scanner sc = new Scanner(System.in);
	Contacts con = new Contacts();
	
	@Override
	public void createContact() {
	
		System.out.println("Enter First Name : ");
		con.setFirstN(sc.nextLine());
		
		System.out.println("Enter Last Name : ");
		con.setLastN(sc.nextLine());
		
		System.out.println("Address : ");
		con.setAddress(sc.nextLine());
		
		System.out.println("City : ");
		con.setCity(sc.nextLine());
		
		System.out.println("State : ");
		con.setState(sc.nextLine());
		
		System.out.println("E-mail : ");
		con.setEmail(sc.nextLine());
		
		System.out.println("Zip : ");
		con.setZip(sc.nextInt());
		
		System.out.println("Phone Number : ");
		con.setPhN(sc.nextInt());
		
		
		
	}

	@Override
	public void displayContact() {
		
		System.out.println("First Name : " + con.getFirstN());
		System.out.println("Last Name : " + con.getLastN());
		System.out.println("Address : " + con.getAddress());
		System.out.println("City : " + con.getCity());
		System.out.println("State : " + con.getState());
		System.out.println("E-mail : " + con.getEmail());
		System.out.println("Zip : " + con.getZip());
		System.out.println("Phone Number : " + con.getPhN());
		
	}
	
	
}
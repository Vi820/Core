package com.bankmodule;

import java.util.Scanner;

public class Login {
	Scanner sc=new Scanner(System.in);
		
	 void login() {
		
			
	}
	
	void reg() {
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the password");
		int pass=(74)+sc.nextInt();
		System.out.println("Enter the AccountType");
		String accounttype=sc.next();
		System.out.println("Enter the EmailID");
		String emailid=sc.next();
		System.out.println("Enter the ContactNumber");
		String contactno=sc.next();
		
		
		
		
	}
	
	void execute() {
	System.out.println("Enter  1 for Login and 2 for Reg 0 for exit");
	int choice=sc.nextInt();
		do {
			switch (choice) {
			case 1:
				System.out.println("Welecome to My Login");
				
				break;
			case 2:
				System.out.println("Welecome to My Registration");
				
				break;
			
			default:
				break;
			}
			
		} while (choice!=0);
		System.out.println("this method is Exit");
	}
	
	public static void main(String[] args) {
			Login lg=new Login();
			lg.execute();
	}

}

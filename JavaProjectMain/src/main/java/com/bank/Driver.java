package com.bank;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		
		String nn = input.nextLine();
		System.out.println("Enter Account Number: ");
		int num = input.nextInt();
		System.out.println("Enter Account Type: ");
		String type = input.next();
		System.out.println("Enter Initial Balance: ");
		int bal = input.nextInt();
		Transactions b1 = new Transactions(nn, num, type, bal);
		int menu;
		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Exit");
		boolean quit = false;
		do {
			System.out.print("Please enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				b1.deposit();
				break;

			case 2:
				b1.withdraw();
				break;

			case 3:
				b1.display();
				break;

			case 4:
				quit = true;
				break;
			}
		} while (!quit);
	}
	        
	        
	    }





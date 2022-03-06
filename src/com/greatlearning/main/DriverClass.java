/**
 * 
 */
package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;

/**
 * @author rahulkumar
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//have the dependency object here
		Banking banking= new Banking();
		
		//1. Welcome Message
		System.out.println("Welcome to the LogIn Page");
		System.out.println();
		System.out.println("Enter the Bank Account No.");
		Scanner sc=new Scanner(System.in);
		
		String bankAccountNo;
		bankAccountNo=sc.nextLine();
		
		System.out.println("Enter the Password for the corresponding Bank Account");
		
		String password;
		password=sc.nextLine();
		
		Customer customer1= new Customer("HDFC000123", "greatlearning");
		//check the bank account and password is correct or not
		if(customer1.getBankAccountNo().equals(bankAccountNo) && customer1.getPassword().equals(password)) {
			//now we have verified the bank account number and password, we can proceed for banking operation
			System.out.println("Welcome to the first Indian Bank");
			int option;
			do {
				System.out.println();
				System.out.println("----------------------------------------");
				System.out.println("Enter the operation you want to perform");
				System.out.println("1. Deposite");
				System.out.println("2. WithDraw");
				System.out.println("3. Transfer");
				System.out.println("4. Log Out");
				System.out.println("----------------------------------------");
				
				option=sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("performing Deposite option");
					banking.deposite();
					break;
				case 2:
					System.out.println("performing Withdraw option");
					banking.withdraw();
					break;
				case 3:
					System.out.println("performing Transfer option");
					banking.transfer();
					break;
				default:
					System.out.println("Try again, Enter a valid option");
				}
			}while(option!=4);
		}else {
			System.out.println("Invalid bank account no. or password, try again");
		}
		
		
		System.out.println("Exiting banking Application");
		sc.close();

	}

}

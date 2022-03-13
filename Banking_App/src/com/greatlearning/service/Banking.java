package com.greatlearning.service;

import java.util.Scanner;

/*
 * withdraw
 * deposit
 * tranfer (otp generation)
 * */
public class Banking {
	OTPGenerator otpGenerator= new OTPGenerator();
	int bankBalance=1000;
	Scanner sc = new Scanner(System.in);
	
	public void deposite() {
		System.out.println("Enter the amount you want to deposite");
		int amount;
		amount=sc.nextInt();
		if(amount>0) {
			bankBalance=bankBalance+amount;
			System.out.println("Amount: "+amount+" got succesfully deposited");
			System.out.println("Total Balance: "+bankBalance);
		}else {
			System.out.println("Enter a correct amount");
		}
		
		
	}
	
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw");
		int amount;
		amount=sc.nextInt();
		if(amount<=bankBalance) {
			bankBalance=bankBalance - amount;
			System.out.println("Amount: "+amount+" got succesfully withdrawn");
			System.out.println("Total Balance: "+bankBalance);
		}else {
			System.out.println("Enter a correct amount");
		}
	}
	
	
	public void transfer() {
		int amount;
		int bankAccount;
		int generatedOTP;
		generatedOTP=otpGenerator.generateOTP();
		System.out.println(generatedOTP);
		
		System.out.println("Enter the otp for verification");
		int otp;
		otp=sc.nextInt();
		
		if(otp==generatedOTP) {
			System.out.println("OTP verified Successfully");
			System.out.println("Enter the amount and bankAccount no. to which you want to transfer");
			amount=sc.nextInt();
			bankAccount=sc.nextInt();
			if(amount<=bankBalance) {
				bankBalance=bankBalance - amount;
				System.out.println("Amount: "+amount+" got succesfully transfered to "+bankAccount);
				System.out.println("Remainig Balance: "+bankBalance);
			}else {
				System.out.println("Insufficient Fund");
			}
			
		}else {
			System.out.println("Invalid OTP, try again");
		}
	}
}

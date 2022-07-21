package com.account;

import java.util.Scanner;

public class Account {
	
	
	public float debit(int withdrawAmmount, float accountBalance) {
		if(withdrawAmmount <= accountBalance)
		{
			accountBalance= accountBalance-withdrawAmmount;
			System.out.println("Current account balance :"+accountBalance);
		}
		else if (withdrawAmmount > accountBalance) 
			System.out.println(" Debit amount exceeded account balance .");  // or  your account balance is : "+accountBalance+ "which is smaller than withdraw ammount" );
	return accountBalance;
	}
	public static void main(String [] args) {
		Account account = new Account();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Withdraw Ammount : ");
		int withdrawAmmount = scanner.nextInt();
		account.debit(withdrawAmmount , 190000F);
		scanner.close();
	}
}

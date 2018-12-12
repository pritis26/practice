package org.priti.springframework;

public class BankAccountController {
	public double withdraw(long accountId, double balance){
	System.out.println();
	return balance;
	}
	
	public double deposit(long accountId, double balance){
		System.out.println();
		return balance;
	}
	public double getBalance(long accountId){
		System.out.println();
		return accountId;
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amont){
		System.out.println();
		return false;
	}
}

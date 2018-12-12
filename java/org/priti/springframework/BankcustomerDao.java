package org.priti.springframework;

import java.util.ArrayList;

public class BankcustomerDao {
	ArrayList<BankAccount> bankUsers = null;

	public BankcustomerDao() {
		bankUsers = new ArrayList<BankAccount>();
		bankUsers.add(new BankAccount(123, "Suraj", "Savings", 100000));
		bankUsers.add(new BankAccount(456, "Vidya", "Salary", 120000));
		bankUsers.add(new BankAccount(789, "Manish", "Current", 152));
		bankUsers.add(new BankAccount(255, "Poojitha", "Savings", 15000));
	}

	public ArrayList<BankAccount> getAllBankUserlist() {
		return bankUsers;
	}
} 


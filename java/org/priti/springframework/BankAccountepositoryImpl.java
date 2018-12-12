package org.priti.springframework;

import java.util.ArrayList;

public class BankAccountepositoryImpl implements BankAccountRepository{



BankcustomerDao dao = new BankcustomerDao();
	ArrayList<BankAccount> bankUserslist = null;
	
	public BankAccountepositoryImpl() {
		bankUserslist = dao.getAllBankUserlist();
		
	} 
@Override
	public double getBalance(long accountId) {
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBalance();
			}
		}
		return x;
	} 
@Override
	public double updateBalance(long accountId, double newBalance) {
		double x = 0;
		for (BankAccount index : bankUserslist) {
			if (index.getAccountId() == accountId) {
				x = index.getAccountBalance();
			}
		}
		x = newBalance;
		return x;

	} }

 

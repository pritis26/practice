package org.priti.springframework;

public class BankAccount {
	
	long accountId;
	String ccountHolderName;
	String accountType;
	double accountBalance;
	public BankAccount(){
		
	}
	public BankAccount(int accountId, String ccountHolderName,
			String accountType, long accountBalance) {
		super();
		this.accountId = accountId;
		this.ccountHolderName = ccountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getCcountHolderName() {
		return ccountHolderName;
	}
	public void setCcountHolderName(String ccountHolderName) {
		this.ccountHolderName = ccountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", ccountHolderName="
				+ ccountHolderName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}
	
}

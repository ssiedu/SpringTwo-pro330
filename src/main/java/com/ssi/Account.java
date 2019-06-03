package com.ssi;

public class Account {
	private String accountNo;
	private String cname;
	private double balance;
	private Address address;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void showAccountInfo(){
		System.out.println(accountNo+","+cname+","+balance+","+address);
	}
	public void deposit(int amount){
		balance=balance+amount;
	}
	public void withdraw(int amount){
		balance=balance-amount;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}

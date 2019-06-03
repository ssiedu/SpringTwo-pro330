package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankingApplication {

	Account account;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void doDeposit(int amount){
		account.deposit(amount);
	}
	public void doWithdraw(int amount){
		account.withdraw(amount);
	}
	public void accountInfo(){
		account.showAccountInfo();
	}
	
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
	
		BankingApplication app=context.getBean("bankingApp",BankingApplication.class);
		app.accountInfo();
		//app.doDeposit(50000);
		//app.accountInfo();
		//app.doWithdraw(25000);
		//app.accountInfo();
		
		
		

	}

}

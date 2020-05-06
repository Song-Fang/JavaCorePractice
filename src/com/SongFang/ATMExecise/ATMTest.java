package com.SongFang.ATMExecise;

public class ATMTest {
	public static void main(String[] args) {
		Account account = new Account(1,"SongFang",1000,0.25);
		account.deposite(1000);
		account.withdraw(500);
		//System.out.println(account.getBalance());
		
		Account subAccount = new CheckAccount(1,"SongFang",1000,0.25);
		System.out.println(subAccount.getBalance());
		subAccount.withdraw(5000);
		System.out.println(subAccount.getBalance());
		System.out.println(((CheckAccount)subAccount).getOverDraft());
		//need a parentheses
		subAccount.withdraw(20000);
		System.out.println(((CheckAccount)subAccount).getOverDraft());
		subAccount.withdraw(12000);
		System.out.println(((CheckAccount)subAccount).getOverDraft());
		System.out.println(subAccount.getBalance());
		subAccount.deposite(20000);
		System.out.println(((CheckAccount)subAccount).getOverDraft());
		System.out.println(subAccount.getBalance());
		
	}
}

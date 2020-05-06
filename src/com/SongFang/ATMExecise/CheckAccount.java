package com.SongFang.ATMExecise;

public class CheckAccount extends Account{
	private int overDraft;
	
	public CheckAccount(int id,String name,int balance,double monthlyRate) {
		super(id,name,balance,monthlyRate);
		this.overDraft= 20000;
	}
	
	public void deposite(int money) {
		if(getOverDraft()+money<=20000) {
			setOverDraft(getOverDraft()+money);
		}else {
			super.deposite(money-(20000-getOverDraft()));
			setOverDraft(20000);
		}
	}
	
	@Override
	public void withdraw(int money) {
		if(money<=getBalance()) {
			super.withdraw(money);
		}else if(money-getBalance()<overDraft) {
			overDraft -=money-getBalance();
			setBalance(0);
		}else {
			System.out.println("Balance is not enough!");
		}
	}

	public int getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(int overDraft) {
		this.overDraft = overDraft;
	}
	
	
	
}

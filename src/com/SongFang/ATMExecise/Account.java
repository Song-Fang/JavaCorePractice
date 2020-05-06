package com.SongFang.ATMExecise;

public class Account {
	private int id;
	private String name;
	private int balance;
	private double monthlyInterest;
	
	
	public Account(int id, String name, int balance,double monthlyInterest) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.monthlyInterest = monthlyInterest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getMonthlyInterest() {
		return monthlyInterest;
	}

	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	
	public void withdraw(int money) {
		if(money<=balance) {
			balance -= money;
		}else {
			System.out.println("No enough balance!");
		}
	}
	
	public void deposite(int money) {
		balance += money;
	}
	
}

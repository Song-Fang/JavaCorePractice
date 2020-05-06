package com.SongFang.Inheritation;

public class Human {
	String name;
	
	public Human() {
		System.out.println("I am your Sugar Daddy!");
	}
	
	public Human(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("It's time to have lunch!");
	}
	
	public void testThrow() {
		System.out.println("I am super class override!");
	}
	
}

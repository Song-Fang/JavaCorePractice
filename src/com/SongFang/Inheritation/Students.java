package com.SongFang.Inheritation;

public class Students extends Human{
	private int id;
	
	public Students() {
		
	}
	
	public Students(String name,int id) {
		this.id = id;
	}
	
	public void study() {
		super.eat();
		System.out.println("It is time to study "+id+":"+name);
	}
	
	@Override
	public void testThrow() throws ArithmeticException{
		System.out.println(1/0);
	}
}

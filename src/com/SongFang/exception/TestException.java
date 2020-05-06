package com.SongFang.exception;

public class TestException {
	public static void main(String [] args) {
		Student s = null;
		try {
			s = new Student(20);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//Beware of null pointer exception
			System.out.println(s);
		}
	}
}


class Student{
	private int id;
	private int age;
	
	public Student(int age){
		if(age>20) {
			this.age = age;
		}else {
			throw new MyException("So young!");
		}
	}
	
	public String toString() {
		return "id: "+id+","+"age: "+age;
	}
}

class MyException extends RuntimeException{
	static final long serialVersionUID = -789183193913l;
	
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
	}
	
}

package com.SongFang.exception;

public class Execise {
	public static void main(String [] args) {
		try {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println(divid(i,j));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divid(int i,int j) {
		if(i<0||j<0) {
			throw new MyException("invalid input, input number is less than 0");
		}
		return i/j;
	}
}





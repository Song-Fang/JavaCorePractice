package com.SongFang.Inheritation;

public class TestSuper {
	public static void main(String[] args) {
		Students s = new Students();
		try {
			s.testThrow();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

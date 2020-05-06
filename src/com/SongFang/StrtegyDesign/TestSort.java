package com.SongFang.StrtegyDesign;

import java.util.Arrays;
import java.util.Comparator;

public class TestSort {
	public static void main(String[] args) {
		Employee [] e = {
			new Employee(1,22,3000,"SongFang"),
			new Employee(2,26,4000,"ZhangSan"),
			new Employee(3,56,5000,"Peter")
		};
//		Arrays.sort(e,new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				return e2.getAge()-e1.getAge();
//			}		
//		});
		
		Arrays.sort(e,(e1,e2)->e2.getAge()-e1.getAge());
		
		System.out.println(e[0]);
		System.out.println(e[1]);
	}
}

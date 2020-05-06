package com.SongFang.StrtegyDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFilter {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee[] {
				new Employee(1,15,30000,"SongFang"),
				new Employee(2,22,4000,"ZhangSan"),
				new Employee(3,24,2000,"Peter")
				});
		//List<Employee> filterResult = filterSalary(list);
		Filter<Employee> fb = new FilterBySalary();
		List<Employee> filterResult = filter(list,fb);
		System.out.println(filterResult);
		
		//polymorphism
		List<Employee> filterResultByAge = filter(list,new Filter<Employee>() {
			@Override
			public boolean filter(Employee e) {
				// TODO Auto-generated method stub
				if(e.getAge()<18) return false;
				return true;
			}		
		});
		//System.out.println(filterResultByAge);
		
		List<Employee> filterResultByAge2 = filter(list,e->e.getAge()<18?false:true);
		System.out.println(filterResultByAge2);
		
	}
	
	//polymorphism
	public static List<Employee> filterSalary(List<Employee> list) {
		List<Employee> result = new ArrayList<Employee>();
		for(Employee em:list) {
			if(em.getSalary()>3000) {
				result.add(em);
			}
		}
		
		return result;
	}
	
	public static List<Employee> filter(List<Employee> list,Filter<Employee> fb){
		List<Employee> result = new ArrayList<>();
		for(Employee em:list) {
			if(fb.filter(em)) {
				result.add(em);
			}
		}
		return result;
	}
	
	
}

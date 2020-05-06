package com.SongFang.StrtegyDesign;

public class FilterBySalary implements Filter<Employee>{

	@Override
	public boolean filter(Employee e) {
		// TODO Auto-generated method stub
		if(e.getSalary()>3000) return true;
		return false;
	}

}

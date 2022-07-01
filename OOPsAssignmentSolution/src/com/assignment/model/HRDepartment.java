package com.assignment.model;

public class HRDepartment extends SuperDepartment {
	public HRDepartment(){
		System.out.println("Welcome to "+departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	
	String departmentName() {
		return "HR Department"; 
	}
	
	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String doActivity() {
		return "team Lunch";
	}
}

package com.assignment.model;

public class AdminDepartment extends SuperDepartment {
	public AdminDepartment(){
		System.out.println(" Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	
	String departmentName() {
		return "Admin Department"; 
	}
	
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
}

package com.gl.main;

import com.gl.admin.AdminDepartment;
import com.gl.hr.HrDepartment;
import com.gl.tech.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment obj = new AdminDepartment();
		System.out.println("Welcome to " + obj.departmentName());
		System.out.println(obj.getTodaysWork());
		System.out.println(obj.getWorkDeadline());
		System.out.println(obj.isTodayHoliday());

		HrDepartment obj1 = new HrDepartment();
		System.out.println("\n\nWelcome to " + obj1.departmentName());
		System.out.println(obj1.doActivity());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayHoliday());
		
		TechDepartment obj2 = new TechDepartment();
		System.out.println("\n\nWelcome to " + obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.getTechStackInformation());
		System.out.println(obj2.isTodayHoliday());

	}

}

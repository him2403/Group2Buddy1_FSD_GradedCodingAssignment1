package com.gl.superdepartment;

public class SuperDepartment {

	String dname, work, deadline, holiday;

	public String departmentName() {

		dname = "Super Department";
		return dname;
	}

	public String getTodaysWork() {

		work = "No Work as of now";
		return work;

	}

	public String getWorkDeadline() {

		deadline = "Nil";
		return deadline;

	}

	public String isTodayHoliday() {

		return holiday = "Today is not a Holiday";

	}

}

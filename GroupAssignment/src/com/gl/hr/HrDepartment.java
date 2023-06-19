package com.gl.hr;

import com.gl.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	String dname, work, deadline, activity;

	public String departmentName() {

		dname = "HR Department";
		return dname;
	}

	public String doActivity() {

		return activity = "team Lunch";
	}

	public String getTodaysWork() {

		work = "Fill todays timesheet and mark your attendance";
		return work;

	}

	public String getWorkDeadline() {

		deadline = "Complete by EOD";
		return deadline;

	}

}

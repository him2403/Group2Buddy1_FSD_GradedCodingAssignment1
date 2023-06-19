package com.gl.admin;

import com.gl.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	String dname, work, deadline;

	public String departmentName() {

		dname = "Admin Department";
		return dname;
	}

	public String getTodaysWork() {

		work = "Complete your documents submission";
		return work;

	}

	public String getWorkDeadline() {

		deadline = "Complete by EOD";
		return deadline;

	}

}

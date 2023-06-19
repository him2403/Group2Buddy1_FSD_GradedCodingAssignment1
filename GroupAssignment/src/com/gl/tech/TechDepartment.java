package com.gl.tech;

import com.gl.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	String dname, work, deadline, info;

	public String departmentName() {

		dname = "Tech Department";
		return dname;
	}

	public String getTodaysWork() {

		work = "Complete coding of Module 1";
		return work;

	}

	public String getWorkDeadline() {

		deadline = "Complete by EOD";
		return deadline;

	}

	public String getTechStackInformation() {

		return info = "core Java";
	}

}

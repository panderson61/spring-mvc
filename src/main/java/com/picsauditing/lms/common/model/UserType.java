package com.picsauditing.lms.common.model;

public enum UserType {

	EMPLOYEE("employee"),
	LMS_ADMIN("lmsAdmin"),
	PICS_ADMIN("picsAdmin");

	String type;

	UserType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

package com.picsauditing.lms.common.model;


public class EmployeeResourceAssignment {

	private long trainingResourceId;

	private TrainingResourceType trainingResourceType;

	private Long userId;

	private long employeeId;

	public long getTrainingResourceId() {
		return trainingResourceId;
	}

	public void setTrainingResourceId(long trainingResourceId) {
		this.trainingResourceId = trainingResourceId;
	}

	public TrainingResourceType getTrainingResourceType() {
		return trainingResourceType;
	}

	public void setTrainingResourceType(TrainingResourceType trainingResourceType) {
		this.trainingResourceType = trainingResourceType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}

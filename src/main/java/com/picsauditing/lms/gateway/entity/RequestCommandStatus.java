package com.picsauditing.lms.gateway.entity;

import java.util.Date;

public class RequestCommandStatus {

	private int id;
	private int commandId;
	private Date timestamp;
	private CommandStatus commandStatus;
	private String errorMessage;

}

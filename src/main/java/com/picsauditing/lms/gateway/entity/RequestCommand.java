package com.picsauditing.lms.gateway.entity;

import com.picsauditing.lms.gateway.model.Command;

import java.util.Date;

public class RequestCommand {

	private int id;
	private String requestId;
	private String referenceId;
	private Date dateSent;
	private Command command;
	private String payload;

}

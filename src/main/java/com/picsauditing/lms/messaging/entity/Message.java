package com.picsauditing.lms.messaging.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date timestamp;

	protected String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

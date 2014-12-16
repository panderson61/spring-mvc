package com.picsauditing.lms.gateway.model;

import java.util.List;

public class Message {

	private Long id;

	private List<Payload> payloads;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Payload> getPayloads() {
		return payloads;
	}

	public void setPayloads(List<Payload> payloads) {
		this.payloads = payloads;
	}
}

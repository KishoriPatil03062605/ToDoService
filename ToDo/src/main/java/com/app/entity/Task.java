package com.app.entity;

import javax.annotation.Generated;

import org.springframework.data.mongodb.core.mapping.Document;

import com.app.entity.constants.Status;

@Document(collection = "task")
public class Task {
	
	private String value;
	
	private Status status;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}

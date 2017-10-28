package com.app.entity.constants;

public enum Status {

	PENDING("pending"), COMPLETED("completed");

	Status(String val){
		this.val = val;
	}
	public String getVal() {
		return val;
	}
	private String val;

}

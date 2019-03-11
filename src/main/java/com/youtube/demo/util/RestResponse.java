package com.youtube.demo.util;

public class RestResponse {
	private Integer responceCode;
	private String message;
	
	public RestResponse(Integer responseCode) {
		super();
		this.responceCode = responseCode;
	}
	
	
	
	public RestResponse(Integer responceCode, String message) {
		super();
		this.responceCode = responceCode;
		this.message = message;
	}



	public Integer getResponceCode() {
		return responceCode;
	}
	public void setResponceCode(Integer responceCode) {
		this.responceCode = responceCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}

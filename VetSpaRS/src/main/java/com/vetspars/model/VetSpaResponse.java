package com.vetspars.model;

public class VetSpaResponse<T> {
	
	private int responseCode;
	private String responseMessage;
	private T response;
	
	public VetSpaResponse(int responseCode, String responseMessage, T response) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.response = response;
	}

	public VetSpaResponse() {
	}
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
}

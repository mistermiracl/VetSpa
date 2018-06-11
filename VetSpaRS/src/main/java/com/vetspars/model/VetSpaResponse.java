package com.vetspars.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.vetspars.constant.ResponseCode;

@XmlRootElement
public class VetSpaResponse<T> {
	
	private ResponseCode responseCode;
	private String responseMessage;
	private T response;
	
	public VetSpaResponse(ResponseCode responseCode, String responseMessage, T response) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
		this.response = response;
	}

	public VetSpaResponse() {
	}
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(ResponseCode responseCode) {
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

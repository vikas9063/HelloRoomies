package com.vikky.roomie.util;

public class ResponseMessage {

	private String message;
	private String messageType;
	private String messageDesc;

	public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseMessage(String message, String messageType, String messageDesc) {
		super();
		this.message = message;
		this.messageType = messageType;
		this.messageDesc = messageDesc;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageDesc() {
		return messageDesc;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

}

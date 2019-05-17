package br.com.toyota.ws.tdbmonitor.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Message {
	
	@JsonAlias({ "message_status"})
	private String messageStatus;
	
	@JsonAlias({ "message"})
	private String messageContent;

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
}

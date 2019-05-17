package br.com.toyota.ws.tdbmonitor.rest.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import br.com.toyota.ws.tdbmonitor.model.Message;

public class WrapupLogDTO {
	
	@JsonAlias({ "id"})
	private String id;
	
	@JsonAlias({ "execution_status"})
	private String executionStatus;
	
	@JsonAlias({ "execution_end_date"})
	private Date executionEndDate;
	
	@JsonAlias({ "messages"})
	private List<Message> logMessages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExecutionStatus() {
		return executionStatus;
	}

	public void setExecutionStatus(String executionStatus) {
		this.executionStatus = executionStatus;
	}

	public Date getExecutionEndDate() {
		return executionEndDate;
	}

	public void setExecutionEndDate(Date executionEndDate) {
		this.executionEndDate = executionEndDate;
	}

	public List<Message> getLogMessages() {
		return logMessages;
	}

	public void setLogMessages(List<Message> logMessages) {
		this.logMessages = logMessages;
	}
}

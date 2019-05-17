package br.com.toyota.ws.tdbmonitor.rest.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class StartupLogDTO {
	
	@JsonAlias({ "id"})
	private String id;
	
	@JsonAlias({ "execution_start_date"})
	private String executionStartDate;
	
	@JsonAlias({ "interface_name"})
	private String interfaceName;
	
	@JsonAlias({ "dealer_id"})
	private Integer dealerId;
	
	@JsonAlias({ "file_name"})
	private String fileName;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getExecutionStartDate() {
		return executionStartDate;
	}
	
	public void setExecutionStartDate(String executionStartDate) {
		this.executionStartDate = executionStartDate;
	}
	
	public String getInterfaceName() {
		return interfaceName;
	}
	
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	
	public Integer getDealerId() {
		return dealerId;
	}
	
	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}

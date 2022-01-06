package com.bricolage.demo.dto;



public class OffreRequest {
	
    private Long id_user;
	private String jobName;
	private String contents;
	
	public OffreRequest() {
		super();
	}
	
	public OffreRequest(Long id_user, String jobName, String contents) {
		super();
		this.id_user = id_user;
		this.jobName = jobName;
		this.contents = contents;
	}
	
	public Long getId_user() {
		return id_user;
	}
	
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
}

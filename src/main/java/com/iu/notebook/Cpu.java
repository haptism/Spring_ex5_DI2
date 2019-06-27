package com.iu.notebook;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
	
	private String core;
	private String company;
	
	public Cpu(String core, String company) {
		this.core=core;
		this.company=company;
	}
	
	public Cpu() {
		// TODO Auto-generated constructor stub
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	

}

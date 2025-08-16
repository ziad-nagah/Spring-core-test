package com.spring.core;

public class IOCService {
	
	private SchoolService schoolService ;
	private String name;
	
	public IOCService (SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	void startApp(){
		schoolService.printData();
	}
	public void setSchoolService(SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	

}

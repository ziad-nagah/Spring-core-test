package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IOCService {
	
	private SchoolService schoolService ;
	private String name;
	
	public IOCService (/*@Qualifier("Student")*/ SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	void startApp(){
		schoolService.printData();
	}
	@Autowired
	public void setSchoolService(@Qualifier("Student") SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	

}

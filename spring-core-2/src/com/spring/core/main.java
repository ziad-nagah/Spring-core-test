package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.StudentService;

public class main {
	public static void main (String[] args){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService studentService =
				classPathXmlApplicationContext.getBean("Student", StudentService.class);
				studentService.printData();
				System.out.println(studentService.getName());
				
				IOCService iocService = classPathXmlApplicationContext.getBean("IOCService", IOCService.class);
				iocService.startApp();
				classPathXmlApplicationContext.close();
				
				
				
				
				
	}

}

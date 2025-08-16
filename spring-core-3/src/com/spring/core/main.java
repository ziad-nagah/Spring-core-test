package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.StudentService;

public class main {
	public static void main (String[] args){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		StudentService studentService =
                                      applicationContext.getBean("Student", StudentService.class);
		TeacherService teacherservice = 
				                        applicationContext.getBean("Teacher", TeacherService.class);
		IOCService iocService =         
				                        applicationContext.getBean("IOCService", IOCService.class);
			
				
				
				iocService.startApp();
				
				teacherservice.printData();
				
				studentService.printData();
				System.out.println(studentService.getName());	
			    
				applicationContext.close();
				
				
				
				
				
	}

}

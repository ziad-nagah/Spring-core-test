package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.StudentService;

public class main {
	public static void main (String[] args){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService studentService =
				classPathXmlApplicationContext.getBean("studentService", StudentService.class);
				studentService.printData();
				System.out.println(studentService.getName());
				StudentService studentService1 =
						classPathXmlApplicationContext.getBean("studentService", StudentService.class);
						studentService1.printData();
						System.out.println(studentService1 == studentService);
						classPathXmlApplicationContext.close();
//		TeacherService teacherService = classPathXmlApplicationContext.getBean("teacherService", TeacherService.class);
//		teacherService.printData();
//		IOCService iocService = classPathXmlApplicationContext.getBean("iOCService", IOCService.class);
//		iocService.startApp();
//		System.out.println(iocService.getName());
	}

}

package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.core")
@PropertySource("classpath:data.properties")
public class SpringConfig {
//	@Bean
//	public StudentService initStudentService() {
//		
//		return new StudentService();
//	}
	
	@Bean("Teacher")
	public TeacherService initTeacherService() {
		
		return new TeacherService();
	}

}

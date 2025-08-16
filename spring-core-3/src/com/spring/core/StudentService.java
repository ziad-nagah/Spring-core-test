package com.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Student")
@Scope("prototype")
public class StudentService implements SchoolService {
@Value("${app.name}")
private String name;
private boolean connection ;
@Override
public void printData() {
	if(connection)
		System.out.println("hi Student");
	else
		System.out.println("no connection");
}
@PostConstruct
void openConnection() {
	System.out.println("connected");
	connection = true;
}
@PreDestroy                                 // search3
void closeConnection() {
	System.out.println("disconnected");
	connection = false;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}

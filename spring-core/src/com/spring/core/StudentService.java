package com.spring.core;

public class StudentService implements SchoolService {

private String name;
private boolean connection ;
@Override
public void printData() {
	if(connection)
		System.out.println("hi Student");
	else
		System.out.println("no connection");
}
void openConnection() {
	System.out.println("connected");
	connection = true;
}
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

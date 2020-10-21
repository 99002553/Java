package com.ltts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
 String name;
 int stId;
 String dept;
 Course course;
 @Autowired
public Student(Course course) {
	super();
	this.course = course;
}
public String getName() {
	return name;
}
@Value("${student.name}")
public void setName(String name) {
	this.name = name;
}
public int getStId() {
	return stId;
}
@Value("${student.stId}")
public void setStId(int stId) {
	this.stId = stId;
}
public String getDept() {
	return dept;
}
@Value("${student.dept}")
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Student [name=" + name + ", stId=" + stId + ", dept=" + dept + ", course=" + course + "]";
}

 
}

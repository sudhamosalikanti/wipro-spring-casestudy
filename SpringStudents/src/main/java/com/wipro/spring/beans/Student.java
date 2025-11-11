package com.wipro.spring.beans;

import java.util.List;

public class Student {
private String studentId;
private String studentName;
private List<Test> studentTests;

// Constructors
public Student() {}

public Student(String studentId, String studentName, List<Test> studentTests) {
this.studentId = studentId;
this.studentName = studentName;
this.studentTests = studentTests;
}

// Getters and Setters
public String getStudentId() {
return studentId;
}

public void setStudentId(String studentId) {
this.studentId = studentId;
}

public String getStudentName() {
return studentName;
}

public void setStudentName(String studentName) {
this.studentName = studentName;
}

public List<Test> getStudentTests() {
return studentTests;
}

public void setStudentTests(List<Test> studentTests) {
this.studentTests = studentTests;
}

@Override
public String toString() {
return "Student{" +
"studentId='" + studentId + '\'' +
", studentName='" + studentName + '\'' +
", studentTests=" + studentTests +
'}';
}
}

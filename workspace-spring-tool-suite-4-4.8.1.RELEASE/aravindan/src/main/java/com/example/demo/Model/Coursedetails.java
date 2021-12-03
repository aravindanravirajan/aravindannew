package com.example.demo.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "coursedetails")
public class Coursedetails {
@Id
private Integer courseId;
@ManyToMany(mappedBy = "coursedetails")
Set<Usertable> usertable;


public Set<Usertable> getUsertable() {
	return usertable;
}
public void setUsertable(Set<Usertable> usertable) {
	this.usertable = usertable;
}
public Integer getCourseId() {
	return courseId;
}
public void setCourseId(Integer courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
private String courseName;
private Integer studentId;

}

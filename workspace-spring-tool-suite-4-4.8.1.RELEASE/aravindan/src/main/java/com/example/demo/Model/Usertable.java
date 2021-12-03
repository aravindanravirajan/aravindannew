package com.example.demo.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="studenttable")
public class Usertable {
	
	@Id
	private Integer studentId;
private Integer courseId;
@ManyToMany
@JoinTable(name = "studentcourse",
joinColumns = @JoinColumn(name = "student_id"),
inverseJoinColumns = @JoinColumn(name = "course_id"))
@JsonIgnore
private Set<Coursedetails> coursedetails; 



	public Set<Coursedetails> getCoursedetails() {
	return coursedetails;
}
public void setCoursedetails(Set<Coursedetails> coursedetails) {
	this.coursedetails = coursedetails;
}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer coursId) {
		this.courseId = coursId;
	}
	private String studentName;
	private String dob;

}

package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Person_Id")
    private Integer id;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "date_of_birth")
    private Date dateOfBirth;
	@Column(name = "Department")
    private String dept;
    @Column(name = "Age")
    private Integer age;
     @OneToMany
    @JoinColumn(name="studentid", nullable=false, updatable = false, insertable = false)
   private List<Address> address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth + ", dept=" + dept
				+ ", age=" + age + ", address=" + address + ", getId()=" + getId() + ", getStudentName()="
				+ getStudentName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getDept()=" + getDept()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public User(Integer id, String studentName, Date dateOfBirth, String dept, Integer age, List<Address> address) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.dept = dept;
		this.age = age;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
     }
    
	
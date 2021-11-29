package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    private List<Address> userAddress;
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth + ", dept=" + dept
				+ ", age=" + age + ", userAddress=" + userAddress+ "]";
	}

	public User(Integer id, String studentName, Date dateOfBirth, String dept, Integer age,
			List<Address> userAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.dept = dept;
		this.age = age;
		this.userAddress = userAddress;
	}

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

	public void setDateOfBirth(Date dob) {
		this.dateOfBirth = dob;
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

	public  void setAge(Integer age) {
		this.age = age;
	}

	public List<Address> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(List<Address> userAddress) {
		this.userAddress = userAddress;
	}
}

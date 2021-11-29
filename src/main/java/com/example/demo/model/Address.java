package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")
public class Address {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressid;
	private String cityname;
	private String statename;
	private String streetname;
	private Integer studentid;
//	@OneToMany
  //  @JoinColumn(name="forginekey", nullable=false, updatable = false, insertable = false)
  //  private List<User> user;
	
	
	

	public Integer getaddressid() {
		return addressid;
	}
	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", studentid=" + studentid + ", cityname=" + cityname
				+ ", statename=" + statename + ", streetname=" + streetname + ", getAddressid()=" + getaddressid()
				+ ", getStudentid()=" + getStudentid() + ", getCityname()=" + getCityname() + ", getStatename()="
				+ getStatename() + ", getStreetname()=" + getStreetname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Integer addressid, Integer studentid, String cityname, String statename, String streetname ,List<User> user)  {
		super();
		this.addressid = addressid;
		this.studentid = studentid;
		this.cityname = cityname;
		this.statename = statename;
		this.streetname = streetname;
		
	}





	
}

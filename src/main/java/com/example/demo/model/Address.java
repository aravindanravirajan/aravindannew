package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")
public class Address {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressid;
	private String cityname;
	private String statename;
	private String streetname;
	private Integer studentid;
	//@ManyToOne
	//@JoinColumn(name = "studentid", nullable = false, updatable = false, insertable = false)
	//private User user;

	public Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
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

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", cityname=" + cityname + ", statename=" + statename
				+ ", streetname=" + streetname + ", studentid=" + studentid + ", user=" +/* user +*/ ", getAddressid()="
				+ getAddressid() + ", getCityname()=" + getCityname() + ", getStatename()=" + getStatename()
				+ ", getStreetname()=" + getStreetname() + ", getStudentid()=" + getStudentid() + ", getUser()="
				+ /*getUser() +*/ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Address(Integer addressid, String cityname, String statename, String streetname, Integer studentid,
			User user) {
		super();
		this.addressid = addressid;
		this.cityname = cityname;
		this.statename = statename;
		this.streetname = streetname;
		this.studentid = studentid;
		//this.user = user;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}

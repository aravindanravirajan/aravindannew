package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Coursedetails;
import com.example.demo.Model.Usertable;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class Services {
	
	
	@Autowired 
	UserRepository userrepository;
	@Autowired
	CourseRepository courserepository;
	
	public List<Usertable> gettingdb() {
		return userrepository.findAll();
	}

	public List<Usertable> set(List<Usertable> usertable) {
		userrepository.saveAll(usertable);
		return userrepository.findAll();
	}
	public List<Coursedetails> setcourse(List<Coursedetails> coursedetails){
		courserepository.saveAll(coursedetails);
		return courserepository.findAll();
	}

	public List<Coursedetails> getcourse() {
		return courserepository.findAll();
		}
	

}

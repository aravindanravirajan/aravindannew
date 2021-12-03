package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.*;
import com.example.demo.Service.Services;

@RestController
@RequestMapping("/main")
public class Controller {
	@Autowired
	private Services service;

	@GetMapping("/get")
		public String get() {
			return "Aravindan";
		}
	@GetMapping("/got")
	public List<Usertable> got() {
		return service.gettingdb();
	}
	@GetMapping("/course")
	public List<Coursedetails> gots() {
		return service.getcourse();
	}
	
	@PostMapping("/set")
	public List<Usertable> set(@RequestBody List<Usertable> usertable){
		return service.set(usertable);
	}
	@PostMapping("/setcourse")
	public List<Coursedetails> setcourse(@RequestBody List<Coursedetails> coursedetails){
		return service.setcourse(coursedetails);
	}
	
	
	}



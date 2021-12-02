package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Address;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController 
@RequestMapping("/main)
public class Controller {
}

	@Autowired
	private UserService userService;

//method for learning 
	@GetMapping("/getit/{dept}/{id}")
	public Boolean fecthAll(@PathVariable String dept, @PathVariable Integer id) {
		return userService.fetchAllRecords(dept,id);
	}

//method for learning 
	@PostMapping("/insertage/{Name}")
	public User agechange(@PathVariable String Name, @RequestBody Integer Age) {
		return userService.setage(Name, Age);
	}

//method for learning 
	@GetMapping("/city/{city}")
	public List<Address> getAllAddress(@PathVariable Integer city) {
		return userService.getaddress(city);
	}

//method for learning 
	@GetMapping("/user/{name}")
	public Optional<User> getAllUser(@PathVariable String name) {
		Optional<User> a = userService.getquery(name);
		return a;

	}

//method for learning 
	@PostMapping("/insert")
	public List<User> insert(@RequestBody List<User> user) {
		return userService.insertall(user);
	}

//task method of one to many  
	@PostMapping("/address/{studentid}")
	public List<Address> inserts(@RequestBody List<Address> address, @PathVariable Integer studentid) {
		return userService.insertaddr(address, studentid);
	}
//task method of many to one ,i have many address but the person is one by the address id the primary key of the address table.
	@GetMapping("/many")
	public List<Address> many(){
		return userService.getmany();
	}

//task many to one.
	@GetMapping("/many/{id}")
	public List<Address> manys(@PathVariable Integer id){
		return userService.getmanys(id);
	}
	
}

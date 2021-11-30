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
@RequestMapping("/main")
public class Controller {

	@Autowired
	private UserService userService;

	@GetMapping("/getit/{id}")
	public List<User> fecthAll(@PathVariable Integer id) {
		return userService.fetchAllRecords(id);
	}

	@PostMapping("/insertage/{Name}")
	public User agechange(@PathVariable String Name, @RequestBody Integer Age) {
		return userService.setage(Name, Age);
	}
	
	@GetMapping("/city/{city}")
	public List<Address> getAllAddress(@PathVariable Integer city) {
		return userService.getaddress(city);
	}
  /*  @GetMapping("/user/{name}")
	public Optional<User> getAllUser(@PathVariable String name) {
         Optional<User> a = userService.getquery(name);
         a.getClass(User.getStudentName());
         }
	@PostMapping("/insert")
		public List<User> insert(@RequestBody List<User> user) {
			return userService.insertall(user);
			}
	@PostMapping("/address/{studentid}")
	public List<Address> inserts(@RequestBody List<Address> address,@PathVariable Integer studentid){
		return userService.insertaddr(address,studentid);
	}

	
	@GetMapping("/new")
	public String news() {
		String a = "Aravindan";
		return a;
	}*/
	}

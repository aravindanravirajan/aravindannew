package com.example.demo.service;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.addressrepo;
import com.example.demo.model.Address;
import com.example.demo.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private addressrepo Addressrepo;
	
	public User fetchAllRecords(Integer id) {
		Optional<User> check = userRepository.findById(id);
      	//Optional<User>  check1=userRepository.findById(id);
           List<User> check1 =check.stream().collect(Collectors.toList());
      	System.out.println(check1);
      	 // System.out.println(check2.getStudentName());
        	return check1.get(1);
        
  
		
		
		//return userRepository.findAll();
		
	}
        public User setage(String name, Integer age) {
		Optional<User> saved = userRepository.findBystudentName(name);
		
		saved.get().setAge(age);
		return userRepository.save(saved.get());
	}

	public Optional<User> getquery(String name) {
		return userRepository.findBystudentName(name);
	}
	public List<Address> getaddress(Integer city) {
		return Addressrepo.findByAddressid(city);
	}
	public List<User> insertall(List<User> user){
	userRepository.saveAll(user);
	return userRepository.findAll();
	}
	//public List<Address> insertaddr(List<Address> address,Integer studentid) {
		
		//List<Address> saves  = Addressrepo.findByStudentid(studentid);
		
		//Addressrepo.saveAll(address);
		//return Addressrepo.findAll();
	//}
}


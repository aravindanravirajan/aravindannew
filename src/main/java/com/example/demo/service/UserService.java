package com.example.demo.service;

import java.util.Date;
import java.util.List;

import java.util.Optional;

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

	public Optional<User> fetchAllRecords(Integer id) {
		return userRepository.findById(id);
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
	public List<User> insertall(Integer id, String name, Date dob, String dept, Integer age) {
		User user = new User();
		user.setAge(age);
		user.setId(id);
		user.setDateOfBirth(dob);
		user.setDept(dept);
		user.setStudentName(name);
	return userRepository.findAll();
		
	}
}

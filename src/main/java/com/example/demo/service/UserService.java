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

	// method i tried of doing
	public Boolean fetchAllRecords(String dept,Integer id) {
		Optional<User> check = userRepository.findById(id);

		List<User> check1 = check.stream().collect(Collectors.toList());
		 Boolean check2 = check1.contains(dept="dept");

		System.out.println(check1);

		return check2;
	}

	// method i tried of doing
	public User setage(String name, Integer age) {
		Optional<User> saved = userRepository.findBystudentName(name);
		saved.get().setAge(age);
		return userRepository.save(saved.get());
	}

	// method i tried of doing
	public Optional<User> getquery(String name) {
		return userRepository.findBystudentName(name);
	}

	// method i tried of doing
	public List<Address> getaddress(Integer city) {
		return Addressrepo.findByAddressid(city);
	}

	// method i tried of doing
	public List<User> insertall(List<User> user) {
		userRepository.saveAll(user);
		return userRepository.findAll();
	}

	// method of the task one to many
	public List<Address> insertaddr(List<Address> address, Integer studentid) {
		Addressrepo.saveAll(address);
		return Addressrepo.findByStudentid(studentid);
	}

	public List<Address> getmany() {
		return Addressrepo.findAll();
	}

	public List<Address> getmanys(Integer id) {
		return Addressrepo.findByStudentid(id);

	}
}

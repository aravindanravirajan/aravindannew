package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Usertable;

public interface UserRepository extends JpaRepository<Usertable,Integer> {

}

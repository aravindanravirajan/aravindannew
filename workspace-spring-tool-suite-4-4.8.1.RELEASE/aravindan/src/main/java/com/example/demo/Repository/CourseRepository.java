package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Coursedetails;

public interface CourseRepository extends JpaRepository<Coursedetails,Integer> {

}

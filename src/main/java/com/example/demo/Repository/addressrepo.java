package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Address;

@Repository
@EnableJpaRepositories
public interface addressrepo extends JpaRepository<Address, Long> {

//	 @Query(value = "Select * from student inner join address on student.Person_Id=address.studentid WHERE Person_Id =127;",//"SELECT * FROM student u WHERE Aravindan =studentname", 
//	    	  nativeQuery = true)
//	    		 List<Address> finda();
            List<Address> findByCityname(String city);
            List<Address> findByAddressid(Integer addressid);
}

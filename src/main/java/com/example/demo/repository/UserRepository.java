package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "Select * from user where id_company = ?1", nativeQuery = true)
	List<User> findByIdCompany(int id_company);
	
	@Query(value = "Select * from user where name_user LIKE %?1%", nativeQuery = true)
	List<User> findByNameUser(String name_user);
}

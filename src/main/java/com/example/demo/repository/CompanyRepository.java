package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

	@Query(value = "Select * from company where address LIKE %?1%", nativeQuery = true)
	List<Company> findByAddress(String address);
}

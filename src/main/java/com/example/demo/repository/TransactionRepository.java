package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	@Query(value = "Select * from transaction where type = 'R'", nativeQuery = true)
	List<Transaction> findTypeR();
	
	@Query(value = "Select * from transaction where type = 'S'", nativeQuery = true)
	List<Transaction> findTypeS();
}

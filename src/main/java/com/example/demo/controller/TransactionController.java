package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/addListTransaction")
	public List<Transaction> addTransactions(@RequestBody List<Transaction> transactions){
		return transactionService.saveTransactions(transactions);
	}
	
	@GetMapping("/getTypeR")
	public List<Transaction> findTypeR(){
		return transactionService.getTypeR();
	}
	
	@GetMapping("/getTypeS")
	public List<Transaction> findTypeS(){
		return transactionService.getTypeS();
	}
}

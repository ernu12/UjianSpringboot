package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;
	
	public List<Transaction> saveTransactions(List<Transaction> transactions){
		return transactionRepository.saveAll(transactions);
	}
	public List<Transaction> getTypeR(){
		return transactionRepository.findTypeR();
	}
	public List<Transaction> getTypeS(){
		return transactionRepository.findTypeS();
	}

}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CompanyBudget;
import com.example.demo.repository.CompanyBudgetRepository;

@Service
public class CompanyBudgetService {
	@Autowired
	private CompanyBudgetRepository companyBudgetRepository;
	
	public List<CompanyBudget> saveCompanyBudgets(List<CompanyBudget> companyBudgets){
		return companyBudgetRepository.saveAll(companyBudgets);
	}
	

	public List<CompanyBudget> getCompanyBudgetByAmount() {
		return companyBudgetRepository.findByAmount();
	}
	public List<CompanyBudget> getCompanyBudgetByAmountMinus() {
		return companyBudgetRepository.findByAmountMinus();
	}

}

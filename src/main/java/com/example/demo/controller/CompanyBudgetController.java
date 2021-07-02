package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CompanyBudget;
import com.example.demo.service.CompanyBudgetService;

@RestController
public class CompanyBudgetController {

	@Autowired
	private CompanyBudgetService companyBudgetService;

	@PostMapping("/addListCompanyBudget")
	public List<CompanyBudget> addCompanyBudgets(@RequestBody List<CompanyBudget> companyBudgets) {
		return companyBudgetService.saveCompanyBudgets(companyBudgets);
	}

	@GetMapping("/getAmountCompanyBudget")
	public List<CompanyBudget> findByAmount() {
		return companyBudgetService.getCompanyBudgetByAmount();
	}
	@GetMapping("/getAmountMinusCompanyBudget")
	public List<CompanyBudget> findByAmountMinus() {
		return companyBudgetService.getCompanyBudgetByAmountMinus();
	}
}

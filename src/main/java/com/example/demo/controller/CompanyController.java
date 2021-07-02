package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/addListCompany")
	public List<Company> addCompanies(@RequestBody List<Company> companies){
		return companyService.saveCompanies(companies);
	}
	@GetMapping("/getCompanyAddress/{address}")
	public List<Company> findByAddress(@PathVariable String address){
		return companyService.getCompanyAddress(address);
	}
}

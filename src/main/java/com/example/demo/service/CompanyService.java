package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> saveCompanies(List<Company> companies){
		return companyRepository.saveAll(companies);
	}
	public List<Company> getCompanyAddress(String addreess){
		return companyRepository.findByAddress(addreess);
	}
}

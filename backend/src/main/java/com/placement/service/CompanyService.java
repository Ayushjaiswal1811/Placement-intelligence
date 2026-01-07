package com.placement.service;

import com.placement.model.Company;
import com.placement.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository repo;

    public CompanyService(CompanyRepository repo) {
        this.repo = repo;
    }

    public List<Company> getAllCompanies() {
        return repo.findAll();
    }

    public Company getCompanyById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Company saveCompany(Company company) {
        return repo.save(company);
    }

    public void deleteCompany(Long id) {
        repo.deleteById(id);
    }
}

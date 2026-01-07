package com.placement.service;

import com.placement.model.Admin;
import com.placement.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository repo;

    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    public List<Admin> getAll() { return repo.findAll(); }
    public Admin save(Admin admin) { return repo.save(admin); }
    public Admin findByUsername(String username) { return repo.findByUsername(username); }
}

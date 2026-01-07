package com.placement.controller;

import com.placement.model.Admin;
import com.placement.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) { this.service = service; }

    @GetMapping
    public List<Admin> getAllAdmins() { return service.getAll(); }

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) { return service.save(admin); }

    @PostMapping("/login")
    public String login(@RequestBody Admin admin) {
        Admin found = service.findByUsername(admin.getUsername());
        if (found != null && found.getPassword().equals(admin.getPassword())) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }
}

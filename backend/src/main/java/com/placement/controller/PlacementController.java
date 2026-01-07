package com.placement.controller;

import com.placement.model.Placement;
import com.placement.service.PlacementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {
    private final PlacementService service;

    public PlacementController(PlacementService service) { this.service = service; }

    @GetMapping
    public List<Placement> getAll() { return service.getAllPlacements(); }

    @PostMapping
    public Placement add(@RequestBody Placement p) { return service.savePlacement(p); }
}

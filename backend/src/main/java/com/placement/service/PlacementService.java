package com.placement.service;

import com.placement.model.Placement;
import com.placement.repository.PlacementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    private final PlacementRepository repo;

    public PlacementService(PlacementRepository repo) {
        this.repo = repo;
    }

    public List<Placement> getAllPlacements() {
        return repo.findAll();
    }

    public Placement getPlacementById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Placement savePlacement(Placement placement) {
        return repo.save(placement);
    }

    public void deletePlacement(Long id) {
        repo.deleteById(id);
    }
}

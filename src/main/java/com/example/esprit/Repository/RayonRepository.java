package com.example.esprit.Repository;

import com.example.esprit.Entity.CategorieProduit;
import com.example.esprit.Entity.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RayonRepository extends JpaRepository<Rayon, Long> {
}

package com.example.esprit.Repository;

import com.example.esprit.Entity.CategorieProduit;
import com.example.esprit.Entity.Fourniseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fourniseur, Long> {
}

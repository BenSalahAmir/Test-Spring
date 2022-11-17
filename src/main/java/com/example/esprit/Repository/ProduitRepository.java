package com.example.esprit.Repository;

import com.example.esprit.Entity.CategorieProduit;
import com.example.esprit.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}

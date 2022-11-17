package com.example.esprit.Repository;

import com.example.esprit.Entity.CategorieProduit;
import com.example.esprit.Entity.Client;
import com.example.esprit.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    public List<Facture> findFactureByClient(Client c);

}

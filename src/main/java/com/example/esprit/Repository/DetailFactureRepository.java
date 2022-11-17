package com.example.esprit.Repository;

import com.example.esprit.Entity.DetailFacture;
import com.example.esprit.Entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailFactureRepository extends JpaRepository<DetailFacture, Long> {
    public List<DetailFacture> findDetailFactureByFacture(Facture f);
}

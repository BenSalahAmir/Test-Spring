package com.example.esprit.Repository;

import com.example.esprit.Entity.CategorieProduit;
import com.example.esprit.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CientRepository extends JpaRepository<Client, Long> {
}

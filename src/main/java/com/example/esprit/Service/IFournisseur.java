package com.example.esprit.Service;

import com.example.esprit.Entity.Client;
import com.example.esprit.Entity.Fourniseur;

import java.util.List;

public interface IFournisseur {
    public Fourniseur update(Fourniseur c);
    public void delete(Long id);
    public Fourniseur add(Fourniseur c);
    public List<Fourniseur> getall();
    public Fourniseur getone(Long id);

    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}

package com.example.esprit.Service;

import com.example.esprit.Entity.Client;
import com.example.esprit.Entity.Facture;

import java.util.List;

public interface IFacture {
    public Facture update(Facture f);
    public void delete(Long id);
    public Facture add(Facture f);
    public List<Facture> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public Facture getone(Long id);
    public List<Facture> getFacturesByClient(Long idClient);
    public Facture addFacture(Facture f, Long idClient);
}

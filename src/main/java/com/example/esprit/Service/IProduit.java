package com.example.esprit.Service;

import com.example.esprit.Entity.Produit;
import com.example.esprit.Entity.Stock;

import java.util.List;

public interface IProduit {
    public Produit update(Produit s);
    public void delete(Long id);
    public Produit add(Produit s,Long idRayon, Long idStock);
    public List<Produit> getall();
    public Produit getone(Long id);
    public void assignProduitToStock(Long idProduit, Long idStock);





}

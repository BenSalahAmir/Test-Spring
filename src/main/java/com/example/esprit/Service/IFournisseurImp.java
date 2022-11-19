package com.example.esprit.Service;

import com.example.esprit.Entity.Fourniseur;
import com.example.esprit.Entity.Produit;
import com.example.esprit.Repository.CientRepository;
import com.example.esprit.Repository.FournisseurRepository;
import com.example.esprit.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IFournisseurImp implements IFournisseur{
    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Autowired
    private ProduitRepository produitRepository;
    @Override
    public Fourniseur update(Fourniseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public void delete(Long id) {
        fournisseurRepository.deleteById(id);

    }

    @Override
    public Fourniseur add(Fourniseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public List<Fourniseur> getall() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fourniseur getone(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fourniseur fourniseur=fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit=produitRepository.findById(produitId).orElse(null);
        if (fourniseur!=null && produit!=null){

            produit.getFournisseurs().add(fourniseur);
            produitRepository.save(produit);

        }

    }
}

package com.example.esprit.Service;

import com.example.esprit.Entity.Client;
import com.example.esprit.Entity.DetailFacture;
import com.example.esprit.Entity.Facture;
import com.example.esprit.Repository.CientRepository;
import com.example.esprit.Repository.DetailFactureRepository;
import com.example.esprit.Repository.FactureRepository;
import com.example.esprit.Repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IFactureImp implements IFacture{
    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private DetailFactureRepository detailFactureRepository;
    @Autowired
    private CientRepository cientRepository;

    @Override
    public Facture update(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public void delete(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public Facture add(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public List<Facture> getall() {
        return factureRepository.findAll();
    }

    @Override
    public Facture getone(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        Client c=cientRepository.findById(idClient).orElse(null);
        return factureRepository.findFactureByClient(c);
    }
    @Override
    public Facture addFacture(Facture f, Long idClient) {
        List<DetailFacture> detailFactures=detailFactureRepository.findDetailFactureByFacture(f);
        float prixTot=0;
        int montRem=0;
        for (DetailFacture de:detailFactures) {
            prixTot=+de.getPrixTotal();
            montRem=+de.getMontantRemise();
        }
        f.setMontantFacture(prixTot);
        f.setMontantRemise(montRem);
        return factureRepository.save(f);
    }
}

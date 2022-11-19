package com.example.esprit.Service;

import com.example.esprit.Entity.Produit;
import com.example.esprit.Entity.Rayon;
import com.example.esprit.Entity.Stock;
import com.example.esprit.Repository.ProduitRepository;
import com.example.esprit.Repository.RayonRepository;
import com.example.esprit.Repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IProduitImp implements IProduit{

    private ProduitRepository produitRepository;
    private RayonRepository rayonRepository;
    private StockRepository stockRepository;

    @Override
    public Produit update(Produit s) {
        return produitRepository.save(s);
    }

    @Override
    public void delete(Long id) {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit add(Produit s, Long idRayon, Long idStock) {
        Rayon rayon = rayonRepository.findById(idRayon).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        rayon.getProduits().add(s);
        stock.getProduits().add(s);
        return produitRepository.save(s);
    }

    @Override
    public List<Produit> getall() {
        return produitRepository.findAll();
    }

    @Override
    public Produit getone(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null){
            produit.setStock(stock);
            produitRepository.save(produit);
        }

    }

}

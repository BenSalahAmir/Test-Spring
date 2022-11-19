package com.example.esprit.Service;

import com.example.esprit.Entity.DetailProduit;
import com.example.esprit.Repository.DetailProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IDetailProduitImp implements IDetailProduit{
    private DetailProduitRepository detailProduitRepository;

    @Override
    public DetailProduit update(DetailProduit dp) {
        return detailProduitRepository.save(dp);
    }

    @Override
    public void delete(Long id) {
        detailProduitRepository.deleteById(id);
    }

    @Override
    public DetailProduit add(DetailProduit dp) {
        return detailProduitRepository.save(dp);
    }

    @Override
    public List<DetailProduit> getall() {
        return detailProduitRepository.findAll();
    }

    @Override
    public DetailProduit getone(Long id) {
        return detailProduitRepository.findById(id).orElse(null);
    }
}

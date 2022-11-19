package com.example.esprit.Service;

import com.example.esprit.Entity.CategorieClient;
import com.example.esprit.Entity.DetailProduit;
import com.example.esprit.Entity.Stock;

import java.util.Date;
import java.util.List;

public interface IDetailProduit {

    public DetailProduit update(DetailProduit dp);
    public void delete(Long id);
    public DetailProduit add(DetailProduit dp);
    public List<DetailProduit> getall();
    public DetailProduit getone(Long id);





}

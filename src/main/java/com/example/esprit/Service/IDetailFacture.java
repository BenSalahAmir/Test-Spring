package com.example.esprit.Service;

import com.example.esprit.Entity.Client;
import com.example.esprit.Entity.DetailFacture;

import java.util.List;

public interface IDetailFacture {

    public DetailFacture update(DetailFacture df);
    public void delete(Long id);
    public DetailFacture add(DetailFacture df);
    public List<DetailFacture> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public DetailFacture getone(Long id);

}

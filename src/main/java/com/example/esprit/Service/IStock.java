package com.example.esprit.Service;

import com.example.esprit.Entity.Fourniseur;
import com.example.esprit.Entity.Stock;

import java.util.List;

public interface IStock {
    public Stock update(Stock s);
    public void delete(Long id);
    public Stock add(Stock s);
    public List<Stock> getall();
    public Stock getone(Long id);

}

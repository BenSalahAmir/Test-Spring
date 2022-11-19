package com.example.esprit.Service;

import com.example.esprit.Entity.Stock;
import com.example.esprit.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IStockImp implements IStock{
@Autowired
private StockRepository stockRepository;

    @Override
    public Stock update(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public void delete(Long id) {
        stockRepository.deleteById(id);

    }

    @Override
    public Stock add(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public List<Stock> getall() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getone(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
}

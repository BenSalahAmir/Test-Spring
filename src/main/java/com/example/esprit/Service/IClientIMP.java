package com.example.esprit.Service;

import com.example.esprit.Entity.Client;
import com.example.esprit.Repository.CientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IClientIMP implements IClient{

    @Autowired
    private CientRepository cientRepository;
    @Override
    public Client update(Client c) {
        return cientRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        cientRepository.deleteById(id);

    }

    @Override
    public Client add(Client c) {
        return cientRepository.save(c);
    }

    @Override
    public List<Client> getall() {
        return cientRepository.findAll();
    }

    @Override
    public Client getone(Long id) {
        return cientRepository.findById(id).orElse(null);
    }
}

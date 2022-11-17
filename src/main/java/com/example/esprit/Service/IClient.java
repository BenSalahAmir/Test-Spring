package com.example.esprit.Service;

import com.example.esprit.Entity.Client;

import java.util.List;

public interface IClient {

    public Client update(Client c);
    public void delete(Long id);
    public Client add(Client c);
    public List<Client> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public Client getone(Long id);
}

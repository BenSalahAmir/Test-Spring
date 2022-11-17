package com.example.esprit.Service;

import com.example.esprit.Entity.DetailFacture;
import com.example.esprit.Entity.Facture;
import com.example.esprit.Repository.DetailFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IDetailFactureImp implements IDetailFacture{

    @Autowired
    private DetailFactureRepository detailFactureRepository;
    @Override
    public DetailFacture update(DetailFacture df) {
        return detailFactureRepository.save(df);
    }

    @Override
    public void delete(Long id) {
        detailFactureRepository.deleteById(id);
    }

    @Override
    public DetailFacture add(DetailFacture df) {
        return detailFactureRepository.save(df);
    }

    @Override
    public List<DetailFacture> getall() {
        return detailFactureRepository.findAll();
    }

    @Override
    public DetailFacture getone(Long id) {
        return detailFactureRepository.findById(id).orElse(null);
    }


}

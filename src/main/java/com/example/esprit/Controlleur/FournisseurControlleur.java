package com.example.esprit.Controlleur;

import com.example.esprit.Entity.CategorieProduit;
import com.example.esprit.Entity.Fourniseur;
import com.example.esprit.Service.IFournisseur;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/Fournisseur")
public class FournisseurControlleur {
    private IFournisseur service;
    @PostMapping
    public ResponseEntity<?> add(@RequestBody Fourniseur f) {
        return new ResponseEntity<>(service.add(f), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getall(){
        return new ResponseEntity<>(service.getall(),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return  new ResponseEntity<>("deleted success",HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Fourniseur f) {
        return new ResponseEntity<>(service.update(f), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getone(@PathVariable Long id){
        return new ResponseEntity<>(service.getone(id),HttpStatus.OK);
    }

    @PostMapping("/assignFournisseurToProduit/{fournisseurId}/{produitId}")
    public ResponseEntity<?> assignFournisseurToProduit(@PathVariable Long fournisseurId,@PathVariable Long produitId) {
        service.assignFournisseurToProduit(fournisseurId,produitId);
        return new ResponseEntity<>("Added",HttpStatus.OK);
    }


}

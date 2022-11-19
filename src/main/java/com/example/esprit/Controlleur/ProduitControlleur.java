package com.example.esprit.Controlleur;

import com.example.esprit.Entity.Produit;
import com.example.esprit.Entity.Stock;
import com.example.esprit.Service.IProduit;
import com.example.esprit.Service.IStock;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/produit")
public class ProduitControlleur {
    private IProduit service;
    @PostMapping("/{idRayon}/{idStock}")
    public ResponseEntity<?> add(@RequestBody Produit p,@PathVariable Long idRayon,@PathVariable Long idStock) {
        return new ResponseEntity<>(service.add(p,idRayon,idStock), HttpStatus.CREATED);
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
    public ResponseEntity<?> update(@RequestBody Produit p) {
        return new ResponseEntity<>(service.update(p), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getone(@PathVariable Long id){
        return new ResponseEntity<>(service.getone(id),HttpStatus.OK);
    }



    @PostMapping("/assignProduitToStock/{idProduit}/{idStock}")
    public ResponseEntity<?> assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock) {
        service.assignProduitToStock(idProduit,idStock);
        return new ResponseEntity<>("Added",HttpStatus.OK);
    }





    }

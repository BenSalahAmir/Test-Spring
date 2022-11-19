package com.example.esprit.Controlleur;

import com.example.esprit.Entity.Facture;
import com.example.esprit.Entity.Fourniseur;
import com.example.esprit.Service.IFacture;
import com.example.esprit.Service.IFournisseur;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/facture")
public class FactureControlleur {
    private IFacture service;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Facture f) {
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
    public ResponseEntity<?> update(@RequestBody Facture f) {
        return new ResponseEntity<>(service.update(f), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getone(@PathVariable Long id){
        return new ResponseEntity<>(service.getone(id),HttpStatus.OK);
    }
    @GetMapping("/getFacturesByClient/{idClient}")
    public ResponseEntity<?> getFacturesByClient (@PathVariable Long idClient){
       // service.getFacturesByClient(idClient);
        return new ResponseEntity<>(service.getFacturesByClient(idClient),HttpStatus.OK);
    }

    @PostMapping("/addFacture/{idClient}")
    public ResponseEntity<?> addFacture(@RequestBody Facture f,@PathVariable Long idClient){
        return new ResponseEntity<>( service.addFacture(f,idClient), HttpStatus.CREATED);
    }


}

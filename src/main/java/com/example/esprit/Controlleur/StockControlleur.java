package com.example.esprit.Controlleur;

import com.example.esprit.Entity.Fourniseur;
import com.example.esprit.Entity.Stock;
import com.example.esprit.Service.IFournisseur;
import com.example.esprit.Service.IStock;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/stock")
public class StockControlleur {

    private IStock service;
    @PostMapping
    public ResponseEntity<?> add(@RequestBody Stock s) {
        return new ResponseEntity<>(service.add(s), HttpStatus.CREATED);
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
    public ResponseEntity<?> update(@RequestBody Stock s) {
        return new ResponseEntity<>(service.update(s), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getone(@PathVariable Long id){
        return new ResponseEntity<>(service.getone(id),HttpStatus.OK);
    }

}

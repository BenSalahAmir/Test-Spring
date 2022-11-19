package com.example.esprit.Controlleur;

import com.example.esprit.Entity.Client;
import com.example.esprit.Entity.Facture;
import com.example.esprit.Service.IClient;
import com.example.esprit.Service.IFacture;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientControlleur {
    private IClient service;


    @PostMapping
    public ResponseEntity<?> add(@RequestBody Client c) {
        return new ResponseEntity<>(service.add(c), HttpStatus.CREATED);
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
    public ResponseEntity<?> update(@RequestBody Client c) {
        return new ResponseEntity<>(service.update(c), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getone(@PathVariable Long id){
        return new ResponseEntity<>(service.getone(id),HttpStatus.OK);
    }

}

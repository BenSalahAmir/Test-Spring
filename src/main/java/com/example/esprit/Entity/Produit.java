package com.example.esprit.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

    @OneToOne
    private DetailProduit detailproduit;

    @ManyToOne
    private Stock stock;
    @ManyToOne
    private Rayon rayon;
    @JsonBackReference
    @ManyToMany
    private Set<Fourniseur>fournisseurs;


}

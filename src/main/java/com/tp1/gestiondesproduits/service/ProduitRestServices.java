package com.tp1.gestiondesproduits.service;

import com.tp1.gestiondesproduits.dao.ProduitRepository;
import com.tp1.gestiondesproduits.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@RestController
public class ProduitRestServices {
    @Autowired
    private ProduitRepository produitRepository;
    @GetMapping(value = "/listProduits")
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }


    @GetMapping(value = "/listProduits/{id}")
    public Produit listProduits(@PathVariable(name = "id") Long id){
        return produitRepository.findById(id).get();
    }

    @PutMapping (value = "/listProduits/{id}")
    public Produit update(@PathVariable(name = "id") Long id,@RequestBody Produit produit){
        produit.setIdProduit(id);
        return produitRepository.save(produit);
    }

    @PostMapping (value = "/listProduits")
    public Produit save(@RequestBody Produit produit){
        return produitRepository.save(produit);
    }

    @DeleteMapping (value = "/listProduits/{id}")
    public void delete(@PathVariable(name = "id") Long id){
         produitRepository.deleteById(id);
    }



}

package com.tp1.gestiondesproduits;

import com.tp1.gestiondesproduits.dao.ProduitRepository;
import com.tp1.gestiondesproduits.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionDesProduitsApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(GestionDesProduitsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitRepository.save(new Produit(null,"PC Toshiba",3887,2));
        produitRepository.save(new Produit(null,"PC dell",6887,12));


    }
}

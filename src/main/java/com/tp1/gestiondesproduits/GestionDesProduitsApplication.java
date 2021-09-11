package com.tp1.gestiondesproduits;

import com.tp1.gestiondesproduits.dao.ProduitRepository;
import com.tp1.gestiondesproduits.entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GestionDesProduitsApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(GestionDesProduitsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Produit.class);
        produitRepository.save(new Produit(null,"PC accer",3887,2));
        produitRepository.save(new Produit(null,"PC samsung",6887,12));

        produitRepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });


    }
}

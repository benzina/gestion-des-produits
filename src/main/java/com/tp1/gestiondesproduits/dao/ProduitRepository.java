package com.tp1.gestiondesproduits.dao;

import com.tp1.gestiondesproduits.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}

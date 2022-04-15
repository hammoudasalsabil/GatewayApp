package com.fournisseur.fournisseur.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fournisseur.fournisseur.model.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

	Fournisseur findById(int id);
}

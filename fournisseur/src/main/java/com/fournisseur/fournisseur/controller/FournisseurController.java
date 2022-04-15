package com.fournisseur.fournisseur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fournisseur.fournisseur.dao.FournisseurRepository;
import com.fournisseur.fournisseur.model.Fournisseur;

@RestController
public class FournisseurController {
	
	@Autowired
	private FournisseurRepository fournisseurrepository;

	@GetMapping(value="/Fournisseurs")
	public List<Fournisseur> AfficherFournisseurs(){
		return fournisseurrepository.findAll();
	}

	@GetMapping(value="/Fournisseur/{id}")
	public Fournisseur AfficherFournisseur(@PathVariable int id){
		return fournisseurrepository.findById(id);
	}

	@PostMapping(value="/AddFournisseur")
	public Fournisseur AddFournisseur(@RequestBody Fournisseur fournisseur){
		return fournisseurrepository.save(fournisseur);
	}
}

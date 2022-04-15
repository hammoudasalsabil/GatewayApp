package com.client.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.client.dao.ClientRepository;
import com.client.client.model.Client;

@RestController
@RequestMapping ( "Clients/" )
public class ClientController {

	@Autowired
	private ClientRepository clientrepository;
	
	@GetMapping(value="ListClients")
	public List<Client> AfficherClients(){
		return clientrepository.findAll();
	}

	@GetMapping(value="Client/{id}")
	public Client AfficheClient(@PathVariable int id){
		return clientrepository.findById(id);
	}

	@PostMapping(value="AddClient")
	public Client AddClient(@RequestBody Client client){
		return clientrepository.save(client);
	}
}

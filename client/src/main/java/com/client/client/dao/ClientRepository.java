package com.client.client.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.client.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

	Client findById(int id);
}

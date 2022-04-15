package com.fournisseur.fournisseur.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="Fournisseur")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fournisseur {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String name;
	private String prename;
	private String tel;
}

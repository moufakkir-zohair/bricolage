package com.bricolage.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@DiscriminatorValue("CU")
public class User extends Compte implements Serializable {
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Offre> offres;

	public User() {
		super();
	}
	
	public User(String firstName, String lastName, String phone, String email, String password, String city) {
		super(firstName, lastName, phone, email, password, city);
	}

	public List<Offre> getOffres() {
		return offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

}

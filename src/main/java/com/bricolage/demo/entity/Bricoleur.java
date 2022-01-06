package com.bricolage.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("CB")
public class Bricoleur extends Compte implements Serializable {
	
	private String adress;
	private String job;
	
	@OneToMany(mappedBy = "bricoleur" , cascade = CascadeType.REMOVE)
	private List<Postule> postules;

	public Bricoleur() {
		super();
	}
	
	public Bricoleur(String firstName, String lastName, String phone, String email, String password, String city) {
		super(firstName, lastName, phone, email, password, city);
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@JsonIgnore
	public List<Postule> getPostules() {
		return postules;
	}

	public void setPostules(List<Postule> postules) {
		this.postules = postules;
	}

}

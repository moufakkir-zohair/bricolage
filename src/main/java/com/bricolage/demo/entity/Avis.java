package com.bricolage.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_bricoleur")
	private Bricoleur bricoleur;
	
	private String avis;
	private LocalDate Date;
	
	public Avis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avis(User user, Bricoleur bricoleur, String avis, LocalDate date) {
		super();
		this.user = user;
		this.bricoleur = bricoleur;
		this.avis = avis;
		Date = date;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Bricoleur getBricoleur() {
		return bricoleur;
	}
	public void setBricoleur(Bricoleur bricoleur) {
		this.bricoleur = bricoleur;
	}
	public String getAvis() {
		return avis;
	}
	public void setAvis(String avis) {
		this.avis = avis;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	public Long getId() {
		return id;
	}
	
	
	
	
}

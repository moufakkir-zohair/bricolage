package com.bricolage.demo.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Postule {

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_offre")
	private Offre offre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_bricoleur")
	private Bricoleur bricoleur;
	//private String postuleMessage;
	private Boolean accepte = false;

	public Postule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Postule(Offre offre, Bricoleur bricoleur, Boolean accepte) {
		super();
		this.offre = offre;
		this.bricoleur = bricoleur;
		//this.postuleMessage = postuleMessage;
		this.accepte = accepte;
	}
	
	@JsonIgnore
	public Offre getOffre() {
		return offre;
	}
	
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	
	public Bricoleur getBricoleur() {
		return bricoleur;
	}
	public void setBricoleur(Bricoleur bricoleur) {
		this.bricoleur = bricoleur;
	}
	/*public String getPostuleMessage() {
		return postuleMessage;
	}
	public void setPostuleMessage(String postuleMessage) {
		this.postuleMessage = postuleMessage;
	}*/
	public Boolean getAccepte() {
		return accepte;
	}
	public void setAccepte(Boolean accepte) {
		this.accepte = accepte;
	}
	public Long getId() {
		return id;
	}
	
	
}

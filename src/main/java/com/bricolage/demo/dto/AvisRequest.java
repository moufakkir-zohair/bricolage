package com.bricolage.demo.dto;


public class AvisRequest {

	private Long id_user;
	
	private Long id_bricoleur;
	
	private String avis;

	public AvisRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AvisRequest(Long id_user, Long id_bricoleur, String avis) {
		super();
		this.id_user = id_user;
		this.id_bricoleur = id_bricoleur;
		this.avis = avis;
	}

	public Long getId_user() {
		return id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public Long getId_bricoleur() {
		return id_bricoleur;
	}

	public void setId_bricoleur(Long id_bricoleur) {
		this.id_bricoleur = id_bricoleur;
	}

	public String getAvis() {
		return avis;
	}

	public void setAvis(String avis) {
		this.avis = avis;
	}
	
	
}

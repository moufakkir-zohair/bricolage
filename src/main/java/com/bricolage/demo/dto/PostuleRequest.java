package com.bricolage.demo.dto;


public class PostuleRequest {
	private Long id_offre;
	private Long id_bricoleur;
	//private String postuleMessage;
	
	public PostuleRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PostuleRequest(Long id_offre, Long id_bricoleur) {
		super();
		this.id_offre = id_offre;
		this.id_bricoleur = id_bricoleur;
		//this.postuleMessage = postuleMessage;
	}
	
	public Long getId_offre() {
		return id_offre;
	}
	
	public void setId_offre(Long id_offre) {
		this.id_offre = id_offre;
	}
	
	public Long getId_bricoleur() {
		return id_bricoleur;
	}
	
	public void setId_bricoleur(Long id_bricoleur) {
		this.id_bricoleur = id_bricoleur;
	}
	
	/*public String getPostuleMessage() {
		return postuleMessage;
	}
	
	public void setPostuleMessage(String postuleMessage) {
		this.postuleMessage = postuleMessage;
	}*/

	
}

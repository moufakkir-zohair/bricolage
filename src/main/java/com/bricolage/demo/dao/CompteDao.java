package com.bricolage.demo.dao;

import java.util.List;

import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.User;

public interface CompteDao {
	public Bricoleur ajouterBricoleur(Bricoleur bricoleur);
	public Bricoleur modifierBricoleur(Bricoleur bricoleur);
	public User ajouterUser(User user);
	public User modifierUser(User user);
	public void supprimerCompte(Long id);
	public Bricoleur RateBricoleur(Long id_bricoleur, int Rate);
	public List<Bricoleur> ListMeilBricoleurs(String job);
}

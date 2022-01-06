package com.bricolage.demo.dao;

import java.util.List;

import com.bricolage.demo.dto.OffreRequest;
import com.bricolage.demo.entity.Offre;

public interface OffreDao {
	public Offre ajouterOffre(OffreRequest offreRequest);
	public Offre modifierOffre(Offre offre);
	public void supprimerOffre(Long id_offre);
	public List<Offre> listOffrePourBricoleur(String jobs);
	public List<Offre> listOffrePourUser(Long id_user);
}

package com.bricolage.demo.dao;

import java.util.List;

import com.bricolage.demo.dto.AvisRequest;
import com.bricolage.demo.entity.Avis;

public interface AvisDao {
	public Avis ajouterAvis(AvisRequest avisRequest);
	public Avis modifierAvis(Long id_avis , String avis);
	public void supprimerAvis(Long id_avis);
	public List<Avis> listAvis(Long id_bricoleur);
}

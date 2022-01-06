package com.bricolage.demo.dao;

import java.util.List;

import com.bricolage.demo.dto.PostuleRequest;
import com.bricolage.demo.entity.Postule;

public interface PostuleDao {
	public Postule ajouterPostule(PostuleRequest postuleRequest);
	public void AnnulerPostule(Long id_postule);
	public List<Postule> listPostulePourOffre(Long id_offre);
}

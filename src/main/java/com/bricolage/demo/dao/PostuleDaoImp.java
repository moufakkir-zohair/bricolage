package com.bricolage.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricolage.demo.dto.PostuleRequest;
import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.Offre;
import com.bricolage.demo.entity.Postule;
import com.bricolage.demo.repositories.BricoleurRepository;
import com.bricolage.demo.repositories.OffreRepository;
import com.bricolage.demo.repositories.PostuleRepository;
@Service
public class PostuleDaoImp implements PostuleDao {
	
	@Autowired
	private PostuleRepository postuleRepo;
	
	@Autowired
	private OffreRepository offreRepo;
	
	@Autowired
	private BricoleurRepository bricoleurRepository;
	

	public Postule ajouterPostule(PostuleRequest postuleRequest) {
		Offre offre = offreRepo.findById(postuleRequest.getId_offre()).orElse(null);
		Bricoleur bricoleur = bricoleurRepository.findById(postuleRequest.getId_bricoleur()).orElse(null);
		Postule postule = new Postule(offre, bricoleur, postuleRequest.getPostuleMessage(), false);
		return postuleRepo.save(postule);
	}

	public void AnnulerPostule(Long id_postule) {
		// TODO Auto-generated method stub
		postuleRepo.deleteById(id_postule);
	}

	public List<Postule> listPostulePourOffre(Long id_offre) {
		// TODO Auto-generated method stub
		Offre offre = offreRepo.findById(id_offre).orElse(null);
		return offre.getPostule();
		
	}

	
}

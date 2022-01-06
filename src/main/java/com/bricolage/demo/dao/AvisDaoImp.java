package com.bricolage.demo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricolage.demo.dto.AvisRequest;
import com.bricolage.demo.entity.Avis;
import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.User;
import com.bricolage.demo.repositories.AvisRepository;
import com.bricolage.demo.repositories.BricoleurRepository;
import com.bricolage.demo.repositories.UserRepository;

@Service
public class AvisDaoImp  implements AvisDao {

	@Autowired
	private AvisRepository avisrepo;
	
	@Autowired
	private BricoleurRepository bricolrepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public Avis ajouterAvis(AvisRequest avisRequest) {
		User user = userRepo.findById(avisRequest.getId_user()).orElse(null);
		Bricoleur bricoleur = bricolrepo.findById(avisRequest.getId_bricoleur()).orElse(null);
		if(user != null && bricoleur != null) {
			Avis avis = new Avis(user,bricoleur,avisRequest.getAvis(),LocalDate.now());
			return avisrepo.save(avis);
		}
		return null;
	}

	@Override
	public Avis modifierAvis(Long id_avis , String avisMessage) {
		Avis avis = avisrepo.findById(id_avis).orElse(null);
		avis.setAvis(avisMessage);
		return avisrepo.save(avis);
	}

	@Override
	public void supprimerAvis(Long id_avis) {
		// TODO Auto-generated method stub
		avisrepo.deleteById(id_avis);
	}

	@Override
	public List<Avis> listAvis(Long id_bricoleur) {
		// TODO Auto-generated method stub
		return avisrepo.findAll();
	}

}

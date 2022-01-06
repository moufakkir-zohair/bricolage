package com.bricolage.demo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricolage.demo.dto.OffreRequest;
import com.bricolage.demo.entity.Offre;
import com.bricolage.demo.entity.User;
import com.bricolage.demo.repositories.OffreRepository;
import com.bricolage.demo.repositories.UserRepository;

@Service
public class OffreDaoImp  implements OffreDao{
	
	@Autowired
	private OffreRepository offreRepo;
	
	@Autowired
	
	private UserRepository userRepo;

	@Override
	public Offre ajouterOffre(OffreRequest offreRequest) {
		User user = userRepo.findById(offreRequest.getId_user()).orElse(null);
		if(user != null ) {
			Offre offre = new Offre(user, offreRequest.getJobName(), offreRequest.getContents(), LocalDate.now());
			user.getOffres().add(offre);
			return offreRepo.save(offre);
		}
		return null;
	}

	@Override
	public Offre modifierOffre(Offre o) {
		return offreRepo.save(o);
	}

	@Override
	public void supprimerOffre(Long id_off) {
		offreRepo.deleteById(id_off);
	}

	@Override
	public List<Offre> listOffrePourBricoleur(String jobs) {
		return offreRepo.findByJobName(jobs);
	}

	@Override
	public List<Offre> listOffrePourUser(Long id_user) {
		User user = userRepo.findById(id_user).orElse(null);
		return user.getOffres();
	}

}

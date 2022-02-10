package com.bricolage.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.User;
import com.bricolage.demo.repositories.BricoleurRepository;
import com.bricolage.demo.repositories.CompteRepo;
import com.bricolage.demo.repositories.UserRepository;

@Service
public class CompteDaoImp implements CompteDao {

	
	@Autowired
	private BricoleurRepository bricoRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private CompteRepo compteRepo;
	
	
	@Override
	public Bricoleur ajouterBricoleur(Bricoleur bricoleur) {
		// TODO Auto-generated method stub
		return bricoRepo.save(bricoleur);
	}

	@Override
	public Bricoleur modifierBricoleur(Bricoleur bricoleur) {
		// TODO Auto-generated method stub
		return bricoRepo.save(bricoleur);
	}

	@Override
	public User ajouterUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User modifierUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void supprimerCompte(Long id) {
		// TODO Auto-generated method stub
		compteRepo.deleteById(id);
	}

	@Override
	public Bricoleur RateBricoleur(Long id_bricoleur, int Rate) {
		// TODO Auto-generated method stub
		Bricoleur b = bricoRepo.findById(id_bricoleur).orElse(null);
		   int cur_rate = b.getRate();
		   b.setRate((cur_rate + Rate)/2);
		   return b;
			}

	@SuppressWarnings("null")
	@Override
	public List<Bricoleur> ListMeilBricoleurs(String job) {
		// TODO Auto-generated method stub
		List<Bricoleur> b = bricoRepo.findAll();
		List<Bricoleur> br = null ;
		for(Bricoleur brc : b) {
			if(brc.getJob().equals(job)) {
				br.add(brc);
			}
		}
		if(br.size() <= 10) {
			return br;
		}else {
			List<Bricoleur> mb = null;
			for(Bricoleur bc : br) {
				
			}
			return null;
		}
		//return b;
	}

}

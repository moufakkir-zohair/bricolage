package com.bricolage.demo.dao;

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

}

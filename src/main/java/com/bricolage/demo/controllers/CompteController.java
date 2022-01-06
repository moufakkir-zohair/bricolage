package com.bricolage.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bricolage.demo.dao.CompteDao;
import com.bricolage.demo.entity.*;


@RestController
@RequestMapping("v1/api/bricolage/compte")
public class CompteController {
	
	@Autowired
	private CompteDao compteDao;
	
	@PostMapping("/ajouterBricoleur")
	public ResponseEntity<Bricoleur> ajouterBricoleur(@RequestBody Bricoleur bricoleur) {
		Bricoleur bricoleurCreated = compteDao.ajouterBricoleur(bricoleur);
		return new ResponseEntity<Bricoleur>(bricoleurCreated,HttpStatus.CREATED);
	}
	
	@PutMapping("/modifierBricoleur")
	public ResponseEntity<Bricoleur> modifierBricoleur(@RequestBody Bricoleur bricoleur) {
		Bricoleur bricoleurUpdated = compteDao.modifierBricoleur(bricoleur);
		return new ResponseEntity<Bricoleur>(bricoleurUpdated,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/ajouterUser")
	public ResponseEntity<User> ajouterUser(@RequestBody User user) {
		User userCreated = compteDao.ajouterUser(user);
		return new ResponseEntity<User>(userCreated,HttpStatus.CREATED);
	}
	
	@PutMapping("/modifierUser")
	public ResponseEntity<User> modifierUser(@RequestBody User user) {
		User userUpdated = compteDao.modifierUser(user);
		return new ResponseEntity<User>(userUpdated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/supprimerCompte/{id}")
	public ResponseEntity<?> supprimerCompte(@PathVariable("id") Long id) {
		compteDao.supprimerCompte(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}

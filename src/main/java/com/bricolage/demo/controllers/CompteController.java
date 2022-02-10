package com.bricolage.demo.controllers;

import java.util.List;

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
	
	@PutMapping("/rateBricoleur")
	public ResponseEntity<Bricoleur> addRate(@RequestParam Long id_bricoleur , @RequestParam int rate) {
		Bricoleur b = compteDao.RateBricoleur(id_bricoleur, rate);
		return new ResponseEntity<Bricoleur>(b,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/BestBric/{job}")
	public ResponseEntity<List<Bricoleur>> listBestBricoleur(@PathVariable("job") String job){
		List<Bricoleur> b = compteDao.ListMeilBricoleurs(job);
		return new ResponseEntity<List<Bricoleur>>(b , HttpStatus.OK);
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
	
	@GetMapping("/verifier")
	public ResponseEntity<Compte> VerifierCompte(@RequestParam String email , @RequestParam  String MDP){
	    //System.out.println("ANA HNA 2");
		Compte C = compteDao.VerifierCompte(email, MDP);
	    //System.out.println("ANA HNA 3");
	    //int type_compte = 0;
	    //if(C==null) type_compte= -1;
	    //else if(C instanceof Bricoleur) (Bricoleur) C;
	    //else if(C instanceof User) type_compte=2;
		return new ResponseEntity<>(C,HttpStatus.OK);
	}
	
}

package com.bricolage.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.bricolage.demo.dao.OffreDao;
import com.bricolage.demo.dto.OffreRequest;
import com.bricolage.demo.entity.Offre;

@RestController
@RequestMapping("v1/api/bricolage/offre")
public class OffreController {
	
	@Autowired
	private OffreDao offreDao;
	
	@PostMapping("/ajouterOffre")
	public ResponseEntity<Offre> ajouterOffre(@RequestBody OffreRequest offreRequest) {
		Offre offreCreated = offreDao.ajouterOffre(offreRequest);
		return new ResponseEntity<Offre>(offreCreated,HttpStatus.CREATED);
	}
	
	@PutMapping("/modifierOffre")
	public ResponseEntity<Offre> modifierOffre(@RequestBody Offre offre) {
		Offre offreUpdated = offreDao.modifierOffre(offre);
		return new ResponseEntity<Offre>(offreUpdated,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/supprimerOffre/{id}")
	public ResponseEntity<?> supprimerOffre(@PathVariable("id") Long id_offre) {
		offreDao.supprimerOffre(id_offre);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/listOffrePourBricoleur/{job}")
	public ResponseEntity<List<Offre>> listOffrePourBricoleur(@PathVariable("job") String job){
		List<Offre> offres = offreDao.listOffrePourBricoleur(job);
		return new ResponseEntity<List<Offre>>(offres , HttpStatus.OK);
	}
	
	@GetMapping("/listOffrePourUser/{id}")
	public ResponseEntity<List<Offre>> listOffrePourUser(@PathVariable("id") Long id_user){
		List<Offre> offres = offreDao.listOffrePourUser(id_user);
		return new ResponseEntity<List<Offre>>(offres , HttpStatus.OK);
	}
}

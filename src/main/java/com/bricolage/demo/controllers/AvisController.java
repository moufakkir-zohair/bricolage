package com.bricolage.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bricolage.demo.dao.AvisDao;
import com.bricolage.demo.dto.AvisRequest;
import com.bricolage.demo.entity.Avis;


@RestController
@RequestMapping("v1/api/bricolage/avis")
public class AvisController {
	
	@Autowired
	private AvisDao avisDao;
	
	@PostMapping("/ajouterAvis")
	public ResponseEntity<Avis> ajouterAvis(@RequestBody AvisRequest avisRequest) {
		Avis avisCreated = avisDao.ajouterAvis(avisRequest);
		return new ResponseEntity<Avis>(avisCreated,HttpStatus.CREATED);
	}
	
	
	@PutMapping("/modifierAvis")
	public ResponseEntity<Avis> modifierAvis(@RequestParam Long id_avis , @RequestParam String avis) {
		Avis avisUpdated = avisDao.modifierAvis(id_avis , avis);
		return new ResponseEntity<Avis>(avisUpdated,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/supprimerAvis/{id}")
	public ResponseEntity<Object> supprimerAvis(@PathVariable("id") Long id_avis) {
		avisDao.supprimerAvis(id_avis);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	
	@GetMapping("/listeAvisPourBricoleur/{id}")
	public ResponseEntity<List<Avis>> listAvis(@PathVariable("id") Long id_bricoleur){
		List<Avis> listAvis = avisDao.listAvis(id_bricoleur);
		return new ResponseEntity<List<Avis>>(listAvis , HttpStatus.OK);
	}
	
	
}

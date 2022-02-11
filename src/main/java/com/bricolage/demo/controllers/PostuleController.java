package com.bricolage.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bricolage.demo.dao.PostuleDao;
import com.bricolage.demo.dto.PostuleRequest;
import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.Postule;


@RestController
@RequestMapping("v1/api/bricolage/postule")
public class PostuleController {
	
	@Autowired
	private PostuleDao postuleDao;
	
	@PostMapping("/ajouterPostule")
	public ResponseEntity<Postule> ajouterPostule(@RequestBody PostuleRequest postuleRequest) {
		Postule postuleCreated = postuleDao.ajouterPostule(postuleRequest);
		return new ResponseEntity<Postule>(postuleCreated,HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/supprimerPostule/{id}")
	public ResponseEntity<Object> AnnulerPostule(@PathVariable("id") Long id_postule) {
		postuleDao.AnnulerPostule(id_postule);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/listPostulePourOffre/{id}")
	public ResponseEntity<List<Postule>> listPostulePourOffre(@PathVariable("id")  Long id_offre){
		List<Postule> postules = postuleDao.listPostulePourOffre(id_offre);
		return new ResponseEntity<List<Postule>>(postules, HttpStatus.OK);
	}
	
	
	@GetMapping("/listBricoleursPourOffre/{id}")
	public ResponseEntity<List<Bricoleur>> listBricoleurPostuleOffre(@PathVariable("id")  Long id_offre){
		List<Bricoleur> bricoleurs = postuleDao.listBricoleurPostuleOffre(id_offre);
		return new ResponseEntity<List<Bricoleur>>(bricoleurs, HttpStatus.OK);
	}
	
}

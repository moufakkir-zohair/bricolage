package com.bricolage.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bricolage.demo.entity.Bricoleur;
@Repository
@Transactional
public interface BricoleurRepository extends JpaRepository<Bricoleur, Long> {
	
	@Query("Select C from Compte C where (C.job =?1) ORDER BY rate DESC")
	public List<Bricoleur> getMlBric(String job);

}

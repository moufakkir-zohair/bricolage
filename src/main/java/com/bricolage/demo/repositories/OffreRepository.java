package com.bricolage.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {
	public List<Offre> findByJobName(String jobName);
	
	public final static String Offres_Postuler_per_Bricoleurs ="Select O from Offre O Join O.postules p Where p.bricoleur.id = :id";
	@Query(Offres_Postuler_per_Bricoleurs)
	public List<Offre> findOffreByIdBricoleurs(@Param("id") Long id);
}

package com.bricolage.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bricolage.demo.entity.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {
	public List<Offre> findByJobName(String jobName);
}

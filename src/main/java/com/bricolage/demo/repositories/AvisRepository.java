package com.bricolage.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bricolage.demo.entity.Avis;
@Repository
public interface AvisRepository extends JpaRepository<Avis, Long>{

}

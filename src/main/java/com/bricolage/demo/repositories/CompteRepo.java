package com.bricolage.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bricolage.demo.entity.Compte;


@Repository
public interface CompteRepo extends JpaRepository<Compte, Long> {

}

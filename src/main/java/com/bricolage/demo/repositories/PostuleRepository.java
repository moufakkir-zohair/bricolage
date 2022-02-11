package com.bricolage.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bricolage.demo.entity.Bricoleur;
import com.bricolage.demo.entity.Postule;
@Repository
public interface PostuleRepository extends JpaRepository<Postule, Long> {

	
}

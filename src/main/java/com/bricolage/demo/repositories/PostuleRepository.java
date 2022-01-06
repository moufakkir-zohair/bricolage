package com.bricolage.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bricolage.demo.entity.Postule;
@Repository
public interface PostuleRepository extends JpaRepository<Postule, Long> {

}

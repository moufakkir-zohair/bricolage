package com.bricolage.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bricolage.demo.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

package com.minhaAula.aulaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaAula.aulaSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

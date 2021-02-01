package com.thiago.webservicespringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.webservicespringbootjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

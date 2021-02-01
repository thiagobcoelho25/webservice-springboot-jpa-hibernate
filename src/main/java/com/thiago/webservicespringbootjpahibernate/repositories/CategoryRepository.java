package com.thiago.webservicespringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.webservicespringbootjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

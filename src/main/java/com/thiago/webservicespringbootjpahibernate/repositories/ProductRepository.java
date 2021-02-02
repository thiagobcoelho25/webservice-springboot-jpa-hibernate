package com.thiago.webservicespringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.webservicespringbootjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

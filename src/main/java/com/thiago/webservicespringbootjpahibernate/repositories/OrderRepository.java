package com.thiago.webservicespringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.webservicespringbootjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

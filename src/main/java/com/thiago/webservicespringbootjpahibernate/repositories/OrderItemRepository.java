package com.thiago.webservicespringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.webservicespringbootjpahibernate.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

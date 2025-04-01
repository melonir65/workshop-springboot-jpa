package com.rafaelmeloni.course.repositories;

import com.rafaelmeloni.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}

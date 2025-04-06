package com.rafaelmeloni.course.repositories;

import com.rafaelmeloni.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}

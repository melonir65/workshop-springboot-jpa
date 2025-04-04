package com.rafaelmeloni.course.repositories;

import com.rafaelmeloni.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}

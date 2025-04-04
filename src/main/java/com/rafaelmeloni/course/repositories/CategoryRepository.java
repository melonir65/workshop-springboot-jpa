package com.rafaelmeloni.course.repositories;

import com.rafaelmeloni.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {


}

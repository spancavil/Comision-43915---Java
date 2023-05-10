package com.coderhouse.clase8JPAABM.repository;

import com.coderhouse.clase8JPAABM.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

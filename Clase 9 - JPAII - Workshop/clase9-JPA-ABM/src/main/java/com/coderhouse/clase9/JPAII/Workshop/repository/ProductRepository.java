package com.coderhouse.clase9.JPAII.Workshop.repository;

import com.coderhouse.clase9.JPAII.Workshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

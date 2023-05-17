package com.coderhouse.clase10.ApiRest.Postman.repository;

import com.coderhouse.clase10.ApiRest.Postman.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

package com.coderhouse.clase11.ApiRest.PostmanII.repository;

import com.coderhouse.clase11.ApiRest.PostmanII.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

package com.example.demotest3.repository;

import com.example.demotest3.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product , Long> {
}

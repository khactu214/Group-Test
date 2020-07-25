package com.example.demotest3.repository;

import com.example.demotest3.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ProductModel extends PagingAndSortingRepository<Product, Integer> {

    Page<Product> findProductByStatus(int status, Pageable pageable);
    Page<Product> findProductsByStatus(int status, Pageable pageable);
    Page<Product> findProductsByPrice(int price, Pageable pageable);
    Page<Product> findByName(String name, Pageable pageable);
    Page<Product> findByNameAndPrice(String name, int price, Pageable pageable);
    List<Product> findDistinctByName(String name);


}
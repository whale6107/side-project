package com.example.sideproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sideproject.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>  {

}

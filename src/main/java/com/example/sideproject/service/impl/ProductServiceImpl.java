package com.example.sideproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sideproject.exception.ResourceNotFoundException;
import com.example.sideproject.model.Product;
import com.example.sideproject.repository.ProductRepository;
import com.example.sideproject.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductRepository productRepository;

 
    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
 
    @Override
    public Product getProduct(long id) {
        return productRepository
          .findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }
 
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}

package com.example.sideproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sideproject.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}

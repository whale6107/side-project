package com.example.sideproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sideproject.model.OrderProduct;
import com.example.sideproject.model.OrderProductPK;

public interface OrderProductRepository  extends CrudRepository<OrderProduct, OrderProductPK> {

}

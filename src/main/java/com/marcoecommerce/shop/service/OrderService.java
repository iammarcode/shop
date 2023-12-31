package com.marcoecommerce.shop.service;

import com.marcoecommerce.shop.model.order.OrderEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    OrderEntity save(OrderEntity customerEntity);

    List<OrderEntity> findAll();

    Optional<OrderEntity> findById(Long id);

    boolean isExist(Long id);

    void deleteById(Long id);

    OrderEntity partialUpdate(Long id, OrderEntity authorEntity);
}

package com.onlineshoppingmicroservices.orderservice.repository;

import com.onlineshoppingmicroservices.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

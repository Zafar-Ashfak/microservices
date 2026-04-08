package com.microservices.orderservice.repository;
//# test for Github github
import com.microservices.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

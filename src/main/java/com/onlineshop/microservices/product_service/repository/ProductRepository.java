package com.onlineshop.microservices.product_service.repository;

import com.onlineshop.microservices.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

package com.me.Productos.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.Productos.microserver.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}


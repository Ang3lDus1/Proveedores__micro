package com.me.Productos.microservers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.Productos.microserver.entity.Product;
import com.me.Productos.microserver.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product crearProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> obtenerTodosLosProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> obtenerProductPorId(String id) {
        return productRepository.findById(id);
    }

    public Product actualizarProduct(Product product) {
        return productRepository.save(product);
    }

    public void eliminarProductPorId(String id) {
        productRepository.deleteById(id);
    }
}

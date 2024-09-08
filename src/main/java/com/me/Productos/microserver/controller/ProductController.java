package com.me.Productos.microserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.me.Productos.microserver.entity.Product;
import com.me.Productos.microservers.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> crearProduct(@RequestBody Product product) {
        Product nuevoProduct = productService.crearProduct(product);
        return ResponseEntity.ok(nuevoProduct);
    }

    @GetMapping
    public ResponseEntity<List<Product>> obtenerTodosLosProduct() {
        List<Product> products = productService.obtenerTodosLosProduct();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> obtenerProductPorId(@PathVariable String id) {
        Optional<Product> product = productService.obtenerProductPorId(id);
        return product.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> actualizarProduct(@PathVariable String id, @RequestBody Product product) {
        product.setId(id);
        Product productActualizado = productService.actualizarProduct(product);
        return ResponseEntity.ok(productActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProduct(@PathVariable String id) {
        productService.eliminarProductPorId(id);
        return ResponseEntity.noContent().build();
    }
}


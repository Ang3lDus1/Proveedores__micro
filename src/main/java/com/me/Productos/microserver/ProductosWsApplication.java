package com.me.Productos.microserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ap.microserver")
public class ProductosWsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductosWsApplication.class, args);
    }
}

package com.me.Productos.microserver.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "product")

public class Product {
	
	

    @Id
    private String id;
    private String nombre;
    private double precio;
    private int strock;
    
    
	public Product(String id, String nombre, double precio, int strock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.strock = strock;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStrock() {
		return strock;
	}
	public void setStrock(int strock) {
		this.strock = strock;
	}
    
    
}
package com.example.nisabalci.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nisabalci.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository <Product, Integer>{
	
	

}

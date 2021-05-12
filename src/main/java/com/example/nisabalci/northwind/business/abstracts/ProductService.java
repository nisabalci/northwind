package com.example.nisabalci.northwind.business.abstracts;

import java.util.List;

import com.example.nisabalci.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}

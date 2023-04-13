package com.example.SpringBootDemoApp.Dao;

import com.example.SpringBootDemoApp.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}

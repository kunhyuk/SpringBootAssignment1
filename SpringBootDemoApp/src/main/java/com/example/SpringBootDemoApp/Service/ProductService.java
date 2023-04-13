package com.example.SpringBootDemoApp.Service;
import com.example.SpringBootDemoApp.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductByID(int productID);
    Product addProduct(Product product);
    Product updateProduct(Product product);
    String deleteProductByID(int productID);
}

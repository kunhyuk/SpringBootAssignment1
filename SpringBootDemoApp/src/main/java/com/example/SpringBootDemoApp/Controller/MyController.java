package com.example.SpringBootDemoApp.Controller;

import com.example.SpringBootDemoApp.Entity.Product;
import com.example.SpringBootDemoApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MyController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public String home() {
        return "<HTML><H3>Welcome to homepage you can add, edit, and delete products here! </H3></HTML>";
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
        return this.productService.getAllProduct();
    }
    @GetMapping("/products/{productID}")
    public Product getProduct(@PathVariable String productID) {
        return this.productService.getProductByID(Integer.parseInt(productID));
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }
    @DeleteMapping("/products/{productID}")
    public String deleteProduct(@PathVariable String productID) {
        return this.productService.deleteProductByID(Integer.parseInt(productID));
    }
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return this.productService.updateProduct(product);
    }

}

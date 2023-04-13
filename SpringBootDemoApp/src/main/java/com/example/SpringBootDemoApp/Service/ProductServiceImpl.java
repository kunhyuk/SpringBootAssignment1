package com.example.SpringBootDemoApp.Service;

import com.example.SpringBootDemoApp.Dao.ProductDao;
import com.example.SpringBootDemoApp.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> getAllProduct() {
        return this.productDao.findAll();
    }

    @Override
    public Product getProductByID(int productID) {
        Optional <Product> p = this.productDao.findById(productID);
        Product product = null;
        if (p.isPresent()) {
            product = p.get();
        } else {
            throw new RuntimeException("Product not found for id: " + productID);
        }
        return product;
    }

    @Override
    public Product addProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public String deleteProductByID(int productID) {
        this.productDao.deleteById(productID);
        return "DELETED PRODUCT: " + productID;
    }
}

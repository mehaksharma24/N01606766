package com.example.midterm.services;

import com.example.midterm.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    ProductRepository ProductRepository;
    private Object Product;

    public void addProduct(Product product) {
        logger.info("Adding a new Product: {}", Product.getProduct());
        ProductRepository.save(Product);
    }

    public Product searchProduct(String prodName, long id) {
        logger.info("Fetching product by id from the database");
        List<Product> userList = ProductRepository.findByprodName(prodName);
        return userList.stream().filter(user -> user.getid().equals(id)).findFirst().orElse(null);
    }

    public void deleteProduct(Product product) {
        logger.info("Delete Product: {}", Product.getproduct());
        Object Product;
        ProductRepository.delete(Product);
    }

    public void updateProduct(Product product) {
        logger.info("update Product: {}", Product.getproduct());
        Object Product;
        ProductRepository.update(Product);
    }

    public void updatestock(Product stock) {
        logger.info("Current Stock: {}", Product.getstock());
        ProductRepository.update(stock);
    }
}


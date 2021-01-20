package com.baciSmile.eureka.client.service;

import com.baciSmile.eureka.client.pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProducts();

    Product findById(int id);

}

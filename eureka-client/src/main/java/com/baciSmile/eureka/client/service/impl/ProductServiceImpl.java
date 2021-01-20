package com.baciSmile.eureka.client.service.impl;

import com.baciSmile.eureka.client.pojo.Product;
import com.baciSmile.eureka.client.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer, Product> daoMap = new HashMap<>();

    static {
        Product p1 = new Product(1, "iphone5", 5200, 1200);
        Product p2 = new Product(2, "iphone6", 5500, 1300);
        Product p3 = new Product(3, "iphone7", 5800, 1100);
        Product p4 = new Product(4, "iphone8", 6100, 1000);
        Product p5 = new Product(5, "iphone9", 6800, 1600);

        daoMap.put(p1.getId(), p1);
        daoMap.put(p2.getId(), p2);
        daoMap.put(p3.getId(), p3);
        daoMap.put(p4.getId(), p4);
        daoMap.put(p5.getId(), p5);
    }

    @Override
    public List<Product> listProducts() {
        Collection<Product> products = daoMap.values();
        return new ArrayList<>(products);
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}

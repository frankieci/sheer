package com.baciSmile.eureka.client.controller;

import com.baciSmile.eureka.client.pojo.Product;
import com.baciSmile.eureka.client.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    public Object list() {
        return productService.listProducts();
    }

    @RequestMapping("find")
    public Object findById(@RequestParam("id") int id) {
        Product product = productService.findById(id);
        Product copyProduct = new Product();
        BeanUtils.copyProperties(product, copyProduct);
        copyProduct.setName(copyProduct.getName() + "  data from port:" + port);
        return copyProduct;
    }
}

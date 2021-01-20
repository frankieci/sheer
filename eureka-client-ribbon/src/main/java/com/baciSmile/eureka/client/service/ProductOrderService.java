package com.baciSmile.eureka.client.service;

import com.baciSmile.eureka.client.pojo.ProductOrder;

public interface ProductOrderService {

    public ProductOrder save(int userId, int productId);
}

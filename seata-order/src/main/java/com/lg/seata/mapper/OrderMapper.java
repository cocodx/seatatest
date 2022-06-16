package com.lg.seata.mapper;

import com.lg.seata.entity.Order;

public interface OrderMapper {

    /**
     * 创建订单
     * @param order
     */
    void createOrder(Order order);
}

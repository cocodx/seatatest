package com.lg.seata.service.impl;

import com.lg.seata.entity.Order;
import com.lg.seata.mapper.OrderMapper;
import com.lg.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author amazfit
 * @date 2022-06-16 下午11:37
 **/
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public void createService(Order order) {
        orderMapper.createOrder(order);
    }
}

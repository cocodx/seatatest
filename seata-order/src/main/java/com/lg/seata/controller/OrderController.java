package com.lg.seata.controller;

import com.lg.seata.entity.Order;
import com.lg.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author amazfit
 * @date 2022-06-16 下午11:38
 **/
@RestController
@RequestMapping("/seata")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public boolean createOrder(@RequestBody Order order){
        System.out.println("order:"+order);
        //生成订单ID
        order.setOrderNo(UUID.randomUUID().toString());
        orderService.createService(order);
        return true;
    }
}

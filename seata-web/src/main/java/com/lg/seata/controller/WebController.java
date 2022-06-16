package com.lg.seata.controller;

import com.lg.seata.entity.Order;
import com.lg.seata.feign.AccountFeignService;
import com.lg.seata.feign.OrderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amazfit
 * @date 2022-06-17 上午12:44
 **/
@RestController
public class WebController {

    @Autowired
    private OrderFeignService orderFeignService;

    @Autowired
    private AccountFeignService accountFeignService;

    @PostMapping("/shopping")
    public boolean shopping(Order order){
        //1、创建订单
        orderFeignService.createOrder(order);
        //2、decrease money
        accountFeignService.decrease(order.getAmount(),order.getUserId());
        return true;
    }
}

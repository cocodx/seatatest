package com.lg.seata.feign;

import com.lg.seata.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "seata-order")
public interface OrderFeignService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    @PostMapping("/seata/createOrder")
    public boolean createOrder(@RequestBody Order order);
}

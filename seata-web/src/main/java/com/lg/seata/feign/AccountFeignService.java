package com.lg.seata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author amazfit
 * @date 2022-06-17 上午12:41
 **/
@FeignClient(value = "seata-account")
public interface AccountFeignService {

    /**
     * 账号扣钱
     * @param amount
     * @param userId
     * @return
     */
    @PostMapping("/account/decrease")
    public boolean decrease(@RequestParam("amount")Integer amount,@RequestParam("userId")Integer userId);
}

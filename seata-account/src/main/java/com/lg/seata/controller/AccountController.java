package com.lg.seata.controller;

import com.lg.seata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amazfit
 * @date 2022-06-17 上午12:06
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/decrease")
    public boolean decrease(@RequestParam("amount")Integer amount,@RequestParam("userId")Integer userId){
        Map<String,Object> map = new HashMap<>();
        map.put("amount",amount);
        map.put("userId",userId);
        accountService.decrease(map);
        return true;
    }
}

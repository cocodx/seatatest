package com.lg.seata.service.impl;

import com.lg.seata.mapper.AccountMapper;
import com.lg.seata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author amazfit
 * @date 2022-06-17 上午12:04
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void decrease(Map map) {
        accountMapper.decrease(map);
    }
}

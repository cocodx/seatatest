package com.lg.seata.mapper;

import java.util.Map;

public interface AccountMapper {

    /**
     * 账户扣钱
     * @param map
     */
    void decrease(Map map);
}

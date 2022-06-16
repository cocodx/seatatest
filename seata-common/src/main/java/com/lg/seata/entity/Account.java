package com.lg.seata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author amazfit
 * @date 2022-06-16 下午11:26
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    //编号
    private Integer id;

    //用户编号
    private Integer userId;

    //账户余额
    private Integer balance;

    //备注
    private String remark;
}

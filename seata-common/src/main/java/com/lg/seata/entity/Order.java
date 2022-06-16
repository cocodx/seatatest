package com.lg.seata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author amazfit
 * @date 2022-06-16 下午11:24
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    //编号
    private Integer id;

    //订单号
    private String orderNo;

    //用户编号
    private Integer userId;

    //购买数量
    private Integer count;

    //购买金额
    private Integer amount;

    //备注
    private String remark;
}

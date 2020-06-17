package com.wang.whj.entity;

import java.io.Serializable;

/**
 * (TOrder2)实体类
 *
 * @author makejava
 * @since 2020-06-17 15:24:00
 */
public class TOrder2 implements Serializable {
    private static final long serialVersionUID = -37416657181526616L;
    
    private Long orderId;
    
    private Double price;
    
    private Long userId;
    
    private String status;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
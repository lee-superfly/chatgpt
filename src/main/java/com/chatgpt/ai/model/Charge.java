package com.chatgpt.ai.model;

import java.io.Serializable;
import java.util.Date;

/**
 * charge
 *
 * @author
 */
public class Charge implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户充值金额
     */
    private Integer amount;

    /**
     * 支付方式:0.代表支付宝支付；1 代表微信支付
     */
    private String payMethod;

    /**
     * 支付状态：0 支付中；1 支付成功；2 支付失败；3 取消支付
     */
    private String status;

    /**
     * 充值时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
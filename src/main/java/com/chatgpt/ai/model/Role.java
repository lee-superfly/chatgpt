package com.chatgpt.ai.model;

import java.io.Serializable;

/**
 * role
 * @author 
 */
public class Role implements Serializable {
    private Integer id;

    /**
     * vip等级
     */
    private String vipLevel;

    /**
     * 访问次数上限
     */
    private Integer limitCount;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
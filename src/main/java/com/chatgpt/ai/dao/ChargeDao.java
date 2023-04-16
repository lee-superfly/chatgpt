package com.chatgpt.ai.dao;

import com.chatgpt.ai.model.Charge;

public interface ChargeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Charge record);

    int insertSelective(Charge record);

    Charge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Charge record);

    int updateByPrimaryKey(Charge record);
}
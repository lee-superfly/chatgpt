package com.chatgpt.ai.dao;

import com.chatgpt.ai.model.UsrRole;

public interface UsrRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UsrRole record);

    int insertSelective(UsrRole record);

    UsrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsrRole record);

    int updateByPrimaryKey(UsrRole record);
}
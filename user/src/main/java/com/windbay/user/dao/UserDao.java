package com.windbay.user.dao;

import com.windbay.user.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    UserPO selectByPrimaryKey(Long id);
}

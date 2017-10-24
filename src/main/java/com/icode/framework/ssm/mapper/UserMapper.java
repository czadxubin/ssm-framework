package com.icode.framework.ssm.mapper;

import com.icode.framework.ssm.entity.User;
public interface UserMapper {
	User findByUsername(String username);
}

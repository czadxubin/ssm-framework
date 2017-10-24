package com.icode.framework.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icode.framework.ssm.entity.User;
import com.icode.framework.ssm.mapper.UserMapper;
import com.icode.framework.ssm.service.inter.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}

}

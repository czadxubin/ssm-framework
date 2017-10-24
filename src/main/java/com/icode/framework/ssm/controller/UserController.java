package com.icode.framework.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icode.framework.ssm.entity.User;
import com.icode.framework.ssm.service.inter.UserService;
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping(produces="application/json;charset=utf-8",value="findByUsername")
	public User findByUsername(String username){
		return userService.findByUsername(username);
	}
}

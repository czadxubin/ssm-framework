package com.icode.framework.ssm.service.inter;

import com.icode.framework.ssm.entity.User;

public interface UserService {
	User findByUsername(String username);
}

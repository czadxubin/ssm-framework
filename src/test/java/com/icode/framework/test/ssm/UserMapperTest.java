package com.icode.framework.test.ssm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icode.framework.ssm.entity.User;
import com.icode.framework.ssm.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext*.xml"})
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testMapperFactoryBean(){
		String username = "testUser";
		User user = userMapper.findByUsername(username );
		System.out.println(user);
	}
}

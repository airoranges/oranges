package com.github.staging.service.impl;


import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import com.github.staging.entity.User;
import com.github.staging.mapper.UserMapper;
import com.github.staging.service.ex.UsernameDuplicateException;
import com.github.staging.service.util.Loginfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest{
	@Autowired
	private UserMapper mapper;
	
	@Test
	public void reg() {
		String str="adminsss";
		User user =new User();
		user.setUsername(str);
		user.setPassword("123456");
		user=new Loginfo().getUserLogInfo(user);

		String salt=UUID.randomUUID().toString();
		user.setSalt(salt);
		String password=user.getPassword();
		String msg=salt+password+salt;
		for (int i = 0; i < 3; i++) {
			msg=DigestUtils.md5DigestAsHex(msg.getBytes());
		}
		String md5Password=msg;
		user.setPassword(md5Password);
		
//		String selectUserByUsername = mapper.selectUserByUsername(user);
//
//		if (selectUserByUsername==null) 
//			mapper.insertUser(user);
//		
//		if (selectUserByUsername!=null) 
//			throw new UsernameDuplicateException("用户已存在");
//	

	}
	
	
}

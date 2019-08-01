package com.github.staging.service.impl;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.staging.entity.User;
import com.github.staging.mapper.UserMapper;
import com.github.staging.service.ex.PasswordNotMatchException;
import com.github.staging.service.ex.UserNotFoundException;
import com.github.staging.service.ex.UsernameDuplicateException;
import com.github.staging.service.inter.IUserService;
import com.github.staging.service.util.Loginfo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper mapper;

	@Override
	public void reg(User user) {
		user=new Loginfo().getUserLogInfo(user);
		String salt=UUID.randomUUID().toString();
		user.setSalt(salt);
		String password=user.getPassword();
		String md5Password=getMd5Password(password, salt);
		user.setPassword(md5Password);
		
		User queryByUsername = mapper.queryByUsername(user);

		if (queryByUsername==null) 
			mapper.insertUser(user);
	
		if (queryByUsername!=null) 
			throw new UsernameDuplicateException("用户已存在");
	}
	@Override
	public User login(User user) throws PasswordNotMatchException, UserNotFoundException {
		User queryByUsername = mapper.queryByUsername(user);
		if (queryByUsername==null) {
			throw new UserNotFoundException("用户不存在");
		}
		else{
			String salt=queryByUsername.getSalt();
			String password=user.getPassword();
			String md5Password = getMd5Password(password, salt);
			if (md5Password.equals(queryByUsername.getPassword())) {
				if (queryByUsername.getIsDelete()==null) {
					queryByUsername.setPassword(null);
					queryByUsername.setSalt(null);
					return queryByUsername;
				}
				throw new UserNotFoundException("用户已删除");
			}
			throw new PasswordNotMatchException("密码错误");
		}
	}

	/**
	 * 
	 * @param password
	 * @param salt
	 * @return 加密后的密码
	 */
	private String getMd5Password(String password,String salt) {
		//salt+password+salt 再进行三次md5加密
		String msg=salt+password+salt;
		for (int i = 0; i < 3; i++) {
			msg=DigestUtils.md5Hex(msg.getBytes());
		}
		return msg;
	}
}

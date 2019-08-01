package com.github.staging.service.inter;

import com.github.staging.entity.User;
import com.github.staging.service.ex.InsertException;
import com.github.staging.service.ex.PasswordNotMatchException;
import com.github.staging.service.ex.UserNotFoundException;
import com.github.staging.service.ex.UsernameDuplicateException;

public interface IUserService {
	/**
	 * 用户注册
	 * @param user 用户数据
	 * @throws UsernameDuplicateException
	 * @throws InsertException
	 */
	void reg(User user)throws UsernameDuplicateException,InsertException;
	/**
	 * 用户登陆
	 * @param user
	 * @return
	 * @throws PasswordNotMatchException
	 * @throws UserNotFoundException
	 */
	User login(User user)throws PasswordNotMatchException,UserNotFoundException;
}

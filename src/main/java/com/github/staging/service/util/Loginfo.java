package com.github.staging.service.util;

import java.util.Date;

import com.github.staging.entity.User;

public class Loginfo {

	public User getUserLogInfo(User user) {
		String username = user.getUsername();
		user.setCreateUser(username);
		Date now = new Date();
		user.setCreatedTime(now);
		user.setModifiedUser(username);
		user.setModifiedTime(now);
		return user;
	}

}

package com.github.staging.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.github.staging.entity.User;

public interface UserMapper {
	
	Integer insertUser(User user);
	
	User queryByUsername(User user);
	
	Integer deleteById(User user);

	Integer updateById(User user);
	
	@MapKey(value = "uid")
	Map<Integer,Map<Integer,User>> selectAll();
	
	User selectOne();
}

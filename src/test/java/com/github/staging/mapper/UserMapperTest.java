package com.github.staging.mapper;


import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.staging.entity.User;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper mapper;
	
	@Test
	public void insertUserTest() {

		User user = new User();
		user.setUsername("admin");
		user.setPassword("123456");;
//		user.setSalt("8888");
//		user.setIsDelete(1);
//		user.setPhone("13338888777");
//		user.setEmail("git@gmail.com");
//		user.setGender(1);
//		user.setAvatar("/templates/img");
//		user.setCreateUser("admin");
//		user.setCreatedTime(new Date(1000));
//		user.setModifiedUser(null);
//		user.setModifiedTime(null);
		Integer insertUser = mapper.insertUser(user);
		System.out.println(insertUser);
	}
	@Test
	public void deleteByIdTest() {
		Integer integer=2;
		User user=new User();
		user.setUid(integer);
		System.out.println(user);
		Integer deleteById = mapper.deleteById(user);
		System.out.println(deleteById);
		
	}
	
	@Test
	public void updateByIdTest() {
		Integer integer=3;
		User user=new User();
		user.setUid(integer);
		user.setEmail("git@gmail.com");
		Integer updateById = mapper.updateById(user);
		System.out.println(updateById);
		
	}
	
	@Test
	public void selectAll() {
		Map<Integer, Map<Integer, User>> selectAll = mapper.selectAll();
		System.err.println(selectAll);
		
	}


}

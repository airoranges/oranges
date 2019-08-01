package com.github.staging;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;
import org.springframework.util.DigestUtils;

public class testMd5 {

	@Test
	public void test() {
		String password="";
		String password1="12345";
		String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
		String md5DigestAsHex1 = DigestUtils.md5DigestAsHex(password1.getBytes());
		String salt=UUID.randomUUID().toString();
		System.out.println(salt);
		System.out.println(md5DigestAsHex);
		System.out.println(md5DigestAsHex1);
	}

}

package com.github.staging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.staging.entity.User;
import com.github.staging.service.inter.IUserService;
import com.github.staging.service.util.JsonResult;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController{
	
	@Autowired
	private IUserService iuserService;
	
	@PostMapping("/reg")
	public JsonResult<Void> reg(User user){
		iuserService.reg(user);
		return new JsonResult<Void>(SUCCESS);
	}
	
	@PostMapping("/login")
	public JsonResult<Void> login(User user){
		iuserService.login(user);
		return new JsonResult<Void>(SUCCESS);
	}
}

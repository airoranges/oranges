package com.github.staging.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class User extends BaseEntity{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer uid;
	private String username;	
	private String password;
	private String salt;
	//0代表删除,1代表未删除
	private Integer isDelete;
	private String phone;
	private String email;
	//0代表女,1代表男
	private Integer gender;
	private String avatar;
	
}

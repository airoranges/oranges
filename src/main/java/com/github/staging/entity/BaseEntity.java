package com.github.staging.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String createUser;
	private Date createdTime;
	private String modifiedUser;
	private Date modifiedTime;

}

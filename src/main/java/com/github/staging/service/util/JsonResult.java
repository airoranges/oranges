package com.github.staging.service.util;

import lombok.Data;

@Data
public class JsonResult<T> {
	
	private Integer state;
	private String message;
	private T data;
	
	public JsonResult() {
	}

	public JsonResult(Integer state) {
		super();
		this.state = state;
	}
	
	
		
	
}

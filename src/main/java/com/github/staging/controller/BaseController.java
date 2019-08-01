package com.github.staging.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.staging.service.ex.InsertException;
import com.github.staging.service.ex.PasswordNotMatchException;
import com.github.staging.service.ex.ServiceException;
import com.github.staging.service.ex.UserNotFoundException;
import com.github.staging.service.ex.UsernameDuplicateException;
import com.github.staging.service.util.JsonResult;


public abstract class BaseController {
	/**
	 * 對控制器中的異常進行統一處理
	 * @param e 異常對象
	 * @return	JsonResult封裝響應信息
	 */
	protected static final Integer SUCCESS=20; 
	
	protected static final Integer ERROR_USERNAME_DUPLICATE=30;
	protected static final Integer ERROR_USER_NOTFOUND=31;
	protected static final Integer ERROR_PASSWORD_NOTMATH=32;
	
	protected static final Integer ERROR_INSERT=40; 
	
	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public JsonResult<Void> handleException(Throwable e){
		/**
		 * 根据不同的类型提供不同的处理方式
		 * 现在的处理方式是根据不同的类型，返回不同的状态
		 */
		JsonResult<Void> jr=new JsonResult<>();
		
		if(e instanceof UsernameDuplicateException){
			jr.setState(ERROR_USERNAME_DUPLICATE);
			jr.setMessage(e.getMessage());
		} 
		if(e instanceof InsertException){
			jr.setState(ERROR_INSERT);
			jr.setMessage(e.getMessage());
		}
		if(e instanceof UserNotFoundException){
			jr.setState(ERROR_USER_NOTFOUND);
			jr.setMessage(e.getMessage());
		}
		if(e instanceof PasswordNotMatchException){
			jr.setState(ERROR_PASSWORD_NOTMATH);
			jr.setMessage(e.getMessage());
		}

		return jr;
	}
}

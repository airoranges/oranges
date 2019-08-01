package com.github.staging.service.ex;

/**
 * 用户名查找不到异常
 * @author 小七
 *
 */
public class UserNotFoundException extends ServiceException{

	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super();
		 
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		 
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
		 
	}

	public UserNotFoundException(String message) {
		super(message);
		 
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
		 
	}
	
	
	
	
}

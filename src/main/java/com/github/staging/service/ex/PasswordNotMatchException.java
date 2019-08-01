package com.github.staging.service.ex;

/**
 * 密码查找不到异常
 * @author 小七
 *
 */
public class PasswordNotMatchException extends ServiceException{

	private static final long serialVersionUID = 1L;

	public PasswordNotMatchException() {
		super();
		 
	}

	public PasswordNotMatchException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		 
	}

	public PasswordNotMatchException(String message, Throwable cause) {
		super(message, cause);
		 
	}

	public PasswordNotMatchException(String message) {
		super(message);
		 
	}

	public PasswordNotMatchException(Throwable cause) {
		super(cause);
		 
	}
	
	
	
	
}

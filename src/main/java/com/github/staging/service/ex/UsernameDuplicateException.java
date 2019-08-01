package com.github.staging.service.ex;

/**
 *  添加的用户已经存在时所产生的异常
 * @author 小七
 *
 */
public class UsernameDuplicateException extends ServiceException{

	private static final long serialVersionUID = 1L;

	public UsernameDuplicateException() {
		super();
		 
	}

	public UsernameDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		 
	}

	public UsernameDuplicateException(String message, Throwable cause) {
		super(message, cause);
		 
	}

	public UsernameDuplicateException(String message) {
		super(message);
		 
	}

	public UsernameDuplicateException(Throwable cause) {
		super(cause);
		 
	}
	
	
	
	
}

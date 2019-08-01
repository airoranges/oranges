package com.github.staging.service.ex;

/**
 * 插入操作时出现的异常
 * 对于无法描述原因或特殊情况下出现的异常
 * @author 小七
 *
 */
public class InsertException extends ServiceException{

	private static final long serialVersionUID = 1L;

	public InsertException() {
		super();
		 
	}

	public InsertException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		 
	}

	public InsertException(String message, Throwable cause) {
		super(message, cause);
		 
	}

	public InsertException(String message) {
		super(message);
		 
	}

	public InsertException(Throwable cause) {
		super(cause);
		 
	}
	
	
	
	
}

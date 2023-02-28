package com.bus.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyError> adminExceptionHandler(AdminException ae, WebRequest we){
		
		MyError me=new MyError(LocalDateTime.now(), ae.getMessage(), we.getDescription(false));
		
		return new ResponseEntity<MyError>(me,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyError> userExceptionHandler(UserException ae, WebRequest we){
		
		MyError me=new MyError(LocalDateTime.now(), ae.getMessage(), we.getDescription(false));
		
		return new ResponseEntity<MyError>(me,HttpStatus.BAD_REQUEST);
	}
}

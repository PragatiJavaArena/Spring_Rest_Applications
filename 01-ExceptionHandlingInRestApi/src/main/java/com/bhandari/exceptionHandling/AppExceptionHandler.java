package com.bhandari.exceptionHandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bhandari.binding.ErrorInfo;

//global exception handler class for whole application

@RestControllerAdvice
public class AppExceptionHandler {

	// specific to any user defined exception want to execute

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleExceptionUNE(UserNotFoundException e) {

		String msg = e.getMessage();

		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0003");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}

	// this method will executes for all exception that are subclasses of Exception class ,
	// it is global method for whole application
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handlexception(Exception e) {
		// instead of displaying white label we are displaying JSON data with proper
		// user understandable messages
		String msg = e.getMessage();
		ErrorInfo info = new ErrorInfo();
		info.setCode("SBIEX0003");
		info.setMsg(msg);
		info.setWhen(LocalDateTime.now());

		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

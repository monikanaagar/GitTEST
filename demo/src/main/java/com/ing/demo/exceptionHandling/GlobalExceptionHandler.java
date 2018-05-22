/**
 * 
 */
package com.ing.demo.exceptionHandling;

import java.security.InvalidKeyException;

import javax.persistence.NoResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author bdeshpan
 * Central Exception handler class. Will catch all the Exceptions.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * Will catch No record found exception.
	 */
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No Record Found for given input.")
	@ExceptionHandler(NoResultException.class)
	public void handleNoResultException(){
		logger.error("NoResultException handler executed");
	}
	
	/**
	 * Will catch No record found exception.
	 */
	@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="Not Authorized")
	@ExceptionHandler(InvalidKeyException.class)
	public void handleInvalidKeyException(){
		logger.error("InvalidKeyException handler executed");
	}
	
	/**
	 * Handling Bad Request
	 */
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="customer id to long .")
	@ExceptionHandler(NumberFormatException.class)
	public void handleNumberFormatException(){
		logger.error("NumberFormatException handler executed");
	}
	
	
	/**
	 * Will handle all uncaught exceptions/Runtime Exceptions.
	 */
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Something went wrong please try again.")
	@ExceptionHandler(Exception.class)
	public final void handleAllExceptions(Exception e) {
		System.out.println(e);
		
	}
	
}

package com.cg.hims.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
     
         @ExceptionHandler(PolicyHolderNotFoundException.class)
         public ResponseEntity<?> policyHolderNotFoundException(PolicyHolderNotFoundException ex, WebRequest request) {
              ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
              return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
         }
         @ExceptionHandler(AgentNotFoundException.class)
         public ResponseEntity<?> agentNotFoundException(AgentNotFoundException ex, WebRequest request) {
              ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
              return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
         	}
         @ExceptionHandler(PolicyNotFoundException.class)
         public ResponseEntity<?> PolicyNotFoundException(PolicyNotFoundException ex, WebRequest request) {
              ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
              return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
         }
         
         @ExceptionHandler(QuoteNotFoundException.class)
         public ResponseEntity<?> quoteNotFoundException(QuoteNotFoundException ex, WebRequest request) {
              ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
              return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
         }
         @ExceptionHandler(Exception.class)
         public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
             ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
             return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
             
             
         }
         
         @ExceptionHandler(InvalidCredentialException.class)
         public ResponseEntity<?> invalidCredentialException(InvalidCredentialException ex, WebRequest request) {
              ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
              return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
}
         
          
}
         
    
    
    
 
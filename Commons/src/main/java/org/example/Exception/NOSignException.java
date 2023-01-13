package org.example.Exception;

/**
 * 未进行数字签名异常
 */
public class NOSignException extends RuntimeException{
 public  NOSignException(String message){
     super(message);
 }
}

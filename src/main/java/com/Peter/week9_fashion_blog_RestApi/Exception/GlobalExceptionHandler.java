package com.Peter.week9_fashion_blog_RestApi.Exception;

import com.Peter.week9_fashion_blog_RestApi.Pojos.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiResponse<String> handleNotFoundException(NotFoundException ex){
        return  new ApiResponse<>(ex.getMessage(), HttpStatus.NOT_FOUND.value(), null);
    }




    @ExceptionHandler(PostAlreadyLikedException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiResponse<String> handlePostAlreadyLikedException(PostAlreadyLikedException ex){
        return  new ApiResponse<>(ex.getMessage(), HttpStatus.NOT_FOUND.value(), null);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)

    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->{
            errorMap.put(error.getField(), error.getDefaultMessage());

        });
        return errorMap;
    }

}

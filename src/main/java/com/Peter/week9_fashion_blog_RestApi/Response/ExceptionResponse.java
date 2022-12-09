package com.Peter.week9_fashion_blog_RestApi.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@AllArgsConstructor
public class ExceptionResponse {
    private String message;
    private HttpStatus status;
    
}

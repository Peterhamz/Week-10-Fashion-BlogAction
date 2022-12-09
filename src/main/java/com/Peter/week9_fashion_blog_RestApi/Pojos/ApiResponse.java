package com.Peter.week9_fashion_blog_RestApi.Pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private String message;
    private int status;
    private T data;
}

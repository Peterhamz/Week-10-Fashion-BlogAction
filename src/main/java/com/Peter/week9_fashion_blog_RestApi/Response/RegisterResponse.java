package com.Peter.week9_fashion_blog_RestApi.Response;

import com.Peter.week9_fashion_blog_RestApi.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private String message;
    private LocalDateTime timeStamp;
    private User user;
}

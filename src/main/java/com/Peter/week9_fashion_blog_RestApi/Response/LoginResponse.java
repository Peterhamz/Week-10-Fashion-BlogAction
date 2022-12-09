package com.Peter.week9_fashion_blog_RestApi.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String Message;
    private LocalDateTime timeStamp;
}

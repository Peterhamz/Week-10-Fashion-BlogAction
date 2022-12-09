package com.Peter.week9_fashion_blog_RestApi.Response;

import com.Peter.week9_fashion_blog_RestApi.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostResponse {
    private String title;
    private LocalDateTime timeStamp;
    private Post post;
}

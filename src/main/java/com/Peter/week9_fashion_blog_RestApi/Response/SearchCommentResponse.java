package com.Peter.week9_fashion_blog_RestApi.Response;

import com.Peter.week9_fashion_blog_RestApi.Model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchCommentResponse {
    private String message;
    private LocalDateTime timeStamp;
    private List<Comment> commentList;
}

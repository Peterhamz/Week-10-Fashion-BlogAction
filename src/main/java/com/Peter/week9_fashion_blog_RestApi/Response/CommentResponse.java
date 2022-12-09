package com.Peter.week9_fashion_blog_RestApi.Response;

import com.Peter.week9_fashion_blog_RestApi.Model.Comment;
import com.Peter.week9_fashion_blog_RestApi.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponse {
   private String message;
   private Comment comment;
   private LocalDateTime timeStamp;
   private Post post;

}

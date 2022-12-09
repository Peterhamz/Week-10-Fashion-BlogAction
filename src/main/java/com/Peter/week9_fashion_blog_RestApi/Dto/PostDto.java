package com.Peter.week9_fashion_blog_RestApi.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private String title;
    private String description;
    private int user_id;
}

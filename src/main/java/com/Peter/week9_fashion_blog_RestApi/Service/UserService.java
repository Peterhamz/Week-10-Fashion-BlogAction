package com.Peter.week9_fashion_blog_RestApi.Service;

import com.Peter.week9_fashion_blog_RestApi.Dto.*;
import com.Peter.week9_fashion_blog_RestApi.Response.*;

public interface UserService {

        RegisterResponse register(UserDto userDTO);

        LoginResponse login(LoginDto loginDTO);

        CreatePostResponse createPost(PostDto postDTO);

        CommentResponse comment(int user_id, int post_id, CommentDto commentDTO);

        LikedResponse like(int user_id, int post_id, LikeDto likeDTO);

        SearchCommentResponse searchComment(String keyword);

        SearchPostResponse searchPost(String keyword);

    }

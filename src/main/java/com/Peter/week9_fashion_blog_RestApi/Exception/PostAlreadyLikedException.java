package com.Peter.week9_fashion_blog_RestApi.Exception;

public class PostAlreadyLikedException extends RuntimeException{

    private String message;

    public PostAlreadyLikedException(){

        super("Already Liked");

        this.message="Already Liked";
    }

    public PostAlreadyLikedException(String msg){
        super(msg);
        this.message=msg;
    }
}

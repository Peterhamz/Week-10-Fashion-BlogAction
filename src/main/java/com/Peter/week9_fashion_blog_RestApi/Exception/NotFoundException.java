package com.Peter.week9_fashion_blog_RestApi.Exception;

public class NotFoundException extends RuntimeException{

    private String message;

    public NotFoundException(){
        super("Not Found");
        this.message="Not Found";

    }
    public NotFoundException(String msg){
        super(msg);
        this.message=msg;
    }
}

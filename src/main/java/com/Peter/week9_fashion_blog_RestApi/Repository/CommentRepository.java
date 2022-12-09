package com.Peter.week9_fashion_blog_RestApi.Repository;

import com.Peter.week9_fashion_blog_RestApi.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
        List<Comment> findByCommentContainingIgnoreCase(String key);
}

package com.Peter.week9_fashion_blog_RestApi.Repository;

import com.Peter.week9_fashion_blog_RestApi.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findByTitleContainingIgnoreCase(String keyword);
}

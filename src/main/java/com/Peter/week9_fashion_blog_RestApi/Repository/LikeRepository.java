package com.Peter.week9_fashion_blog_RestApi.Repository;

import com.Peter.week9_fashion_blog_RestApi.Model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {

    @Query(value = "SELECT * from likes WHERE user_id = ?1 AND post_id = ?2", nativeQuery = true)
    Like findLikedByUserIdAndPostId(int user_id, int post_id);

    @Query(value = " SELECT * FROM likes WHERE post_id=?1", nativeQuery = true)
    List<Like> likeList(int post_id);
}

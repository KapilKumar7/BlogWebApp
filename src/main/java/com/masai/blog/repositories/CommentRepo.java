package com.masai.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}

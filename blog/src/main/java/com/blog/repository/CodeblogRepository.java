package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.model.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long>{

}

package com.blog.service;

import java.util.List;

import com.blog.model.Post;

public interface CodeblogService {

	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);
}

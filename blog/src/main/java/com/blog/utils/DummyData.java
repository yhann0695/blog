package com.blog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blog.model.Post;
import com.blog.repository.CodeblogRepository;

@Component
public class DummyData {

	@Autowired
	CodeblogRepository codeblogRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Yhann");
		post1.setData(LocalDate.now());
		post1.setTitulo("Java Fundamentos");
		post1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean convallis velit non dapibus euismod. Proin placerat eu quam id facilisis. Vestibulum et enim sed ligula malesuada interdum id id nulla. Vestibulum gravida sed ante nec scelerisque. Fusce pellentesque orci eget molestie rhoncus. Pellentesque posuere at odio ac congue. Aenean eget augue ipsum. Curabitur in arcu sit amet ex fringilla aliquam. Vivamus sit amet dapibus tortor, non porta urna. Proin pretium tellus vel erat sollicitudin auctor. Etiam sodales tincidunt orci ac venenatis. Phasellus hendrerit, ante id faucibus scelerisque, massa est vulputate velit, at facilisis neque lorem vel enim. Nulla feugiat justo in justo auctor posuere. Nulla id ex dui. Pellentesque molestie sem felis. Maecenas fermentum dignissim nulla in volutpat. Aenean convallis velit non dapibus euismod. Proin placerat eu quam id facilisis. Vestibulum et enim sed ligula malesuada interdum id id nulla. Vestibulum gravida sed ante nec scelerisque. Fusce pellentesque orci eget molestie rhoncus. Pellentesque posuere at odio ac congue. Aenean eget augue ipsum. Curabitur in arcu sit amet ex fringilla aliquam. Vivamus sit amet dapibus tortor, non porta urna. Proin pretium tellus vel erat sollicitudin auctor.");
		
		Post post2 = new Post();
		post2.setAutor("Yhann");
		post2.setData(LocalDate.now());
		post2.setTitulo("Java Spring");
		post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean convallis velit non dapibus euismod. Proin placerat eu quam id facilisis. Vestibulum et enim sed ligula malesuada interdum id id nulla. Vestibulum gravida sed ante nec scelerisque. Fusce pellentesque orci eget molestie rhoncus. Pellentesque posuere at odio ac congue. Aenean eget augue ipsum. Curabitur in arcu sit amet ex fringilla aliquam. Vivamus sit amet dapibus tortor, non porta urna. Proin pretium tellus vel erat sollicitudin auctor. Etiam sodales tincidunt orci ac venenatis. Phasellus hendrerit, ante id faucibus scelerisque, massa est vulputate velit, at facilisis neque lorem vel enim. Nulla feugiat justo in justo auctor posuere. Nulla id ex dui. Pellentesque molestie sem felis. Maecenas fermentum dignissim nulla in volutpat. Aenean convallis velit non dapibus euismod. Proin placerat eu quam id facilisis. Vestibulum et enim sed ligula malesuada interdum id id nulla. Vestibulum gravida sed ante nec scelerisque. Fusce pellentesque orci eget molestie rhoncus. Pellentesque posuere at odio ac congue. Aenean eget augue ipsum. Curabitur in arcu sit amet ex fringilla aliquam. Vivamus sit amet dapibus tortor, non porta urna. Proin pretium tellus vel erat sollicitudin auctor.");
		
		postList.add(post1);
		postList.add(post2);
		
		for (Post post : postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
}

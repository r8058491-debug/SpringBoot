package com.example.author_blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.author_blog.entity.Author;
import com.example.author_blog.entity.Posts;
// import com.example.author_blog.entity.Posts;
import com.example.author_blog.repository.AuthorRepo;
import com.example.author_blog.repository.PostsRepo;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo repo;

    @Autowired
    private PostsRepo prepo;

    public Author createAuthor(Author author) {

        for(Posts p:author.getPosts()){
            p.setAuthor(author);
        }
        return repo.save(author);
    }

    public List<Posts> getAll(){
        return prepo.findAll();
    }

    public List<Author> getAlls(){
        return repo.findAll();
    }


    public List<Posts> getPost(String name){
        Author author=repo.findByAuthorName(name);
        return author.getPosts();
    }

    public Posts updatePosts(Long id,Posts posts){
        Posts p=prepo.findById(id).orElseThrow(()-> new RuntimeException("Error Detect"+id));
        p.setAbout(posts.getAbout());
        return prepo.save(p);
    }

    public String deletePosts(Long pid){
        prepo.deleteById(pid);
        return "Deleted Successfully...";
    }

    public String deleteAuthor(Long aid){
        repo.deleteById(aid);
        return "Deleted Successfully.....";
    }

    

}

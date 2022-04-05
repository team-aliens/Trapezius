package com.example.trapezius.service;

import com.example.trapezius.api.dto.PostRequest;
import com.example.trapezius.entity.Post;
import com.example.trapezius.entity.repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //게시글 작성
    public String create(PostRequest request) {
        postRepository.save(Post.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .build());
        return "게시글 작성 성공";
    }

    //리스트
    public List<Post> list() {
        return postRepository.findAll();
    }

    //게시글 조회
    public Post getPost(Integer id) {
        return postRepository.findById(id).get();
    }

    //게시글 수정
    @Transactional
    public String update(Integer id, PostRequest request) {
        Post post = postRepository.findById(id).get();
        post.setTitle(request.getTitle());
        post.setContent(request.getContent());
        return id + "번 게시글 수정 성공";
    }

    //게시글 삭제
    public String delete(Integer id) {
        postRepository.deleteById(id);
        return id + "번 게시글 삭제";
    }
}

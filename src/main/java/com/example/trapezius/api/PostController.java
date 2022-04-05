package com.example.trapezius.api;

import com.example.trapezius.api.dto.PostRequest;
import com.example.trapezius.entity.Post;
import com.example.trapezius.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //헬로 월드 출력
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    //게시글 작성
    @PostMapping("/create")
    public String create(@RequestBody PostRequest request) {
        return postService.create(request);
    }

    //리스트
    @GetMapping("/list")
    public List<Post> list() {
        return postService.list();
    }

    //게시글 조회
    @GetMapping("/get/{id}")
    public Post getPost(@PathVariable Integer id) {
        return postService.getPost(id);
    }

    //게시글 수정
    @PatchMapping("/update/{id}")
    public String update(@PathVariable Integer id, @RequestBody PostRequest request) {
        return postService.update(id, request);
    }

    //게시글 삭제
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return postService.delete(id);
    }
}

package com.study.controller;

import com.study.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping(value = "/get/article/list")
    public String getArticleList(String subject, String contents, String writer, String postDate) {

        return articleService.getArticleList(subject, contents, writer, postDate);
    }
}

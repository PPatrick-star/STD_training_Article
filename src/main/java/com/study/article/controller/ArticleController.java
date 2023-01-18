package com.study.article.controller;

import com.study.article.dto.ArticleDto;
import com.study.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private static final String PRODUCES_JSON = "application/json; charset=UTF-8";

    private final ArticleService articleService;

    @PostMapping(value = "/article/create")
    public String createArticle(String title, String content, String writer, String postDate) {

        return articleService.createArticle(title, content, writer, postDate);
    }

    @GetMapping(value = "/article/read")
    public ArticleDto getArticle(Long articlePk) {

        return articleService.getArticle(articlePk);
    }

    @GetMapping(value = "/article/list")
    public List<ArticleDto> getArticleList() {

        return articleService.getArticleList();
    }

    @PostMapping(value = "/article/update")
    public String updateArticle(Long articlePk, String title, String content, String writer) {

        return articleService.updateArticle(articlePk, title, content, writer);
    }


}

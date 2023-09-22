package com.study;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping(value = "/board/article/list")
    public String getArticleList() {
        return articleService.getArticleList();
    }

    @PostMapping(value = "/board/article/one")
    public String getOneArticle() {
        return articleService.getOneArticle();
    }
}

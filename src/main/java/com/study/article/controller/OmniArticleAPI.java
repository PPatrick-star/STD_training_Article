package com.study.article.controller;

import com.study.article.dto.ArticleDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface OmniArticleAPI {
    @PostMapping(value = "/article/create")
    boolean createArticle(String title, String content, String writer, String postDate);

    @GetMapping(value = "/article/read")
    ArticleDto getArticle(Long articlePk);

    @GetMapping(value = "/article/list/count")
    int countArticleList();

    @GetMapping(value = "/article/list")
    List<ArticleDto> getArticleList();

    @PostMapping(value = "/article/update")
    boolean updateArticle(Long articlePk, String title, String content, String writer);

    @DeleteMapping(value = "/article/delete")
    boolean deleteArticle(Long articlePk);

    @PostMapping(value = "/article/attachment/update")
    boolean updateAttachmentYn(Long articlePk, String updateValue);
}

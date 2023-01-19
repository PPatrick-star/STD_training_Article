package com.study.article.controller.impl;

import com.study.article.controller.OmniArticleAPI;
import com.study.article.dto.ArticleDto;
import com.study.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController implements OmniArticleAPI {

    private final ArticleService articleService;

    public String createArticle(String title, String content, String writer, String postDate) {

        return articleService.createArticle(title, content, writer, postDate);
    }

    public ArticleDto getArticle(Long articlePk) {

        return articleService.getArticle(articlePk);
    }

    public int countArticleList() {

        return articleService.countArticleList();
    }

    public List<ArticleDto> getArticleList() {

        return articleService.getArticleList();
    }

    public String updateArticle(Long articlePk, String title, String content, String writer) {

        return articleService.updateArticle(articlePk, title, content, writer);
    }

    public String deleteArticle(Long articlePk) {

        return articleService.deleteArticle(articlePk);
    }

    public String updateAttachmentYn(Long articlePk, String updateValue) {

        return articleService.updateAttachmentYn(articlePk, updateValue);
    }

}

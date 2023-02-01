package com.study.vo;

import lombok.Builder;

public class ArticleVo {

    private Long articlePk;
    private String articleTitle;
    private String articleContent;
    private String articleWriter;
    private String postDate;

    @Builder
    ArticleVo(Long articlePk, String articleTitle, String articleContent, String articleWriter, String postDate) {
        this.articlePk = articlePk;
        this.articleTitle = articleTitle;
        this.articleContent = articleContent;
        this.articleWriter = articleWriter;
        this.postDate = postDate;
    }


}

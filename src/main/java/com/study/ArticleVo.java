package com.study;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ArticleVo {

    private Long articlePk;
    private LocalDateTime postDate;
    private String articleTitle;
    private String articleContents;
    private String articleWriter;

    @Builder
    ArticleVo(Long articlePk, LocalDateTime postDate, String articleTitle, String articleContents, String articleWriter) {
        this.articlePk = articlePk;
        this.postDate = postDate;
        this.articleTitle = articleTitle;
        this.articleContents = articleContents;
        this.articleWriter = articleWriter;
    }

}

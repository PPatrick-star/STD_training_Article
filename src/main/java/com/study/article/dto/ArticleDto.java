package com.study.article.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleDto {

    private Long articlePk;
    private String articleTitle;
    private String articleContents;
    private String articleWriter;
    private String postDate;

}

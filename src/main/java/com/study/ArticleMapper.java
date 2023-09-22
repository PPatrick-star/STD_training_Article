package com.study;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    String getArticleList();

    String getReadArticle();
}

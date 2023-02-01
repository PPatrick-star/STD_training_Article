package com.study.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    public String getArticleList(String subject, String contents, String writer, String postDate);
}

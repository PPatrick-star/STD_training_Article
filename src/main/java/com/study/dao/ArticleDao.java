package com.study.dao;

import com.study.mapper.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArticleDao {

    private final ArticleMapper articleMapper;

    public String getArticleList(String subject, String contents, String writer, String postDate) {

        return articleMapper.getArticleList(subject, contents, writer, postDate);
    }
}

package com.study;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArticleDao {

    private final ArticleMapper mapper;

    public String getArticleList() {

        return mapper.getArticleList();
    }
}

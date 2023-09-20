package com.study;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleDao articleDao;

    public String getArticleList() {

        return articleDao.getArticleList();
    }
}

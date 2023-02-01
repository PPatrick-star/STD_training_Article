package com.study.service;

import com.study.dao.ArticleDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleDao articleDao;

    public String getArticleList(String subject, String contents, String writer, String postDate) {

        return articleDao.getArticleList(subject, contents, writer, postDate);
    }
}

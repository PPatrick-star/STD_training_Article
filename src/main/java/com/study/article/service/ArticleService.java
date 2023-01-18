package com.study.article.service;


import com.study.article.dao.ArticleDao;
import com.study.article.dto.ArticleDto;
import com.study.article.vo.ArticleVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleDao articleDao;

    public String createArticle(String title, String content, String writer, String postDate) {

        return articleDao.insertOne(ArticleVo.builder()
                .articleTitle(title)
                .articleContents(content)
                .articleWriter(writer)
                .postDate(postDate)
                .build());
    }

    public ArticleDto getArticle(Long articleVo) {

        ArticleVo vo = articleDao.getReadArticle(articleVo);

        ArticleDto result = new ArticleDto();
        result.setArticlePk(vo.getArticlePk());
        result.setArticleTitle(vo.getArticleTitle());
        result.setArticleContents(vo.getArticleContents());
        result.setArticleWriter(vo.getArticleWriter());
        result.setPostDate(vo.getPostDate());


        return result;
    }

    public List<ArticleDto> getArticleList() {

        List<ArticleVo> voList = articleDao.getArticleList();

        List<ArticleDto> resultList = new ArrayList<>();

        for (ArticleVo vo : voList) {
            ArticleDto dto = new ArticleDto();
            dto.setArticlePk(vo.getArticlePk());
            dto.setArticleTitle(vo.getArticleTitle());
            dto.setArticleContents(vo.getArticleContents());
            dto.setArticleWriter(vo.getArticleWriter());
            dto.setPostDate(vo.getPostDate());

            resultList.add(dto);
        }

        return resultList;
    }

    public String updateArticle(Long articlePk, String title, String content, String writer) {

        return articleDao.updateArticle(articlePk, title, content, writer);
    }

}

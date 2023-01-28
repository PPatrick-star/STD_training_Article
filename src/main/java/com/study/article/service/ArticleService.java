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

    public boolean createArticle(String title, String content, String writer, String postDate) {

        return articleDao.insertOne(ArticleVo.builder()
                .articleTitle(title)
                .articleContents(content)
                .articleWriter(writer)
                .apostDate(postDate)
                .build());
    }

    public ArticleDto getArticle(Long articleVo) {

        ArticleVo vo = articleDao.getReadArticle(articleVo);

        if (vo != null) {

            ArticleDto result = new ArticleDto();
            result.setArticlePk(vo.getArticlePk());
            result.setArticleTitle(vo.getArticleTitle());
            result.setArticleContents(vo.getArticleContents());
            result.setArticleWriter(vo.getArticleWriter());
            result.setApostDate(vo.getApostDate());


            return result;
        } else {

            return null;
        }

    }

    public int countArticleList() {

        return articleDao.countArticleList();
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
            dto.setApostDate(vo.getApostDate());

            resultList.add(dto);
        }

        return resultList;
    }

    public boolean updateArticle(Long articlePk, String title, String content, String writer) {

        return articleDao.updateArticle(articlePk, title, content, writer);
    }

    public boolean deleteArticle(Long articlePk) {

        return articleDao.deleteArticle(articlePk);
    }

    public boolean updateAttachmentYn(Long articlePk, String updateValue) {

        return articleDao.updateAttachmentYn(articlePk, updateValue);
    }
}

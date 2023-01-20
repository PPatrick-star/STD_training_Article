package com.study.article.dao;

import com.study.article.mapper.ArticleMapper;
import com.study.article.vo.ArticleVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ArticleDao {

    private final ArticleMapper mapper;

    public boolean insertOne(ArticleVo articleVo) {
        int insertRows = mapper.insertOne(articleVo);
        return insertRows > 0;
    }

    public ArticleVo getReadArticle(Long articlePk) {

        return mapper.getReadArticle(articlePk);
    }

    public List<ArticleVo> getArticleList() {

        return mapper.getArticleList();
    }

    public int countArticleList() {

        return mapper.countArticleList();
    }

    public boolean updateArticle(Long articlePk, String title, String content, String writer) {
        int updateRow = mapper.updateArticle(articlePk, title, content, writer);
        return updateRow > 0;
    }

    public boolean deleteArticle(Long articlePk) {
        int deleteRow = mapper.deleteArticle(articlePk);
        return deleteRow > 0;
    }

    public boolean updateAttachmentYn(Long articlePk, String updateValue) {
        int updateRow = mapper.updateAttachmentYn(articlePk, updateValue);
        return updateRow > 0;
    }
}

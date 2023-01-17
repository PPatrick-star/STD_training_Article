package com.study.board.dao;

import com.study.board.mapper.BoardMapper;
import com.study.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDao {

    private final BoardMapper mapper;

    public String insertOne(BoardVo boardVo) {
        int insertRows = mapper.insertOne(boardVo);
        if (insertRows == 0) {
            return "FAIL";
        } else {
            return "SUCCESS";
        }
    }
}

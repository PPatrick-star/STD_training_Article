package com.study.board.mapper;

import com.study.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    int insertOne(BoardVo boardVo);

    BoardVo getReadBoard(Long boardPk);
}

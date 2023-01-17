package com.study.board.service;


import com.study.board.dao.BoardDao;
import com.study.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao boardDao;

    public String CreateBoard(String title, String content, String writer, String postDate) {

        return boardDao.insertOne(BoardVo.builder()
                .boardTitle(title)
                .boardContent(content)
                .boardWriter(writer)
                .postDate(postDate)
                .build());
    }

}

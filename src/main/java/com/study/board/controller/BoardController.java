package com.study.board.controller;

import com.study.board.dto.BoardDto;
import com.study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private static final String PRODUCES_JSON = "application/json; charset=UTF-8";

    private final BoardService boardService;

    @PostMapping(value = "/board/create")
    public String CreateBoard(String title, String content, String writer, String postDate) {

        return boardService.CreateBoard(title, content, writer, postDate);
    }

    @GetMapping(value = "/board/read")
    public BoardDto ReadBoard(Long boardPk) {

        return boardService.ReadBoard(boardPk);
    }


}

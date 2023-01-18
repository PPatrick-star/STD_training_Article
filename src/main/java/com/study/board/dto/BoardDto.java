package com.study.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {

    private Long boardPk;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private String postDate;

}

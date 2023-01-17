package com.study.board.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardVo {

    private Long boardPk;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private String postDate;

    @Builder
    BoardVo(Long boardPk, String boardTitle, String boardContent, String boardWriter, String postDate) {
        this.boardPk = boardPk;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardWriter = boardWriter;
        this.postDate = postDate;
    }

}

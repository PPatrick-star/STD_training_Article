# Bulletin-board
게시판을 만들어보쟈


# DB 설계

- tb_bulletin_board(게시판 테이블)
  - pk_bulletin_board
  - fd_bulletin_title
  - fd_bulletin_contents
  - fd_bulletin_writers
  - fd_bpost_date19
  - tb_reply (댓글 테이블)

- tb_reply (댓글 테이블)
  - pk_reply : 댓글 PK
  - reply_content : 댓글 내용
  - reply_writer : 댓글 작성자
  - rpost_date19 : 댓글 작성일 / YYYY-MM-DD HH:mm:SS

- tb_article (게시글 테이블)
  - pk_article : 게시판 PK
  - article_title : 게시글 제목 /글자수제한()
  - article_contents : 게시글 내용 /글자수제한()
  - article_writer : 작성자
  - apost_date : 작성일 / YYYY-MM-DD HH:mm:SS
  - article_attachment_file_pk : 첨부파일pk
  - article_attachment_yn : 첨부파일 유무 (첨부파일 업로드 후에 체크하여 변경)

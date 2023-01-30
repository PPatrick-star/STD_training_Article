CREATE TABLE tb_article
(
    pk_article                   BIGINT auto_increment NOT NULL,
    article_title                VARCHAR(20)  NOT NULL,
    article_contents             VARCHAR(100) NOT NULL,
    article_writer               VARCHAR(20)  NOT NULL,
    apost_date                   VARCHAR(19)  NOT NULL,
    article_attachment_file_path VARCHAR(30)  NULL,
    article_attachment_yn        VARCHAR(1)   NOT NULL DEFAULT 'X',
    CONSTRAINT tb_article_pkey PRIMARY KEY (pk_article)
)
;
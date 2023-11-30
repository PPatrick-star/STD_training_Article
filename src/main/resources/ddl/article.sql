CREATE TABLE article
(
    pk_article                  bigserial       NOT NULL,
    article_title               varchar(20)     NOT NULL ,
    article_contents            varchar(100)    ,
    article_writer              varchar(50)     NOT NULL,
    apost_date                  timestamp       NOT NULL,
    article_attachment_file_pk  bigint          ,
    article_attachment_file_yn  varchar(1)      NOT NULL
)
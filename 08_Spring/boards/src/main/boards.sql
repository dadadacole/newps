DROP TABLE if exists tbl_board;

CREATE TABLE tbl_board(
                          no  INTEGER AUTO_INCREMENT PRIMARY KEY,
                          title Varchar(200) not null,
                          content text,
                          writer varchar(50) NOT NULL,
                          reg_date DATETIME DEFAULT current_timestamp,
                          update_date DATETIME DEFAULT CURRENT_TIMESTAMP

);

INSERT INTO TBL_BOARD(title, content, writer)
VALUES
    ('테스트 제목1', '테스트 내용1', 'USER00'),
    ('테스트 제목2', '테스트 내용2', 'USER00'),
    ('테스트 제목3', '테스트 내용3', 'USER00'),
    ('테스트 제목4', '테스트 내용4', 'USER00'),
    ('테스트 제목5', '테스트 내용5', 'USER00');

select * from tbl_board;
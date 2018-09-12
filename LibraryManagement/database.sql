DROP DATABASE IF EXISTS  _library;
CREATE DATABASE _library;
USE _library;
--
-- 图书信息表
--
DROP TABLE IF EXISTS library_book;
CREATE TABLE library_book(
    incre_id    INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id          VARCHAR(60)  unique NOT NULL,
    name        VARCHAR(60)   NOT NULL,
    author       VARCHAR(50)   NOT NULL,
    classify    VARCHAR(40)   NOT NULL,
    price       DOUBLE        NOT NULL,
    news        VARCHAR(200)  NOT NULL,
    publishdata DATE    
);
--
-- 读者信息表
--
DROP TABLE IF EXISTS library_reader;
CREATE TABLE library_reader(
    incre_id    INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id          VARCHAR(60) NOT NULL UNIQUE ,
    name        varchar(50) not null ,
    type        varchar(20) not null,
    sex         varchar(2)  not null,
    days_num    int(11)
);

--
-- 借阅信息表
--
-- 注意：is_back字段还书后值为0，借出为1
--

DROP TABLE IF EXISTS library_borrow;
CREATE TABLE library_borrow(
    id             INT NOT NULL   AUTO_INCREMENT PRIMARY KEY, 
    reader_id      varchar(50) not null ,
    book_id        varchar(50) not null ,
    borrow_date    date not null,
    back_date      date not null,
    is_back        int(1)  not null   
);
--
-- 用户信息表
--
-- 注意：is_admin字段管理员值为0，普通用户值为1
--
DROP TABLE IF EXISTS library_user;
CREATE TABLE library_user(
    id          INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    login_id    varchar(50) NOT NULL unique ,
    name        varchar(50),
    pass        varchar(50) not null,
    is_admin    int(1) 
);
CREATE INDEX borrow_index ON library_borrow (reader_id);
CREATE INDEX book_index ON library_book (id);
CREATE INDEX reader_index ON library_reader (id);
CREATE INDEX user_index ON library_user (login_id);

--
-- 默认登录名和密码
--
insert into library_user (login_id,name,pass,is_admin) values('admin','admin','admin',0);


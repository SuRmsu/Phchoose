CREATE DATABASE IF NOT EXISTS phone_test DEFAULT CHARACTER SET utf8;

USE phone_test;
DROP TABLE IF EXISTS testphone_1;
CREATE TABLE testphone_1 (
    id varchar(20) ,
    brand varchar(20),
    cpu varchar(20),
    battery int(11),
    primary key(id)
);

insert into testphone_1 values ('surm','su','iq200',15);
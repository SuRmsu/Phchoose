create database if not exists phone_test;
use phone_test;
create table if not exists testphone_1
(
    id      varchar(20),
    brand   varchar(20),
    cpu     varchar(20),
    battery int,
    primary key (id)
);
insert into testphone_1
values ('k30u', 'redmi', 'Dimensity 1000+', 4500);
insert into testphone_1
values ('k30pro', 'redmi', 'Snapdragon 865', 4700);
insert into testphone_1
values ('iphone 13', 'apple', 'A15', 3095);
insert into testphone_1
values ('surm', 'surm', 'surm', 180);
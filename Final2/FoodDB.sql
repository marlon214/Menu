create database if not exists Food;

use Food;

drop tables if exists Appetizers;
drop tables if exists Entrees;
drop tables if exists Desserts;

create table Appetizers (
id int (10) not null auto_increment,
dishname varchar(15) not null,
price decimal(3,2),
primary key (id)
);

create table Entrees (
id int (10) not null auto_increment,
dishname varchar(15) not null,
price decimal(3,2),
primary key (id)
);

create table Desserts (
id int (10) not null auto_increment,
dishname varchar(15) not null,
price decimal(3,2),
primary key (id)
);

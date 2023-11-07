create database quanlybanhang
use quanlybanhang
create table hanghoa(
  maHang varchar(30) not null primary key,
  tenHang varchar(100) not null,
  maLoai varchar(30) not null,
  soLuong int not null
)


// tạo bảng người dùng
create table USER(
  ID int(11) not null primary key,
  Name varchar(50) not null,
  Phone varchar(50) not null,
  UserName varchar(50) not null,
  Password varchar(50) not null,
  About varchar(1000) not null,
  Role varchar(50) not null,
  Favourites varchar(50) not null
  
)

insert into USER
values(1,'Tran Huu Phuc', '0962428167', 'Phucth', 'Huuphuc1995ct@', 'Nhan vien', 'Admin', 'Admin')

insert into USER
values(2,'Hoa vi loi', '0962428167', 'Hoavl', 'cc@gmail.com', 'Nhan vien', 'leader', 'travel')

insert into user
values(3,'Nguyen Yen Nhi', '0962428559', 'NhiN', 'Yennhi@gmail.com', 'Nhan vien', 'admin', 'music')

DELETE from  user where ID = 3;

-- Update dữ liệu
update user set ID=2 where ID =4;

-- truy vấn
select * from user
select * from hanghoa


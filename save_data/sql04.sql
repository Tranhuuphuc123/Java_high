create database quanlysinhvien
use quanlysinhvien

create table sinhvien(
  stt int not null primary key,
  name nvarchar(30) not null,
  gioitinh nvarchar(10) null default '0'
)

select * from sinhvien

insert into sinhvien
values(1, "tranhuuphuc", "nam"),
      (2, "lengophuong", "nu")
      
------------------------------------------------------------------------------------------
-- cơ  sở dữ liệu mới nhasach
create database nhasach
use nhasach
-- tạo 2 table sach và  khachhang
create table sach(
  ID varchar(30)  primary key,
  tensach varchar(500) not null,
  giaban int not null,
  namxuatban int null
)

create table khachHang(
  ID int primary key,
  hovaten varchar(255) not null,
  ngaydinh date not null,
  diachi varchar(500) null
)

-- sữa lại tên ngày sinh

alter table khachang change ngaydinh ngaysinh date

select * from khachang





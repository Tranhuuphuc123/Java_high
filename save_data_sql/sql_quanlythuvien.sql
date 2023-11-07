-- tạo dattabase Quanlythuvien
create database Quanlythuvien
use Quanlythuvien

create table Quanlysach(
  maSach varchar(100) not null,
  tenSach varchar(100) not null,
  loaiSach varchar(100) not null,
  nhaXuatBan varchar(100) not null,
  tacGia varchar(100) not null,
  soLuong int not null  
)

select * from Quanlysach

-- thêm dữ liệu
insert into Quanlysach(maSach, tenSach, loaiSach, nhaXuatBan, tacGia, soLuong )
values('MA01','Sach lap trinh', 'Cong nghe', 'Nha sach cantho','Tran Huu Phuc', 200),
       ('MA02','Dia chat hoc', 'Dia ly', 'Nha sach cantho','Tran Kim Dong', 100),
       ('MA03','Bac ba phi', 'vawn hoc', 'Nha sach TP.HCM','Hoa Vi Loi', 150)
       
-- lenh xoa row
DELETE from Quanlysach where STT = 4
select * from Quanlysach
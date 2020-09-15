CREATE DATABASE dbQLBS
USE dbQLBS
Go


CREATE TABLE tblSach
(
    MaSH char(10) not null,
	TenSH nvarchar(50),
	SoLuong int,
	TheLoai nvarchar(50),
	TenTG nvarchar(50),
	GiaBan int,
	Constraint pk_tblSach Primary key (MaSH)
)
CREATE TABLE tblLichSuBan
(
	MaSH char(10) not null,
	TenSH nvarchar(50),
	SoLuong int,
	NgayBan datetime,
)

INSERT INTO tblSach VALUES ('SH01',N'Tuổi thơ dữ dội',12,N'Văn học',N'Phùng Quán',20000)
INSERT INTO tblSach VALUES ('SH02',N'Chí Phèo',25,N'Văn học',N'Nam Cao',35000)
INSERT INTO tblSach VALUES ('SH03',N'Vợ Nhặt',3,N'Văn học',N'Kim Lân',25000)
INSERT INTO tblSach VALUES ('SH04',N'Mèo máy Doreamon',4,N'Hoạt hình',N'Phi Nhân',30000)
INSERT INTO tblSach VALUES ('SH05',N'Vang bóng một thời',6,N'Văn học',N'Nguyễn Tuân',150000)
INSERT INTO tblSach VALUES ('SH06',N'Đắc nhân tâm',18,N'Khoa học',N'Dale Carnegie',750000)
INSERT INTO tblSach VALUES ('SH07',N'Hai số phận',5,N'Tiểu Thuyết',N'Trịnh Nhật Hào',50000)
INSERT INTO tblSach VALUES ('SH08',N'Cẩm nang Marketing',5,N'Tâm lý học',N'Dương Minh Nhật',80000)
INSERT INTO tblSach VALUES ('SH09',N'Chọn nghề theo tính cách',5,N'Cẩm nang hướng nghiệp',N'Tô Quyền',150000)
INSERT INTO tblSach VALUES ('SH10',N'Sổ tay cung hoàng đạo',4,N'Tâm lý học',N'Lê Minh Thư',75000)
INSERT INTO tblSach VALUES ('SH11',N'Thuật tẩy não',6,N'Tâm lý học',N'Quỳnh Trang',110000)
INSERT INTO tblSach VALUES ('SH12',N'Một đời quản trị',15,N'Kinh tế',N'Phan Văn Trường',160000)
INSERT INTO tblSach VALUES ('SH13',N'Quản trị và Khởi nghiệp',10,N'Kinh tế',N'Cao Minh Cường',50000)
INSERT INTO tblSach VALUES ('SH14',N'Chính trị luận',12,N'Chính trị',N'Trần Nam',250000)
INSERT INTO tblSach VALUES ('SH15',N'Nhập môn triết học chính trị',55,N'Triết học',N'Dave Robinson',250000)
INSERT INTO tblSach VALUES ('SH16',N'Nhập môn lập trình',15,N'Khoa học',N'Trương Minh',20000)
INSERT INTO tblSach VALUES ('SH17',N'Đọc sách siêu tốc',30,N'Tâm lý học',N'Chris Nguyễn',150000)
INSERT INTO tblSach VALUES ('SH18',N'Anh văn sơ cấp',8,N'Ngoại ngữ',N'Minh Cao',50000)
INSERT INTO tblSach VALUES ('SH19',N'Tử tưởng Hồ Chí Minh',10,N'Chính trị',N'Trương Tấn Nam',60000)
INSERT INTO tblSach VALUES ('SH20',N'Toán cao cấp A1',9,N'Toán học',N'Lương Cao Triều',30000)
-----------------------------------------------------------------------------------------------------------

select * from tblSach
select * from tblLichSuBan
delete from tblSach
delete from tblLichSuBan
SELECT * FROM tblSach WHERE TenSH = N'Chí Phèo'
select SoLuong from tblSach where MaSH = 'SH01'

insert into tblLichSuBan (MaSH, NgayBan) values ('SH01',getdate())

drop table tblLichSuBan
-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 04, 2019 lúc 09:40 AM
-- Phiên bản máy phục vụ: 10.4.6-MariaDB
-- Phiên bản PHP: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `databasejava`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giangvien`
--

CREATE TABLE `giangvien` (
  `MaGV` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaKhoa` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `HoTen` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `HocVi` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Luong` int(11) NOT NULL,
  `QueQuan` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DiaChi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `GioiTinh` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `giangvien`
--

INSERT INTO `giangvien` (`MaGV`, `MaKhoa`, `MaLop`, `HoTen`, `HocVi`, `Luong`, `QueQuan`, `DiaChi`, `GioiTinh`) VALUES
('201', '101', 'MATH1', 'Nguyễn Văn Thành', 'Thạc Sĩ', 4000000, 'TPHCM', '156 Ngô Gia tự Phường 15 Quận 10 TPHCM', 1),
('202', '102', 'IT1', 'Trần Tú Thái', 'Cử Nhân', 3500000, 'Hà Nội', '132 Nguyễn Tri Phương Phường 1 Quận 5 TPHCM', 0),
('203', '103', 'PHY1', 'Ngô Minh Hải', 'Thạc Sĩ', 4000000, 'Đà Nẵng', '80 Tôn Đản Phường 14 Quận 4 TPHCM', 1),
('204', '104', 'CHEM1', 'Nguyễn Anh Tú', 'Tiến Sĩ', 8000000, 'Cần Thơ', '90 An Dương Vương Phường 3 Quận 5 TPHCM', 0),
('205', '105', 'ENG1', 'Huỳnh Minh Đại', 'Phó Giáo Sư', 10000000, 'Huế', '26 Nguyễn Trãi Phường 2 Quận 5 TPHCM', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `MaKhoa` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenKhoa` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NgayThanhLap` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`MaKhoa`, `TenKhoa`, `NgayThanhLap`) VALUES
('101', 'Khoa Toán', '1980-10-10'),
('102', 'Khoa CNTT', '1981-11-10'),
('103', 'Khoa Lý', '1981-12-10'),
('104', 'Khoa Hoá', '1982-09-10'),
('105', 'Khoa Anh', '1983-10-10');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lich`
--

CREATE TABLE `lich` (
  `Phong` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TietBatDau` int(11) NOT NULL,
  `TietKetThuc` int(11) NOT NULL,
  `Ngay` date NOT NULL,
  `Thu` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaGV` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lich`
--

INSERT INTO `lich` (`Phong`, `TietBatDau`, `TietKetThuc`, `Ngay`, `Thu`, `MaGV`) VALUES
('A201', 2, 5, '2019-09-25', 'Thứ 6', '203'),
('B201', 1, 5, '2019-09-24', 'Thứ 5', '201'),
('C201', 5, 9, '2019-09-26', 'Thứ 7', '204'),
('C306', 5, 10, '2019-09-28', 'Thứ 2', '205'),
('I201', 1, 5, '2019-09-27', 'Chủ Nhật', '202');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `login`
--

CREATE TABLE `login` (
  `username` varchar(45) COLLATE utf8_unicode_520_ci NOT NULL,
  `password` varchar(45) COLLATE utf8_unicode_520_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('aa', '12345'),
('aa', '12345');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lop`
--

CREATE TABLE `lop` (
  `MaLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `MaKhoa` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `TenLop` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `SiSo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lop`
--

INSERT INTO `lop` (`MaLop`, `MaKhoa`, `TenLop`, `SiSo`) VALUES
('CHEM1', '104', 'vatlydc', 70),
('ENG1', '105', 'enghp', 40),
('IT1', '102', 'Ltnc', 45),
('MATH1', '101', 'toancc', 55),
('PHY1', '103', 'vatlydc', 50);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `giangvien`
--
ALTER TABLE `giangvien`
  ADD PRIMARY KEY (`MaGV`),
  ADD KEY `MaKhoa` (`MaKhoa`),
  ADD KEY `MaLop` (`MaLop`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`MaKhoa`);

--
-- Chỉ mục cho bảng `lich`
--
ALTER TABLE `lich`
  ADD PRIMARY KEY (`Phong`),
  ADD KEY `MaGV` (`MaGV`);

--
-- Chỉ mục cho bảng `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`MaLop`),
  ADD KEY `MaKhoa` (`MaKhoa`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `giangvien`
--
ALTER TABLE `giangvien`
  ADD CONSTRAINT `giangvien_ibfk_1` FOREIGN KEY (`MaKhoa`) REFERENCES `khoa` (`MaKhoa`),
  ADD CONSTRAINT `giangvien_ibfk_2` FOREIGN KEY (`MaLop`) REFERENCES `lop` (`MaLop`);

--
-- Các ràng buộc cho bảng `lich`
--
ALTER TABLE `lich`
  ADD CONSTRAINT `lich_ibfk_1` FOREIGN KEY (`MaGV`) REFERENCES `giangvien` (`MaGV`);

--
-- Các ràng buộc cho bảng `lop`
--
ALTER TABLE `lop`
  ADD CONSTRAINT `lop_ibfk_1` FOREIGN KEY (`MaKhoa`) REFERENCES `khoa` (`MaKhoa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

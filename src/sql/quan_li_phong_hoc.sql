-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 24, 2022 lúc 03:51 AM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quan_li_phong_hoc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lop_hoc_phan`
--

CREATE TABLE `lop_hoc_phan` (
  `ma_lhp` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `so_luong_sv` int(11) NOT NULL,
  `hoc_ki` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lop_hoc_phan`
--

INSERT INTO `lop_hoc_phan` (`ma_lhp`, `so_luong_sv`, `hoc_ki`) VALUES
('221DHMT03', 60, 221),
('221GDTC417', 46, 221),
('221KTCT03', 55, 221),
('221LTDT02', 49, 221),
('221LTJNC01', 50, 221),
('221LTTQ02', 45, 221),
('221NN302', 35, 221),
('221OOAD01', 45, 221),
('221TDHMT05', 28, 221),
('221TLTJNC03', 40, 221),
('221TLTTQ06', 25, 221);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoi_dung`
--

CREATE TABLE `nguoi_dung` (
  `tai_khoan` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `mat_khau` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nguoi_dung`
--

INSERT INTO `nguoi_dung` (`tai_khoan`, `mat_khau`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong`
--

CREATE TABLE `phong` (
  `ten_phong` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `so_cho_ngoi` int(11) NOT NULL,
  `khu` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `tang` int(11) DEFAULT NULL,
  `trang_thai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phong`
--

INSERT INTO `phong` (`ten_phong`, `so_cho_ngoi`, `khu`, `tang`, `trang_thai`) VALUES
('A102', 50, 'A', 1, 1),
('A104', 50, 'A', 1, 1),
('A105', 50, 'A', 1, 2),
('A201', 55, 'A', 2, 1),
('A207', 45, 'A', 2, 1),
('A302', 60, 'A', 3, 1),
('A306', 40, 'A', 3, 1),
('A308', 60, 'A', 3, 1),
('B201', 30, 'B', 2, 1),
('B204', 40, 'B', 2, 1),
('B303', 30, 'B', 3, 2),
('SVĐ', 50, 'C', NULL, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thoi_khoa_bieu`
--

CREATE TABLE `thoi_khoa_bieu` (
  `ma_tkb` int(11) NOT NULL,
  `thu` int(11) NOT NULL,
  `tu_tiet` int(11) NOT NULL,
  `den_tiet` int(11) NOT NULL,
  `lop_hp` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `phong` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trang_thai_phong`
--

CREATE TABLE `trang_thai_phong` (
  `ma_trang_thai` int(11) NOT NULL,
  `ten_trang_thai` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `trang_thai_phong`
--

INSERT INTO `trang_thai_phong` (`ma_trang_thai`, `ten_trang_thai`) VALUES
(1, 'Đang hoại động'),
(2, 'Đang bảo trì');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `lop_hoc_phan`
--
ALTER TABLE `lop_hoc_phan`
  ADD PRIMARY KEY (`ma_lhp`);

--
-- Chỉ mục cho bảng `nguoi_dung`
--
ALTER TABLE `nguoi_dung`
  ADD PRIMARY KEY (`tai_khoan`);

--
-- Chỉ mục cho bảng `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`ten_phong`),
  ADD KEY `trang_thai` (`trang_thai`);

--
-- Chỉ mục cho bảng `thoi_khoa_bieu`
--
ALTER TABLE `thoi_khoa_bieu`
  ADD PRIMARY KEY (`ma_tkb`),
  ADD KEY `lop_hp` (`lop_hp`),
  ADD KEY `phong` (`phong`);

--
-- Chỉ mục cho bảng `trang_thai_phong`
--
ALTER TABLE `trang_thai_phong`
  ADD PRIMARY KEY (`ma_trang_thai`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `thoi_khoa_bieu`
--
ALTER TABLE `thoi_khoa_bieu`
  MODIFY `ma_tkb` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `trang_thai_phong`
--
ALTER TABLE `trang_thai_phong`
  MODIFY `ma_trang_thai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `phong`
--
ALTER TABLE `phong`
  ADD CONSTRAINT `phong_ibfk_1` FOREIGN KEY (`trang_thai`) REFERENCES `trang_thai_phong` (`ma_trang_thai`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `thoi_khoa_bieu`
--
ALTER TABLE `thoi_khoa_bieu`
  ADD CONSTRAINT `thoi_khoa_bieu_ibfk_1` FOREIGN KEY (`phong`) REFERENCES `phong` (`ten_phong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `thoi_khoa_bieu_ibfk_2` FOREIGN KEY (`lop_hp`) REFERENCES `lop_hoc_phan` (`ma_lhp`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

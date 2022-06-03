-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2021 at 05:49 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_ktp`
--

-- --------------------------------------------------------

--
-- Table structure for table `ktp`
--

CREATE TABLE `ktp` (
  `nik` varchar(16) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `ttl` varchar(30) DEFAULT NULL,
  `jk` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `rt` varchar(5) DEFAULT NULL,
  `rw` varchar(5) DEFAULT NULL,
  `kecamatan` varchar(20) DEFAULT NULL,
  `agama` varchar(15) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `pekerjaan` varchar(20) DEFAULT NULL,
  `kewarganegaraan` varchar(30) DEFAULT NULL,
  `masaberlaku` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ktp`
--

INSERT INTO `ktp` (`nik`, `nama`, `ttl`, `jk`, `alamat`, `rt`, `rw`, `kecamatan`, `agama`, `status`, `pekerjaan`, `kewarganegaraan`, `masaberlaku`) VALUES
('123123', 'yoahnes', 'klaten', 'Laki - laki', 'adadad', '3', '2', 'adaad', 'Kristen', 'BELUM KAWIN', 'adad', 'adad', 'adad'),
('123190077', 'Raditha ', 'Padang', 'Perempuan', 'Bali', '3', '2', 'Jogja', 'Hindu', 'BELUM KAWIN', 'Mahasiswa', 'id', 'selamanya'),
('123190078', 'Bayu Fitri Pamungkas', 'Kalimanta', 'Laki - laki', 'Jogja', '3', '2', 'Jogja', 'Islam', 'BELUM KAWIN', 'Mahasiswa', 'Indonesia', 'SEUMUR HIDUP'),
('123456789', 'Putu Raditha', 'Bali, 1 Januari 1989', 'Perempuan', 'Bali, Denpasar', '2', '1', 'Jogja', 'Hindu', 'BELUM KAWIN', 'Mahasiswa', 'Indonesia', 'SEUMUR HIDUP');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ktp`
--
ALTER TABLE `ktp`
  ADD PRIMARY KEY (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

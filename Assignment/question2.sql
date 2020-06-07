-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2020 at 11:13 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `question2`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `custName` varchar(250) NOT NULL,
  `custSurname` varchar(250) NOT NULL,
  `custNum` varchar(250) NOT NULL,
  `custAddress` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`custName`, `custSurname`, `custNum`, `custAddress`) VALUES
('66', 'yyyyy', 'Customer telephone number:', 'ggg'),
('Menzi', 'Hlope', 'Love', '70 Ochre, Ridge Close, Monavoni, Centurion'),
('Paulette', 'Nhlapo', 'Customer telephone number:', 'Swifty'),
('hhh', 's', 'Customer telephone number:', 's'),
('ff', 'vv', 'Customer telephone number:', 'c'),
('Free', 'Monty', 'Customer telephone number:', 'Love your liefe.'),
('John', 'Deep', '0123342243', 'Deper'),
('Swifty', 'Hope', '0123456789', 'Raslour Manow'),
('Paul', 'Ette', '0987654321', 'tree house'),
('Jason', 'Nel', '0122123456', 'Pearson Institue South Africa'),
('Menzi', 'Hlope', 'Love', '70 Ochre, Ridge Close, Monavoni, Centurion'),
('Itu', 'Meleng', 'Mapengo', 'Pearson');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

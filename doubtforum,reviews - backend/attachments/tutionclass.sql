-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2022 at 07:02 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tutionclass`
--

-- --------------------------------------------------------

--
-- Table structure for table `askquestion`
--

CREATE TABLE `askquestion` (
  `questionId` int(10) NOT NULL,
  `email` varchar(120) NOT NULL,
  `subject` varchar(120) NOT NULL,
  `description` varchar(120) NOT NULL,
  `inqueringAbout` varchar(120) NOT NULL,
  `attachments` varchar(120) NOT NULL,
  `serviceConsumerId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `askquestion`
--

INSERT INTO `askquestion` (`questionId`, `email`, `subject`, `description`, `inqueringAbout`, `attachments`, `serviceConsumerId`) VALUES
(8, 'cra@gmail.com', 'inquiry', 'new', 'new2', 'bg.jpg', 2),
(9, '123@gmail.com', 'product', 'need more service providers for software solution', 'software', 'attachments/bg-1@2x.png', 1),
(10, 'cra@gmail.com', 'inquiry', 'new', 'new2', 'bg.jpg', 2),
(11, 'ee@gmail.com', 'be', 'be', 'be', 'attachments/bg-1@2x.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(10) NOT NULL,
  `name` varchar(120) NOT NULL,
  `email` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  `phonenumber` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `serviceconsumer`
--

CREATE TABLE `serviceconsumer` (
  `serviceConsumerId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `askquestion`
--
ALTER TABLE `askquestion`
  ADD PRIMARY KEY (`questionId`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `askquestion`
--
ALTER TABLE `askquestion`
  MODIFY `questionId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

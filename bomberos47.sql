-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 03:51:41
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos47`
--
CREATE DATABASE IF NOT EXISTS `bomberos47` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberos47`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

DROP TABLE IF EXISTS `bombero`;
CREATE TABLE `bombero` (
  `idBombero` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `NombreApellido` varchar(50) NOT NULL,
  `FechaNac` date NOT NULL,
  `Celular` varchar(20) NOT NULL,
  `grupoSanguineo` varchar(30) NOT NULL,
  `CodBrigada` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`idBombero`, `dni`, `NombreApellido`, `FechaNac`, `Celular`, `grupoSanguineo`, `CodBrigada`, `estado`) VALUES
(1, 18676232, 'Wallace Boden', '1990-04-23', '123', 'A-', 5, 1),
(2, 20421214, 'Christopher Herrmann', '2017-10-11', '123123', 'AB', 5, 1),
(3, 20756896, 'Matthew Casey', '2017-10-11', '123123', 'AB', 5, 1),
(4, 14134123, 'Hallie Thomas', '2016-10-12', '14124', 'O', 5, 1),
(5, 21414469, 'Brian \"Otis\" Zvonecek', '2003-07-17', '12312', 'AB', 5, 1),
(6, 22312484, 'Randall \"Mouch\" McHolland', '2001-10-18', '123', 'A', 4, 1),
(7, 21244418, 'Joe Cruz', '2000-10-14', '123', 'AB', 3, 1),
(8, 20123561, 'Sylvie Brett', '2001-10-02', '123', 'A', 3, 1),
(9, 19654732, 'Kelly Severide', '2001-10-02', '123', 'AB', 3, 1),
(10, 22543210, 'Jessica \"Chili\" Chilton', '1999-10-06', '111444', 'A', 4, 1),
(11, 19456327, 'Gabriela Dawson', '1999-10-06', '111444', 'AB', 4, 1),
(12, 21544321, 'Jimmy Borrelli', '1998-10-08', '333123', 'AB', 4, 1),
(13, 24400525, 'Stella Kidd', '1975-10-16', '13132', 'O', 4, 1),
(14, 20352671, 'Leslie Shay', '1970-10-15', '3854126978', 'A', 3, 1),
(15, 21423962, 'Peter Mills', '1971-08-11', '3854126978', 'B', 3, 1),
(16, 23231957, 'Emily Foster', '1971-08-11', '3854126978', 'AB', 10, 1),
(17, 20123563, 'Darren Ritter', '2002-10-18', '123', 'AB', 1, 1),
(18, 21544325, 'Blake Gallo', '1998-10-08', '333123', 'AB', 10, 1),
(19, 20352677, 'Gianna Mackey', '1970-10-15', '3854126978', 'A', 1, 1),
(20, 21423969, 'Violet Mikami', '1971-08-11', '3854126978', 'B', 1, 1),
(24, 123123, 'Gabriel corn', '1995-10-12', '123123', 'B', 11, 1),
(25, 54321, 'yamasaka Konagua', '2003-10-10', '413214', 'O', 11, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

DROP TABLE IF EXISTS `brigada`;
CREATE TABLE `brigada` (
  `CodBrigada` int(11) NOT NULL,
  `NombreBr` varchar(30) NOT NULL,
  `Especialidad` varchar(40) NOT NULL,
  `Libre` tinyint(4) NOT NULL,
  `NroCuartel` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`CodBrigada`, `NombreBr`, `Especialidad`, `Libre`, `NroCuartel`, `estado`) VALUES
(0, 'no asignada', 'null', 0, 1, 1),
(1, 'delta', 'rescates en montaña', 1, 1, 1),
(3, 'alfa', 'incendios', 1, 1, 1),
(4, 'alfa', 'accidentes de tráfico', 1, 1, 1),
(5, 'alfa2', 'inundaciones', 1, 1, 1),
(10, 'omega', 'salvamento', 0, 3, 1),
(11, 'delta', 'salvamento', 1, 3, 1),
(12, 'alfa2', 'salvamento', 0, 4, 1),
(13, 'qqqqq', 'accidentes de tráfico', 1, 3, 0),
(14, 'omega1', 'prevención', 1, 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

DROP TABLE IF EXISTS `cuartel`;
CREATE TABLE `cuartel` (
  `CodCuartel` int(11) NOT NULL,
  `NombreCuartel` varchar(30) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `CoorX` int(11) NOT NULL,
  `CoorY` int(11) NOT NULL,
  `Telefono` varchar(30) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`CodCuartel`, `NombreCuartel`, `Direccion`, `CoorX`, `CoorY`, `Telefono`, `Correo`, `estado`) VALUES
(1, 'ESTACION-1', '4911 W Belmont Ave, Chicago', 143, 96, '+1 312-745-4351', 'Station1@firefighter.gob', 1),
(3, 'ESTACION-3', '419 Wells St, Chicago', 212, 33, '+1 312-745-2178', 'Station3@firefighter.gob', 1),
(4, 'ESTACION-4', '2300 E Roosvelt Ave, Chicago', 131, 54, '+1 312-743-2233', 'Station4@firefighter.gob', 1),
(5, 'ESTACION-5', '4034 W 47th St, Chicago', 115, 158, '3127443655', 'Station5@firefighter.gob', 1),
(51, 'ESTACION-51', '1360 S B Island Ave, Chicago', 115, 158, '+1 312-745-3705', 'Station51@firefighter.gob', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

DROP TABLE IF EXISTS `siniestro`;
CREATE TABLE `siniestro` (
  `Codigo` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `FechaSiniestro` date NOT NULL,
  `CoordX` int(11) NOT NULL,
  `CoordY` int(11) NOT NULL,
  `Detalles` text NOT NULL,
  `FechaResol` date NOT NULL,
  `Puntuacion` int(11) NOT NULL,
  `CodBrigada` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`Codigo`, `tipo`, `FechaSiniestro`, `CoordX`, `CoordY`, `Detalles`, `FechaResol`, `Puntuacion`, `CodBrigada`, `estado`) VALUES
(2, 'salvamento', '2022-04-23', 147, 61, 'de dolares  j11', '2022-04-23', 7, 5, 1),
(3, 'incendios', '2023-10-11', 123, 12, 'asdasd', '2023-10-12', 12, 1, 1),
(4, 'incendios', '2023-10-12', 123, 12, 'asdasd', '2023-10-11', 12, 1, 1),
(5, 'rescates en montaña', '2023-10-11', 123, 12, 'asdasd', '0000-00-00', 12, 1, 1),
(6, 'rescates en montaña', '2023-10-12', 190, 109, 'desprendimiento', '2023-10-08', 12, 1, 1),
(13, 'inundaciones', '2023-10-13', 2, 3, 'sfd', '2023-10-12', 2, 1, 1),
(14, 'inundaciones', '2023-10-05', 70, 145, 'eewrasd', '2023-10-05', 2, 1, 1),
(15, 'accidentes de tráfico', '2023-10-20', 2, 2, 'sdfjkhkjh', '2023-10-07', 2, 4, 1),
(16, 'salvamento', '2023-10-24', 153, 70, 'eeee', '0000-00-00', 0, 10, 1),
(17, 'salvamento', '2023-10-24', 194, 36, 'eeesdfsdf', '0000-00-00', 0, 12, 1),
(18, 'inundaciones', '2023-10-17', 226, 44, 'masda', '0000-00-00', 0, 0, 1),
(19, 'salvamento', '2023-10-28', 85, 154, 'accidente de auto', '0000-00-00', 0, 10, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`idBombero`),
  ADD KEY `CodBrigada` (`CodBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`CodBrigada`),
  ADD KEY `NroCuartel` (`NroCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`CodCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`Codigo`),
  ADD KEY `siniestro_ibfk_1` (`CodBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `CodBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `CodCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`CodBrigada`) REFERENCES `brigada` (`CodBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`NroCuartel`) REFERENCES `cuartel` (`CodCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`CodBrigada`) REFERENCES `brigada` (`CodBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

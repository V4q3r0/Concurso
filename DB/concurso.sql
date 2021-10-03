-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-10-2021 a las 22:30:15
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `concurso`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nivelCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `nivelCategoria`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `id` int(11) NOT NULL,
  `nombre` varchar(120) NOT NULL,
  `nivel` int(11) NOT NULL,
  `puntos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`id`, `nombre`, `nivel`, `puntos`) VALUES
(2, 'Pepito', 2, 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `id` int(11) NOT NULL,
  `pregunta` varchar(400) NOT NULL,
  `IDCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id`, `pregunta`, `IDCategoria`) VALUES
(4, 'Cuantos estados tiene integrados Estados Unidos?', 1),
(5, 'De que anio es la constitucion espaniola?', 1),
(6, 'Cuando acabo la II Guerra Mundial?', 1),
(7, 'Cuando llego el primer hombre a la luna?', 1),
(8, 'En que anio fue el descubrimiento de America?', 1),
(9, 'De que pais forma parte Hawaii?', 2),
(10, 'Cual es el rio mas largo de Espania?', 2),
(11, 'Cual es el oceano mas grande del mundo?', 2),
(12, 'Quien invento el avion?', 2),
(13, 'Cual es el pais con mayor poblacion del mundo?', 2),
(14, 'Cual es el idioma mas hablado del mundo?', 3),
(15, 'Donde se encuentra el desierto de Gobi?', 3),
(16, 'En que anio se creo la Organizacion de Naciones Unidas? (ONU)', 3),
(17, 'Cual es la isla mas grande del mundo?', 3),
(18, 'En que anio fue asesinado John F. Kennedy?', 3),
(19, 'Cuantos anios duro la guerra de los 100 anios?', 4),
(20, 'En la botanica, el tomate es?', 4),
(21, 'A que velocidad viaja la velocidad de la luz?', 4),
(22, 'Que distancia hay de la tierra a la luna?', 4),
(23, 'Que distancia hay de la Tierra al Sol?', 4),
(24, 'Cual es el pais con mas medallas olimpicas?', 5),
(25, 'Que animal es la mascota del giro de italia?', 5),
(26, 'En que deporte destaca Toni Elias?', 5),
(27, 'Cuantos puntos vale un tiro libre en basket?', 5),
(28, 'En que equipo jugo el famoso beibolista Derek Jeter?', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `id` int(11) NOT NULL,
  `respuesta` varchar(400) NOT NULL,
  `idPregunta` int(11) NOT NULL,
  `correcta` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`id`, `respuesta`, `idPregunta`, `correcta`) VALUES
(1, '35 estados', 4, 0),
(2, '50 estados', 4, 1),
(3, '60 estados', 4, 0),
(4, '40 estados', 4, 0),
(5, '1977', 5, 0),
(6, '1979', 5, 0),
(7, '1978', 5, 1),
(8, '1976', 5, 0),
(9, 'En 1945', 6, 1),
(10, 'En 1946', 6, 0),
(11, 'En 1943', 6, 0),
(12, 'En 1944', 6, 0),
(13, 'En 1970', 7, 0),
(14, 'En 1972', 7, 0),
(15, 'En 1969', 7, 1),
(16, 'En 1968', 7, 0),
(17, 'En el 1492', 8, 1),
(18, 'En el 1482', 8, 0),
(19, 'En el 1491', 8, 0),
(20, 'En el 1490', 8, 0),
(21, 'Canada', 9, 0),
(22, 'Inglaterra', 9, 0),
(23, 'Estados Unidos', 9, 1),
(24, 'Francia', 9, 0),
(25, 'El rio Tajo', 10, 0),
(26, 'El rio Ebro', 10, 1),
(27, 'El rio Nilo', 10, 0),
(28, 'El rio Duero', 10, 0),
(29, 'El oceano Atantico', 11, 0),
(30, 'El oceano Artico', 11, 0),
(31, 'El oceano Indico', 11, 0),
(32, 'El oceano Pacifico', 11, 1),
(33, 'Albert Einsten', 12, 0),
(34, 'Michael Jackson', 12, 0),
(35, 'Michael Jordan', 12, 0),
(36, 'Los hermanos Wright', 12, 1),
(37, 'Rusia', 13, 0),
(38, 'China', 13, 1),
(39, 'Estados Unidos', 13, 0),
(40, 'Japon', 13, 0),
(41, 'Mandarin', 14, 1),
(42, 'Frances', 14, 0),
(43, 'Chino', 14, 0),
(44, 'Ingles', 14, 0),
(45, 'Africa', 15, 0),
(46, 'America', 15, 0),
(47, 'Oceania', 15, 0),
(48, 'Asia', 15, 1),
(49, 'En 1947', 16, 0),
(50, 'En 1945', 16, 1),
(51, 'En 1944', 16, 0),
(52, 'En 1946', 16, 0),
(53, 'Groenlandia', 17, 1),
(54, 'Gran Betania', 17, 0),
(55, 'Madagascar', 17, 0),
(56, 'Islandia', 17, 0),
(57, '1965', 18, 0),
(58, '1964', 18, 0),
(59, '1963', 18, 1),
(60, '1962', 18, 0),
(61, '100 anios', 19, 0),
(62, '116 anios', 19, 1),
(63, '114 anios', 19, 0),
(64, '110 anios', 19, 0),
(65, 'Fruta', 20, 1),
(66, 'Hortaliza', 20, 0),
(67, 'Flor', 20, 0),
(68, 'Verdura', 20, 0),
(69, '300.000Km/h', 21, 0),
(70, '250.000Km/s', 21, 0),
(71, '300.000Km/s', 21, 1),
(72, '250.000Km/h', 21, 0),
(73, '411.500 km', 22, 0),
(74, '410.000 km', 22, 0),
(75, '385.600 km', 22, 0),
(76, '384.400 km', 22, 1),
(77, '148,5 millones de km', 23, 0),
(78, '149,6 millones de km', 23, 1),
(79, '152,1 millones de km', 23, 0),
(80, '160,5 millones de km', 23, 0),
(81, 'Estados Unidos', 24, 1),
(82, 'China', 24, 0),
(83, 'Japon', 24, 0),
(84, 'Rusia', 24, 0),
(85, 'Un perro', 25, 0),
(86, 'Un tiburon', 25, 0),
(87, 'Un lobo', 25, 1),
(88, 'Un zorro', 25, 0),
(89, 'Motociclismo', 26, 1),
(90, 'Automovilismo', 26, 0),
(91, 'Ciclismo', 26, 0),
(92, 'Golf', 26, 0),
(93, '3', 27, 0),
(94, '2', 27, 0),
(95, 'Ninguna de las anteriores', 27, 0),
(96, '1', 27, 1),
(97, 'Los Angeles Angels', 28, 0),
(98, 'Los Angeles Dodgers', 28, 0),
(99, 'New York Yankees', 28, 1),
(100, 'New York Mets', 28, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IDCategoria` (`IDCategoria`);

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPregunta` (`idPregunta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD CONSTRAINT `preguntas_ibfk_1` FOREIGN KEY (`IDCategoria`) REFERENCES `categoria` (`id`);

--
-- Filtros para la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD CONSTRAINT `respuestas_ibfk_1` FOREIGN KEY (`idPregunta`) REFERENCES `preguntas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

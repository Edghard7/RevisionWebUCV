-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.24


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bd_revision
--

CREATE DATABASE IF NOT EXISTS bd_revision;
USE bd_revision;

--
-- Definition of table `asignacion`
--

DROP TABLE IF EXISTS `asignacion`;
CREATE TABLE `asignacion` (
  `id_asignacion` int(11) NOT NULL AUTO_INCREMENT,
  `id_tesis_recepcion` int(11) NOT NULL,
  `id_jefe` int(11) NOT NULL,
  `id_revisor` int(11) NOT NULL,
  `fecha_asignacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_asignacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `asignacion`
--

/*!40000 ALTER TABLE `asignacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `asignacion` ENABLE KEYS */;


--
-- Definition of table `detalle_esquema`
--

DROP TABLE IF EXISTS `detalle_esquema`;
CREATE TABLE `detalle_esquema` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `id_esquema` int(11) NOT NULL,
  `capitulo` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `contenido` text COLLATE utf8_unicode_ci,
  `orden` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `detalle_esquema`
--

/*!40000 ALTER TABLE `detalle_esquema` DISABLE KEYS */;
INSERT INTO `detalle_esquema` (`id_detalle`,`id_esquema`,`capitulo`,`nombre`,`contenido`,`orden`) VALUES 
 (1,1,NULL,'CARÁTULA',NULL,1),
 (2,1,NULL,'PÁGINA DEL JURADO',NULL,2),
 (3,1,NULL,'DEDICATORIA',NULL,3),
 (4,1,NULL,'AGRADECIMIENTO',NULL,4),
 (5,1,NULL,'DECLARATORIA DE AUTENTICIDAD',NULL,5),
 (6,1,NULL,'PRESENTACIÓN',NULL,6),
 (7,1,NULL,'ÍNDICE',NULL,7),
 (8,1,NULL,'RESUMEN',NULL,8),
 (9,1,NULL,'ABSTRACT',NULL,9),
 (10,1,'I','INTRODUCCIÓN','Fundamentación científica, técnica o humanista, antecedentes, justificación.\r\n1.1.	Problema \r\n1.2.	Hipótesis \r\n1.3.	Objetivos\r\n',10),
 (11,1,'II','MARCO METODOLÓGICO','2.1. Variables\r\n2.2. Operacionalización de variables\r\n2.3. Metodología\r\n2.4. Tipo de estudio\r\n2.5. Diseño de investigación\r\n2.6. Población y muestra\r\n2.7. Técnicas es instrumentos de recolección de datos\r\n2.8. Métodos de análisis de datos\r\n2.9. Consideraciones éticas.\r\n',11),
 (12,1,'III','RESULTADOS',NULL,12),
 (13,1,'IV','DISCUSIÓN',NULL,13),
 (14,1,'V','CONCLUSIONES',NULL,14),
 (15,1,'VI','RECOMENDACIONES',NULL,15),
 (16,1,'VII','REFERENCIAS BIBLIOGRÁFICAS',NULL,16),
 (17,1,NULL,'ANEXOS',NULL,17);
/*!40000 ALTER TABLE `detalle_esquema` ENABLE KEYS */;


--
-- Definition of table `escuela`
--

DROP TABLE IF EXISTS `escuela`;
CREATE TABLE `escuela` (
  `id_escuela` int(11) NOT NULL AUTO_INCREMENT,
  `id_facultad` int(11) NOT NULL,
  `nombre` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_escuela`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `escuela`
--

/*!40000 ALTER TABLE `escuela` DISABLE KEYS */;
INSERT INTO `escuela` (`id_escuela`,`id_facultad`,`nombre`) VALUES 
 (1,1,'ARQUITECTURA'),
 (2,2,'CIENCIAS DE LA COMUNICACIÓN'),
 (3,2,'ARTES Y DISEÑO GRAFICO EMPRESARIAL'),
 (4,3,'ADMINISTRACIÓN'),
 (5,3,'ADMINISTRACIÓN EN TURISMO Y HOTELERÍA'),
 (6,3,'CONTABILIDAD'),
 (7,3,'MARKETING Y DIRECCIÓN DE EMPRESAS'),
 (8,3,'NEGOCIOS INTERNACIONALES'),
 (9,3,'ECONOMÍA'),
 (10,4,'ENFERMERÍA'),
 (11,4,'MEDICINA HUMANA'),
 (12,4,'NUTRICIÓN'),
 (13,4,'OBSTETRICIA'),
 (14,4,'ESTOMATOLOGÍA'),
 (15,5,'DERECHO'),
 (16,6,'EDUCACIÓN INICIAL'),
 (17,6,'EDUCACIÓN PRIMARIA'),
 (18,6,'TRADUCCIÓN E INTERPRETACIÓN'),
 (19,6,'CIENCIAS DEL DEPORTE'),
 (20,6,'EDUCACIÓN EN IDIOMAS'),
 (21,7,'PSICOLOGÍA'),
 (22,7,'PSICOLOGÍA ORGANIZACIONAL'),
 (23,8,'INGENIERÍA CIVIL'),
 (24,8,'INGENIERÍA AMBIENTAL'),
 (25,8,'INGENIERÍA INDUSTRIAL'),
 (26,8,'INGENIERÍA AGROINDUSTRIAL'),
 (27,8,'INGENIERÍA AGROINDUSTRIAL Y COMERCIO EXTERIOR'),
 (28,8,'INGENIERÍA MECÁNICA ELÉCTRICA e INGENIERÍA MECÁNICA'),
 (29,8,'INGENIERÍA DE SISTEMAS'),
 (30,8,'INGENIERÍA EMPRESARIAL');
/*!40000 ALTER TABLE `escuela` ENABLE KEYS */;


--
-- Definition of table `esquema_tesis`
--

DROP TABLE IF EXISTS `esquema_tesis`;
CREATE TABLE `esquema_tesis` (
  `id_esquema` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_tesis` int(11) NOT NULL,
  `descripcion` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `anio` int(11) NOT NULL,
  `semestre` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_esquema`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `esquema_tesis`
--

/*!40000 ALTER TABLE `esquema_tesis` DISABLE KEYS */;
INSERT INTO `esquema_tesis` (`id_esquema`,`id_tipo_tesis`,`descripcion`,`anio`,`semestre`,`estado`) VALUES 
 (1,1,'ESQUEMA CUANTITATIVO 2014',2014,1,1),
 (2,2,'ESQUEMA CUALITATIVO 2014',2014,1,1);
/*!40000 ALTER TABLE `esquema_tesis` ENABLE KEYS */;


--
-- Definition of table `estado`
--

DROP TABLE IF EXISTS `estado`;
CREATE TABLE `estado` (
  `id_estado` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `estado`
--

/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` (`id_estado`,`descripcion`) VALUES 
 (1,'ACTIVO'),
 (2,'INACTIVO'),
 (3,'RECEPCIONADO'),
 (4,'ASIGNADO'),
 (5,'REVISADO'),
 (6,'CORREGIDO'),
 (7,'PENDIENTE CORRECCIÓN'),
 (8,'PENDIENTE ASIGNACIÓN'),
 (9,'POR REVISAR'),
 (10,'CON OBSERVACIONES'),
 (11,'CORRECIÓN FINALIZADA');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;


--
-- Definition of table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
CREATE TABLE `facultad` (
  `id_facultad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_facultad`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `facultad`
--

/*!40000 ALTER TABLE `facultad` DISABLE KEYS */;
INSERT INTO `facultad` (`id_facultad`,`nombre`) VALUES 
 (1,'FACULTAD DE ARQUITECTURA'),
 (2,'FACULTAD DE CIENCIAS DE LA COMUNICACIÓN'),
 (3,'FACULTAD DE CIENCIAS EMPRESARIALES'),
 (4,'FACULTAD DE CIENCIAS MÉDICAS'),
 (5,'FACULTAD DE DERECHO'),
 (6,'FACULTAD DE EDUCACIÓN E IDIOMAS'),
 (7,'FACULTAD DE HUMANIDADES'),
 (8,'FACULTAD DE INGENIERÍA');
/*!40000 ALTER TABLE `facultad` ENABLE KEYS */;


--
-- Definition of table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
CREATE TABLE `funcion` (
  `id_funcion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_funcion`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `funcion`
--

/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` (`id_funcion`,`nombre`,`estado`) VALUES 
 (1,'RECEPCIONISTA',1),
 (2,'JEFE',1),
 (3,'REVISOR',1),
 (4,'SEGUIDOR',1);
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;


--
-- Definition of table `linea_investigacion`
--

DROP TABLE IF EXISTS `linea_investigacion`;
CREATE TABLE `linea_investigacion` (
  `id_linea` int(11) NOT NULL AUTO_INCREMENT,
  `id_escuela` int(11) NOT NULL,
  `nombre` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_linea`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `linea_investigacion`
--

/*!40000 ALTER TABLE `linea_investigacion` DISABLE KEYS */;
INSERT INTO `linea_investigacion` (`id_linea`,`id_escuela`,`nombre`,`estado`) VALUES 
 (1,1,'Arquitectónico',1),
 (2,1,'Histórico cultural',1),
 (3,1,'Técnico-constructivo ambiental',1),
 (4,1,'Urbanismo sostenible',1),
 (5,1,'Calidad y servicio',1),
 (6,2,'Procesos comunicacionales en la sociedad contemporánea',1),
 (7,3,'Arte visual y sociedad: Investigación de mercados en el ámbito de la comunicación gráfica, imagen corporativa y diseño del producto',1),
 (8,4,'Gestión del Talento Humano',1),
 (9,4,'Planificación',1),
 (10,4,'Administración de Operaciones',1),
 (11,4,'Marketing',1),
 (12,4,'Finanzas y Derecho Corporativo',1);
/*!40000 ALTER TABLE `linea_investigacion` ENABLE KEYS */;


--
-- Definition of table `observacion`
--

DROP TABLE IF EXISTS `observacion`;
CREATE TABLE `observacion` (
  `id_observacion` int(11) NOT NULL AUTO_INCREMENT,
  `id_detalle_esquema` int(11) NOT NULL,
  `id_revision` int(11) NOT NULL,
  `observacion` text COLLATE utf8_unicode_ci NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '7',
  PRIMARY KEY (`id_observacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `observacion`
--

/*!40000 ALTER TABLE `observacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `observacion` ENABLE KEYS */;


--
-- Definition of table `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_persona` int(11) NOT NULL,
  `apellidos` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `nombres` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `correo` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `persona`
--

/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`id_persona`,`id_tipo_persona`,`apellidos`,`nombres`,`correo`,`estado`) VALUES 
 (1,1,'PALOMINO GALLEGOS','DANILO','',1),
 (3,3,'MARTINEZ SERNAQUÉ','MARLON','',1),
 (4,3,'PEREZ ALBELA','JUAN JOSÉ','',1),
 (5,1,'ZAPATA CHAMORRO','BELINDA MARÍA','hcmasd@gmail.com',1),
 (6,2,'GUTIERRES','DANIEL','sdjfksja@gmail.com',1),
 (7,1,'239 ZAPA','DJF 439','',1),
 (8,2,'23746NSDF ','32478','',1),
 (9,3,'OOLASD  DKÁ','DJSD +A','',1),
 (10,2,'RODRIGUEZ','MANUEL','',1),
 (11,1,'PEREZ ZAPATA','DANILO','',1),
 (12,2,'SANTOS CHUMACERO','JUAN JOSÉ','',1),
 (13,0,'ZAPATA GARRIDO','DANIEL','',1),
 (14,1,'ZURITA CHUMACERO','EDGARD','ashd@maisl.com',1),
 (15,3,'EDDAD','MAS','',1),
 (16,2,'MAS DK','HEN','',1),
 (17,0,'MÁSND EFD','SD','',1),
 (18,3,'GUERRENO MÍO','SARID','',1),
 (19,2,'ZAPATA DKE','SJDJ','jshhdh@hotmail.com',1),
 (20,2,'zurita chumacero','edghard','edzu7@hotmail.com',1),
 (21,0,'JSHDF','JSJD','',1),
 (22,1,'PEÑA APONTE','LUIS','',1),
 (23,1,'_________','------','-----------',1),
 (24,1,'____________','------------------','----------------',1),
 (25,0,'_________________','____________________','__________',1),
 (26,0,'________________________________________','__________________','',1),
 (27,0,'_____---_---_','___------','',1),
 (28,0,'MARÍA DANIELA PÉREZ','ÑAÑAPE SERE','',1),
 (29,0,'ZAPATA NÁJERA','MARÍA','hsdfh@mail.com',1),
 (30,0,'PÉREZ RAMIREZ','847358374','',1),
 (31,2,'PATIÑO ROJAS','MARCELO',NULL,1),
 (32,2,'PEREZ ROJAS','MARCELO',NULL,1),
 (33,5,'PATIÑO XEGARRA','XAVIER','',1),
 (35,1,'PEREZ ZAPARA','LUIS','',1),
 (36,1,'ZAPATA CHAMORRO','BRESCIA','',1),
 (37,1,'ZAPATA CHAMORRO','DANIA','dania@mail.com',1),
 (38,5,'CHUYES REYES','JUAN','',1),
 (39,2,'PÉREZ ARRAIZA','JOQUIN','',1),
 (40,5,'LÓPEZ PATIÑO','JAVIER ALEXANDER','',1);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;


--
-- Definition of table `persona_funcion`
--

DROP TABLE IF EXISTS `persona_funcion`;
CREATE TABLE `persona_funcion` (
  `id_persona_funcion` int(11) NOT NULL AUTO_INCREMENT,
  `id_persona` int(11) NOT NULL,
  `id_funcion` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_persona_funcion`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `persona_funcion`
--

/*!40000 ALTER TABLE `persona_funcion` DISABLE KEYS */;
INSERT INTO `persona_funcion` (`id_persona_funcion`,`id_persona`,`id_funcion`,`estado`) VALUES 
 (1,1,1,1),
 (3,35,1,1),
 (4,36,1,1),
 (5,37,1,1),
 (6,38,4,1),
 (7,39,2,1),
 (8,40,4,1);
/*!40000 ALTER TABLE `persona_funcion` ENABLE KEYS */;


--
-- Definition of table `revision`
--

DROP TABLE IF EXISTS `revision`;
CREATE TABLE `revision` (
  `id_revision` int(11) NOT NULL AUTO_INCREMENT,
  `id_asignacion` int(11) NOT NULL,
  `comentario` text COLLATE utf8_unicode_ci,
  `estado` int(11) NOT NULL DEFAULT '7',
  PRIMARY KEY (`id_revision`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `revision`
--

/*!40000 ALTER TABLE `revision` DISABLE KEYS */;
/*!40000 ALTER TABLE `revision` ENABLE KEYS */;


--
-- Definition of table `tesis`
--

DROP TABLE IF EXISTS `tesis`;
CREATE TABLE `tesis` (
  `id_tesis` int(11) NOT NULL AUTO_INCREMENT,
  `id_autor` int(11) NOT NULL,
  `id_recepcionista` int(11) NOT NULL,
  `id_linea` int(11) NOT NULL,
  `id_esquema` int(11) NOT NULL,
  `titulo` text COLLATE utf8_unicode_ci NOT NULL,
  `fecha_sustentacion` date NOT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` int(11) NOT NULL DEFAULT '3',
  PRIMARY KEY (`id_tesis`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tesis`
--

/*!40000 ALTER TABLE `tesis` DISABLE KEYS */;
INSERT INTO `tesis` (`id_tesis`,`id_autor`,`id_recepcionista`,`id_linea`,`id_esquema`,`titulo`,`fecha_sustentacion`,`fecha_registro`,`estado`) VALUES 
 (1,33,5,1,1,'INFLUENCIA DE LA UTILIZACION DE UN ........ ','0000-00-00','2015-06-02 23:05:47',3),
 (2,33,5,1,1,'INFLUENCIA DE LA UTILIZACION DE UN LIBRO. ','0000-00-00','2015-06-02 23:34:38',3),
 (3,38,1,10,1,'DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY ESPERANDO QUE ESTO SE CORTE ---------....','0000-00-00','2015-06-03 02:47:53',3),
 (4,40,1,5,2,'OTRO TITULO DE TESIS','0000-00-00','2015-06-03 02:53:50',3),
 (5,33,1,7,1,'YA NADA QUEDA','0000-00-00','2015-06-03 03:16:16',3),
 (6,38,1,11,2,'UNA NUEVA TESIS CON TODOS LAS CARACTERISTICAS\r\nY MUY BUENA','2014-11-24','2015-06-03 03:18:28',3);
/*!40000 ALTER TABLE `tesis` ENABLE KEYS */;


--
-- Definition of table `tesis_recepcion`
--

DROP TABLE IF EXISTS `tesis_recepcion`;
CREATE TABLE `tesis_recepcion` (
  `id_tesis_recepcion` int(11) NOT NULL AUTO_INCREMENT,
  `id_tesis` int(11) NOT NULL,
  `id_recepcionista` int(11) NOT NULL,
  `id_director` int(11) NOT NULL,
  `fecha_recepcion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` int(11) NOT NULL DEFAULT '3',
  PRIMARY KEY (`id_tesis_recepcion`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tesis_recepcion`
--

/*!40000 ALTER TABLE `tesis_recepcion` DISABLE KEYS */;
INSERT INTO `tesis_recepcion` (`id_tesis_recepcion`,`id_tesis`,`id_recepcionista`,`id_director`,`fecha_recepcion`,`estado`) VALUES 
 (1,2,5,4,'2015-06-02 23:34:38',5),
 (2,2,5,4,'2015-06-02 23:36:45',3),
 (3,3,1,4,'2015-06-03 02:47:53',3),
 (4,4,1,15,'2015-06-03 02:53:50',3),
 (5,5,1,9,'2015-06-03 03:16:16',3),
 (6,6,1,4,'2015-06-03 03:18:28',3);
/*!40000 ALTER TABLE `tesis_recepcion` ENABLE KEYS */;


--
-- Definition of table `tipo_persona`
--

DROP TABLE IF EXISTS `tipo_persona`;
CREATE TABLE `tipo_persona` (
  `id_tipo_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_tipo_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tipo_persona`
--

/*!40000 ALTER TABLE `tipo_persona` DISABLE KEYS */;
INSERT INTO `tipo_persona` (`id_tipo_persona`,`nombre`,`estado`) VALUES 
 (1,'SECRETARIA(O)',1),
 (2,'JEFE DE INVESTIGACIÓN',1),
 (3,'DIRECTOR DE ESCUELA',1),
 (4,'ASISTENTE DE ESCUELA',1),
 (5,'ALUMNO',1),
 (6,'REVISOR',1);
/*!40000 ALTER TABLE `tipo_persona` ENABLE KEYS */;


--
-- Definition of table `tipo_tesis`
--

DROP TABLE IF EXISTS `tipo_tesis`;
CREATE TABLE `tipo_tesis` (
  `id_tipo_tesis` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_tipo_tesis`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tipo_tesis`
--

/*!40000 ALTER TABLE `tipo_tesis` DISABLE KEYS */;
INSERT INTO `tipo_tesis` (`id_tipo_tesis`,`nombre`) VALUES 
 (1,'ENFOQUE CUANTITATIVO'),
 (2,'ENFOQUE CUALITATIVO');
/*!40000 ALTER TABLE `tipo_tesis` ENABLE KEYS */;


--
-- Definition of table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `id_persona` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `clave` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id_usuario`,`id_persona`,`nombre`,`clave`,`fecha_registro`,`estado`) VALUES 
 (1,1,'admin','e10adc3949ba59abbe56e057f20f883e','2015-06-02 10:38:42',1),
 (2,37,'dzapata','e10adc3949ba59abbe56e057f20f883e','2015-06-02 21:37:59',1),
 (3,38,'jchuyes38','e10adc3949ba59abbe56e057f20f883e','2015-06-02 21:43:35',1),
 (4,39,'jperez39','e10adc3949ba59abbe56e057f20f883e','2015-06-02 21:45:41',1),
 (5,40,'jlopez40','e10adc3949ba59abbe56e057f20f883e','2015-06-02 22:54:22',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;


--
-- Definition of procedure `sp_combo_escuela`
--

DROP PROCEDURE IF EXISTS `sp_combo_escuela`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_escuela`()
BEGIN


SELECT * FROM escuela e order by nombre;


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_combo_escuela_x_facultad`
--

DROP PROCEDURE IF EXISTS `sp_combo_escuela_x_facultad`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_escuela_x_facultad`(
in id_facultad_i int
)
BEGIN

select * from escuela where id_facultad = id_facultad_i and estado = 1;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_combo_esquema_tesis`
--

DROP PROCEDURE IF EXISTS `sp_combo_esquema_tesis`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_esquema_tesis`()
BEGIN

SELECT * FROM esquema_tesis e where estado = 1;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_combo_linea_investigacion`
--

DROP PROCEDURE IF EXISTS `sp_combo_linea_investigacion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_linea_investigacion`()
BEGIN

SELECT * FROM linea_investigacion l where estado = 1;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_combo_linea_investigacion_x_escuela`
--

DROP PROCEDURE IF EXISTS `sp_combo_linea_investigacion_x_escuela`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_linea_investigacion_x_escuela`(
in id_escuela_i int
)
BEGIN

SELECT * FROM linea_investigacion l
where id_escuela = id_escuela_i and estado = 1
ORDER BY nombre;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_combo_persona_x_tipo`
--

DROP PROCEDURE IF EXISTS `sp_combo_persona_x_tipo`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_persona_x_tipo`(
in id_tipo_i int
)
BEGIN

SELECT id_persona, apellidos, nombres
FROM persona t
where id_tipo_persona = id_tipo_i and estado = 1;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_combo_tipo_persona`
--

DROP PROCEDURE IF EXISTS `sp_combo_tipo_persona`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_tipo_persona`()
BEGIN


SELECT * FROM tipo_persona t where estado = 1 order by nombre;


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_persona`
--

DROP PROCEDURE IF EXISTS `sp_registro_persona`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_persona`(
in id_tipo_persona_i int,
in apellidos_i varchar(250),
in nombres_i varchar(250),
in correo_i varchar(50),
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

-- si existe un registro similar
SET @val = (SELECT count(*) FROM persona WHERE concat(apellidos,nombres) = UPPER(concat(apellidos_i,nombres_i)));
-- set salida = @val;
if (@val = 0) then
-- si la persona aun no se ha registrado
	INSERT INTO persona(`id_persona`, `id_tipo_persona`, `apellidos`, `nombres`, `correo`, `estado`)
	VALUES(
	null,
	id_tipo_persona_i,
	UPPER(apellidos_i),
	UPPER(nombres_i),
	correo_i,
	DEFAULT
	);

	-- si se ha logrado ingresar el registro
	SET @val = (SELECT count(*) FROM persona WHERE concat(apellidos,nombres) = UPPER(concat(apellidos_i,nombres_i)));

	if(@val = 1) then

    set @persona = (SELECT id_persona FROM persona WHERE concat(apellidos,nombres) = UPPER(concat(apellidos_i,nombres_i)) );

-- secretaria - recepcionista
 -- jefe inves - jefe
 -- dir_escuela - seguidor
 -- asis_escuela - seguidor
 -- alumno - seguidor
 -- revisor - revisor

    CASE id_tipo_persona_i
      WHEN 1 THEN  INSERT INTO persona_funcion VALUES(NULL,@persona,1,DEFAULT) ;
      WHEN 2 THEN  INSERT INTO persona_funcion VALUES(NULL,@persona,2,DEFAULT) ;
      WHEN 3 THEN  INSERT INTO persona_funcion VALUES(NULL,@persona,4,DEFAULT) ;
      WHEN 4 THEN  INSERT INTO persona_funcion VALUES(NULL,@persona,4,DEFAULT) ;
      WHEN 5 THEN  INSERT INTO persona_funcion VALUES(NULL,@persona,4,DEFAULT) ;
      WHEN 6 THEN  INSERT INTO persona_funcion VALUES(NULL,@persona,3,DEFAULT) ;
      ELSE
        BEGIN
        END;
    END CASE;

    -- usuario generado

    SET @usuario = ( SELECT lower( concat( substr(nombres,1,1), substr(apellidos,1,locate(' ',apellidos)-1),@persona ) )
    FROM persona
    WHERE id_persona = @persona );

-- reemplaza tildes
    SET @usuario = REPLACE (@usuario,'á','a');
    SET @usuario = REPLACE (@usuario,'é','e');
    SET @usuario = REPLACE (@usuario,'í','i');
    SET @usuario = REPLACE (@usuario,'ó','o');
    SET @usuario = REPLACE (@usuario,'ú','u');

    INSERT INTO usuario(id_usuario,id_persona,nombre,clave,fecha_registro,estado)
    VALUES(NULL,@persona,@usuario,'e10adc3949ba59abbe56e057f20f883e',now(),DEFAULT);

    COMMIT;
	  SET salida = 'OK';

	else
	  ROLLBACK;
	  SET salida = 'NO';

	end if;

else
  ROLLBACK;
  set salida = 'EXISTE';

end if;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_tesis`
--

DROP PROCEDURE IF EXISTS `sp_registro_tesis`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_tesis`(
in id_autor_i int,
in id_recepcionista_i int,
in id_director_i int,
in id_linea_i int,
in id_esquema_i int,
in titulo_i text,
in fecha_sus_i date,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

SET @existe = (SELECT count(*) FROM tesis where REPLACE(titulo,' ','') = REPLACE(titulo_i,' ','') );

SET @ahora = now();

if(@existe = 0) then

INSERT INTO tesis(id_tesis,id_autor,id_recepcionista,id_linea,id_esquema,titulo,fecha_sustentacion,fecha_registro,estado)
VALUES(
NULL,
id_autor_i,
id_recepcionista_i,
id_linea_i,
id_esquema_i,
UPPER(titulo_i),
fecha_sus_i,
@ahora,
DEFAULT
);

-- si se registro

SET @tesis = (SELECT id_tesis FROM tesis
where REPLACE(titulo,' ','') = REPLACE(titulo_i,' ','')
and id_recepcionista = id_recepcionista_i and fecha_registro = @ahora );

if (@tesis > 0) then

  CALL sp_registro_tesis_recepcion(@tesis,id_recepcionista_i,id_director_i,@salida);

  if (@salida = 'OK') then

    COMMIT;
    set salida = 'OK';

  else

    ROLLBACK;
    set salida = 'NO';

  end if;

else
  ROLLBACK;
  set salida = 'NO';

end if;

else

set salida = 'EXISTE';

end if;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_tesis_recepcion`
--

DROP PROCEDURE IF EXISTS `sp_registro_tesis_recepcion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_tesis_recepcion`(
in id_tesis_i int,
in id_recepcionista_i int,
in id_director_i int,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

-- RECEPCIONADA
SET @activo =(SELECT count(*) FROM tesis_recepcion WHERE id_tesis = id_tesis_i and estado = 3);

if (@activo = 0) then

  INSERT INTO tesis_recepcion(id_tesis_recepcion,id_tesis,id_recepcionista,id_director,fecha_recepcion,estado)
  VALUES(
  NULL,
  id_tesis_i,
  id_recepcionista_i,
  id_director_i,
  now(),
  DEFAULT
  );

  SET @registro =(SELECT count(*) FROM tesis_recepcion
  WHERE id_tesis = id_tesis_i and id_recepcionista = id_recepcionista_i and estado = 3);

  if (@registro = 1) then

    COMMIT;
    SET salida = 'OK';

  else

    ROLLBACK;
    SET salida = 'NO';

  end if;

else
  ROLLBACK;
  SET salida = 'NO';

end if;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_sesion`
--

DROP PROCEDURE IF EXISTS `sp_sesion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_sesion`(
in usuario_i varchar(50),
in clave_i varchar(50)
)
BEGIN

select p.id_persona,p.apellidos,p.nombres,tp.id_tipo_persona,tp.nombre as tipo_persona
from usuario u
inner join persona p on u.id_persona = p.id_persona
inner join tipo_persona tp on p.id_tipo_persona = tp.id_tipo_persona

where u.nombre = usuario_i and clave = clave_i;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

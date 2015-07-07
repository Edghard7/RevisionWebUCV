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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `asignacion`
--

/*!40000 ALTER TABLE `asignacion` DISABLE KEYS */;
INSERT INTO `asignacion` (`id_asignacion`,`id_tesis_recepcion`,`id_jefe`,`id_revisor`,`fecha_asignacion`) VALUES 
 (1,1,4,2,'2015-06-03 18:50:18'),
 (2,2,1,42,'2015-06-03 19:34:15'),
 (3,3,1,39,'2015-06-03 19:53:51'),
 (4,4,1,41,'2015-06-03 20:29:15'),
 (5,5,1,39,'2015-06-03 21:10:11'),
 (6,6,39,39,'2015-06-11 03:53:16'),
 (7,8,39,39,'2015-06-11 03:53:21'),
 (8,9,39,43,'2015-06-11 04:33:16'),
 (9,11,43,43,'2015-06-17 16:45:40'),
 (10,12,43,43,'2015-06-17 19:29:14'),
 (11,13,43,43,'2015-06-17 23:53:59'),
 (12,14,43,43,'2015-06-18 00:09:43'),
 (13,15,43,43,'2015-06-18 00:11:17'),
 (14,16,43,43,'2015-06-18 02:01:37'),
 (15,17,43,43,'2015-06-24 21:20:22'),
 (16,18,43,43,'2015-06-24 21:23:59');
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
 (10,1,'I','INTRODUCCIÓN','Fundamentación científica, técnica o humanista, antecedentes, justificación. <br />\n1.1.	Problema <br />\n1.2.	Hipótesis <br />\n1.3.	Objetivos <br />\n',10),
 (11,1,'II','MARCO METODOLÓGICO','2.1. Variables <br />\n2.2. Operacionalización de variables <br />\n2.3. Metodología <br />\n2.4. Tipo de estudio <br />\n2.5. Diseño de investigación <br />\n2.6. Población y muestra <br />\n2.7. Técnicas es instrumentos de recolección de datos <br />\n2.8. Métodos de análisis de datos <br />\n2.9. Consideraciones éticas. <br />\n',11),
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `estado`
--

/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` (`id_estado`,`descripcion`) VALUES 
 (1,'ACTIVO'),
 (2,'INACTIVO'),
 (3,'RECEPCIONADO'),
 (4,'ASIGNADO'),
 (5,'FINALIZADO'),
 (6,'CORREGIDO'),
 (7,'PENDIENTE CORRECCIÓN'),
 (8,'PENDIENTE ASIGNACIÓN'),
 (9,'POR REVISAR'),
 (10,'CON OBSERVACIONES'),
 (11,'EN REVISIÓN'),
 (12,'REVISIÓN FINALIZADA');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;


--
-- Definition of table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
CREATE TABLE `facultad` (
  `id_facultad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_facultad`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_act` timestamp NULL DEFAULT NULL,
  `estado` int(11) NOT NULL DEFAULT '7',
  PRIMARY KEY (`id_observacion`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `observacion`
--

/*!40000 ALTER TABLE `observacion` DISABLE KEYS */;
INSERT INTO `observacion` (`id_observacion`,`id_detalle_esquema`,`id_revision`,`observacion`,`fecha`,`fecha_act`,`estado`) VALUES 
 (1,1,5,'obs 1','2015-06-10 16:17:34',NULL,7),
 (2,2,5,'obs 2','2015-06-10 16:17:34',NULL,7),
 (3,3,5,'obs 3','2015-06-10 16:17:34',NULL,7),
 (4,1,14,'LE FALTA ALGO','2015-06-10 16:32:56',NULL,7),
 (5,2,14,'OBS DE PAG JURADO','2015-06-11 03:06:06',NULL,7),
 (7,2,14,'OTRAS','2015-06-11 03:08:11',NULL,7),
 (8,11,14,'DEBE REHACER TODO.\r\nLO SE SOY MUY MALO :)','2015-06-11 03:08:37',NULL,7),
 (9,10,14,'CAMBIA LA INTRODUCCION','2015-06-11 03:19:06',NULL,7),
 (10,13,16,'FUNDAMENTAR SU DISCUSIÓN','2015-06-11 04:34:44','2015-06-17 18:18:45',7),
 (11,10,15,'ALGO ADICIONAL\r\n','2015-06-17 12:38:59',NULL,7),
 (12,10,16,'TODO ESTÁ MAL','2015-06-17 18:20:30',NULL,7),
 (13,12,16,'XDXDXDXDXDXDXDX','2015-06-17 23:51:08',NULL,7),
 (14,13,17,'FUNDAMENTAR SU DISCUSIÓN','2015-06-11 04:34:44','2015-06-17 23:58:51',6),
 (15,10,17,'TODO ESTÁ MAL','2015-06-17 18:20:30','2015-06-17 23:58:40',6),
 (16,12,17,'XDXDXDXDXDXDXDX','2015-06-17 23:51:08','2015-06-17 23:58:46',6),
 (17,1,18,'CAMBIA','2015-06-18 00:08:21',NULL,7),
 (18,9,18,'CORREGIR TRADUCCION','2015-06-18 00:08:40',NULL,7),
 (19,1,19,'CAMBIA','2015-06-18 00:08:21','2015-06-18 00:10:02',6),
 (20,9,19,'CORREGIR TRADUCCION','2015-06-18 00:08:40','2015-06-18 00:10:07',6),
 (22,12,19,'ORGANZAR CONTENIDO','2015-06-18 00:10:24',NULL,7),
 (23,1,20,'CAMBIA','2015-06-18 00:08:21','2015-06-18 00:11:25',6),
 (24,9,20,'CORREGIR TRADUCCION','2015-06-18 00:08:40','2015-06-18 00:11:25',6),
 (25,12,20,'ORGANZAR CONTENIDO','2015-06-18 00:10:24','2015-06-18 00:11:43',6),
 (26,1,21,'CAMBIA','2015-06-18 00:08:21','2015-06-18 02:01:52',6),
 (27,9,21,'CORREGIR TRADUCCION','2015-06-18 00:08:40','2015-06-18 02:01:52',6),
 (28,12,21,'ORGANZAR CONTENIDO','2015-06-18 00:10:24','2015-06-18 02:01:52',6),
 (29,1,22,'CORREGIR GRADOS ACADEMICOS','2015-06-24 21:21:18',NULL,7),
 (30,7,22,'DAR FORMATO AL INDICE','2015-06-24 21:21:29',NULL,7),
 (31,12,22,'COLOCAR NOMBRE A LAS FIGURAS Y TABLAS','2015-06-24 21:21:53',NULL,7),
 (32,17,22,'RESULTADOS','2015-06-24 21:22:18','2015-06-24 21:22:27',6),
 (33,1,23,'CORREGIR GRADOS ACADEMICOS','2015-06-24 21:21:18','2015-06-24 21:24:43',6),
 (34,7,23,'DAR FORMATO AL INDICE','2015-06-24 21:21:29','2015-06-24 21:24:47',6),
 (35,12,23,'COLOCAR NOMBRE A LAS FIGURAS Y TABLAS','2015-06-24 21:21:53','2015-06-24 21:24:53',6),
 (36,17,23,'RESULTADOS','2015-06-24 21:22:18','2015-06-24 21:24:26',6);
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
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `persona`
--

/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` (`id_persona`,`id_tipo_persona`,`apellidos`,`nombres`,`correo`,`estado`) VALUES 
 (1,5,'ZAAAAAAAAAAAAAA','VEEEEEEEE','',1),
 (3,3,'MARTINEZ SERNAQUÉ','MARLON','',1),
 (4,3,'PEREZ ALBELA','JUAN JOSÉ','',1),
 (5,5,'ZAPATA CHAMORRO','BELINDA MARY','hcmasd@gmail.com',1),
 (6,2,'GUTIERRES','DANIEL','sdjfksja@gmail.com',1),
 (7,5,'ZAPATRE','DJFRDR','',1),
 (8,2,'23746NSDF ','32478','',1),
 (9,3,'OOLASD  DKÁ','DJSD +A','',1),
 (10,2,'RODRIGUEZ','MANUEL','',1),
 (11,6,'PEREZ ZAPATA','DANILO','',1),
 (12,2,'SANTOS CHUMACERO','JUAN JOSÉ','',1),
 (13,0,'ZAPATA GARRIDO','DANIEL','',1),
 (14,5,'ZURITA CHUMACERO','EDGARD','ashd@maisl.com',1),
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
 (40,5,'LÓPEZ PATIÑO','JAVIER ALEXANDER','',1),
 (41,6,'CORNEJO SARAVIA','ELMER DAVID','',1),
 (42,6,'ZAPATA RUIZ','SOFÍA','',1),
 (43,4,'HIDALGO RIOFRÍO','MARÍA','',1),
 (44,5,'SAMANIEGO PERALTA','RENSO','',1),
 (45,5,'ZAVALA MENDEZ','ROGELIO','',1),
 (46,4,'ABAD PALIMINO','DANIEL','',1),
 (47,3,'MERINO REYES','JULIAN','',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
 (8,40,4,1),
 (9,41,3,1),
 (10,42,3,1),
 (11,43,3,1),
 (12,39,3,1),
 (13,44,4,1),
 (14,45,4,1),
 (15,46,4,1),
 (16,47,4,1),
 (17,20,2,1),
 (18,20,3,2),
 (19,20,1,2),
 (20,20,1,1),
 (28,20,3,1),
 (29,0,4,1),
 (30,20,4,2),
 (31,0,1,1),
 (32,14,4,1),
 (33,14,1,1),
 (34,20,4,1);
/*!40000 ALTER TABLE `persona_funcion` ENABLE KEYS */;


--
-- Definition of table `revision`
--

DROP TABLE IF EXISTS `revision`;
CREATE TABLE `revision` (
  `id_revision` int(11) NOT NULL AUTO_INCREMENT,
  `id_asignacion` int(11) NOT NULL,
  `comentario` text COLLATE utf8_unicode_ci,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` int(11) NOT NULL DEFAULT '11',
  PRIMARY KEY (`id_revision`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `revision`
--

/*!40000 ALTER TABLE `revision` DISABLE KEYS */;
INSERT INTO `revision` (`id_revision`,`id_asignacion`,`comentario`,`fecha`,`estado`) VALUES 
 (13,3,'....','2015-06-10 07:07:20',12),
 (14,5,'DX','2015-06-10 07:22:44',12),
 (15,7,'XD','2015-06-11 04:02:50',12),
 (16,8,'SE HA FINALIZADO ESTA REVISION Y SE RECOMIENDA LEVANTAR LAS OBSERVACIONES Y VOLVER A ENVIAR','2015-06-11 04:34:27',12),
 (17,11,'FIN DE CORECCION. LISTO PARA EMPASTAR','2015-06-17 23:57:12',12),
 (18,9,'CORREGIR Y VOLVER A ENTVIAR','2015-06-18 00:08:05',12),
 (19,12,'','2015-06-18 00:09:52',12),
 (20,13,'OK LISTO PARA EMPASTAR','2015-06-18 00:11:25',12),
 (21,14,'OK','2015-06-18 02:01:52',12),
 (22,15,'CORREGIR Y VOLVER A ENVIAR','2015-06-24 21:20:59',12),
 (23,16,'OK , LISTO PARA EMPASTAR ','2015-06-24 21:24:26',12),
 (24,10,'SIN OBSERVACIONES','2015-06-24 22:58:33',11);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tesis`
--

/*!40000 ALTER TABLE `tesis` DISABLE KEYS */;
INSERT INTO `tesis` (`id_tesis`,`id_autor`,`id_recepcionista`,`id_linea`,`id_esquema`,`titulo`,`fecha_sustentacion`,`fecha_registro`,`estado`) VALUES 
 (1,33,5,1,1,'INFLUENCIA DE LA UTILIZACION DE UN ........ ','2014-11-24','2015-06-02 23:05:47',11),
 (2,33,5,1,1,'INFLUENCIA DE LA UTILIZACION DE UN LIBRO. ','2014-11-24','2015-06-02 23:34:38',4),
 (3,38,1,10,1,'DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY DISEÑO DE UN XX YY ESPERANDO QUE ESTO SE CORTE ---------....','2014-11-24','2015-06-03 02:47:53',5),
 (4,40,1,5,2,'OTRO TITULO DE TESIS','2014-11-24','2015-06-03 02:53:50',4),
 (5,33,1,7,1,'YA NADA QUEDA','2014-11-24','2015-06-03 03:16:16',4),
 (6,38,1,11,2,'UNA NUEVA TESIS CON TODOS LAS CARACTERISTICAS\r\nY MUY BUENA','2014-11-24','2015-06-03 03:18:28',4),
 (7,40,1,3,1,'UNA NUEVA TESIS PARA ARQUITECTURA','2014-11-27','2015-06-03 13:28:18',3),
 (8,40,1,12,1,'TESIS DEL ESQUEMA CUANTTATIVO DE LA ESCELA DE ADMINISTRACIÓN','2014-11-19','2015-06-03 20:36:07',4),
 (9,44,39,5,1,'LA TESIS DE CALIDAD Y SERVICIO','2014-11-27','2015-06-11 04:32:35',12),
 (10,45,43,10,1,'LA INVESTIGACION DE XY','2015-01-01','2015-06-24 21:19:53',5);
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
  `reingreso` int(11) NOT NULL DEFAULT '0',
  `estado` int(11) NOT NULL DEFAULT '3',
  PRIMARY KEY (`id_tesis_recepcion`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tesis_recepcion`
--

/*!40000 ALTER TABLE `tesis_recepcion` DISABLE KEYS */;
INSERT INTO `tesis_recepcion` (`id_tesis_recepcion`,`id_tesis`,`id_recepcionista`,`id_director`,`fecha_recepcion`,`reingreso`,`estado`) VALUES 
 (1,2,5,4,'2015-06-02 23:34:38',0,4),
 (2,2,5,4,'2015-06-02 23:36:45',0,4),
 (3,3,1,4,'2015-06-03 02:47:53',0,12),
 (4,4,1,15,'2015-06-03 02:53:50',0,4),
 (5,5,1,9,'2015-06-03 03:16:16',0,12),
 (6,6,1,4,'2015-06-03 03:18:28',0,4),
 (7,7,1,9,'2015-06-03 13:28:19',0,3),
 (8,8,1,15,'2015-06-03 20:36:07',0,12),
 (9,9,39,4,'2015-06-11 04:32:35',0,10),
 (11,3,43,15,'2015-06-17 16:40:13',1,10),
 (12,1,43,4,'2015-06-17 19:28:49',1,11),
 (13,9,43,18,'2015-06-17 23:53:39',1,12),
 (14,3,43,15,'2015-06-18 00:09:28',1,10),
 (15,3,43,15,'2015-06-18 00:11:06',1,12),
 (16,3,43,15,'2015-06-18 02:01:18',1,12),
 (17,10,43,18,'2015-06-24 21:19:53',0,10),
 (18,10,43,18,'2015-06-24 21:23:33',1,12);
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id_usuario`,`id_persona`,`nombre`,`clave`,`fecha_registro`,`estado`) VALUES 
 (1,1,'admin','e10adc3949ba59abbe56e057f20f883e','2015-06-02 10:38:42',1),
 (2,37,'dzapata','e10adc3949ba59abbe56e057f20f883e','2015-06-02 21:37:59',1),
 (3,38,'jchuyes38','e10adc3949ba59abbe56e057f20f883e','2015-06-02 21:43:35',1),
 (4,39,'jperez39','e10adc3949ba59abbe56e057f20f883e','2015-06-02 21:45:41',1),
 (5,40,'jlopez40','e10adc3949ba59abbe56e057f20f883e','2015-06-02 22:54:22',1),
 (6,41,'ecornejo41','e10adc3949ba59abbe56e057f20f883e','2015-06-03 17:14:48',1),
 (7,42,'szapata42','e10adc3949ba59abbe56e057f20f883e','2015-06-03 17:15:06',1),
 (8,43,'mhidalgo43','e10adc3949ba59abbe56e057f20f883e','2015-06-03 20:34:39',1),
 (9,44,'rsamaniego44','e10adc3949ba59abbe56e057f20f883e','2015-06-11 04:31:17',1),
 (10,45,'rzavala45','e10adc3949ba59abbe56e057f20f883e','2015-06-24 21:19:13',1),
 (11,46,'dabad46','e10adc3949ba59abbe56e057f20f883e','2015-06-24 22:38:15',1),
 (12,47,'jmerino47','e10adc3949ba59abbe56e057f20f883e','2015-06-25 00:04:28',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;


--
-- Definition of procedure `sp_actualizar_observacion`
--

DROP PROCEDURE IF EXISTS `sp_actualizar_observacion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actualizar_observacion`(
in id_observacion_i int,
in observacion_i text,
in estado_i int,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

set @actual = now();

update observacion set observacion = UPPER(observacion_i), fecha_act = @actual, estado = estado_i
where id_observacion = id_observacion_i;

set @val = (select count(*) from observacion where id_observacion = id_observacion_i and fecha_act = @actual);

if (@val = 1) then

  COMMIT;

  set salida = 'OK';

else

  ROLLBACK;
  set salida = 'NO';

end if;



END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_actualizar_persona`
--

DROP PROCEDURE IF EXISTS `sp_actualizar_persona`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actualizar_persona`(
in id_persona_i int,
in id_tipo_i int,
in apel_i varchar(250),
in nom_i varchar(250),
in correo_i varchar(50),
in estado_i int,
out salida varchar(10)
)
BEGIN

update persona set
id_tipo_persona = id_tipo_i,
apellidos = upper(apel_i),
nombres = upper(nom_i),
correo = correo_i,
estado = estado_i
where id_persona = id_persona_i;

set salida = 'OK';

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_actualizar_persona_funcion`
--

DROP PROCEDURE IF EXISTS `sp_actualizar_persona_funcion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actualizar_persona_funcion`(
in id_per_fun int,
in est int,
out salida varchar(10)
)
BEGIN

if (est = 2) then
  update persona_funcion set estado = 2 where id_persona_funcion = id_per_fun;

end if;

set salida = 'OK';


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

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
-- Definition of procedure `sp_combo_funcion`
--

DROP PROCEDURE IF EXISTS `sp_combo_funcion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_funcion`()
BEGIN

select f.* from funcion f where estado = 1;

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
-- Definition of procedure `sp_combo_persona_x_funcion`
--

DROP PROCEDURE IF EXISTS `sp_combo_persona_x_funcion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_combo_persona_x_funcion`(
in id_funcion_i int
)
BEGIN

SELECT p.id_persona, p.apellidos, p.nombres
FROM persona p
LEFT JOIN persona_funcion pf ON p.id_persona = pf.id_persona
LEFT JOIN funcion f ON pf.id_funcion = f.id_funcion
where f.id_funcion = id_funcion_i AND  p.estado = 1;


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
-- Definition of procedure `sp_listar_asignaciones`
--

DROP PROCEDURE IF EXISTS `sp_listar_asignaciones`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_asignaciones`()
BEGIN

SELECT a.id_asignacion, a.id_tesis_recepcion, t.id_tesis,t.id_esquema,
tr.fecha_recepcion, a.fecha_asignacion,
concat(pa.apellidos,', ',pa.nombres) as autor,
t.titulo, l.nombre as linea_inv, et.descripcion as esquema, es.nombre as escuela,
IFNULL(r.estado,0)  as estado,
IFNULL(e.descripcion,'SIN REVISAR') as estado_d,
concat(au.apellidos,', ',au.nombres) as revisor

FROM asignacion a
INNER JOIN tesis_recepcion tr ON a.id_tesis_recepcion = tr.id_tesis_recepcion
INNER JOIN tesis t ON tr.id_tesis = t.id_tesis
INNER JOIN persona pa ON t.id_autor = pa.id_persona
INNER JOIN linea_investigacion l ON t.id_linea = l.id_linea
INNER JOIN esquema_tesis et ON t.id_esquema = et.id_esquema
INNER JOIN escuela es ON l.id_escuela = es.id_escuela
INNER JOIN persona au ON a.id_revisor = au.id_persona
LEFT JOIN revision r ON a.id_asignacion = r.id_asignacion
LEFT JOIN estado e ON r.estado = e.id_estado

order by estado, a.fecha_asignacion, tr.fecha_recepcion, t.titulo;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_asignaciones_revisor`
--

DROP PROCEDURE IF EXISTS `sp_listar_asignaciones_revisor`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_asignaciones_revisor`(
in id_rev int
)
BEGIN

SELECT a.id_asignacion, a.id_tesis_recepcion, t.id_tesis,t.id_esquema,
tr.fecha_recepcion, a.fecha_asignacion, concat(pa.apellidos,', ',pa.nombres) as autor,
t.titulo, l.nombre as linea_inv, et.descripcion as esquema, es.nombre as escuela,
IFNULL(r.estado,0)  as estado,
e.descripcion as estado_d

FROM asignacion a
INNER JOIN tesis_recepcion tr ON a.id_tesis_recepcion = tr.id_tesis_recepcion
INNER JOIN tesis t ON tr.id_tesis = t.id_tesis
INNER JOIN persona pa ON t.id_autor = pa.id_persona
INNER JOIN linea_investigacion l ON t.id_linea = l.id_linea
INNER JOIN esquema_tesis et ON t.id_esquema = et.id_esquema
INNER JOIN escuela es ON l.id_escuela = es.id_escuela
LEFT JOIN revision r ON a.id_asignacion = r.id_asignacion
LEFT JOIN estado e ON r.estado = e.id_estado

where a.id_revisor = id_rev
order by estado, a.fecha_asignacion, tr.fecha_recepcion, t.titulo;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_esquema`
--

DROP PROCEDURE IF EXISTS `sp_listar_esquema`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_esquema`(in id_esq int)
BEGIN

SELECT
d.`id_detalle`,
d.`id_esquema`,
es.descripcion as esquema,
d.`capitulo`,
d.`nombre`,
d.`contenido`,
d.`orden`
FROM detalle_esquema d
inner JOIN esquema_tesis es ON d.id_esquema = es.id_esquema
where es.id_esquema = id_esq
order by d.orden;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_funciones_de_persona`
--

DROP PROCEDURE IF EXISTS `sp_listar_funciones_de_persona`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_funciones_de_persona`(
in id_per int
)
BEGIN


select pf.id_persona_funcion,p.id_persona, p.apellidos, p.nombres,f.id_funcion, f.nombre as funcion,
pf.estado, e.descripcion as estado_d
from persona p
inner join persona_funcion pf on p.id_persona = pf.id_persona
inner join funcion f on pf.id_funcion = f.id_funcion
inner join estado e on pf.estado = e.id_estado
where p.id_persona = id_per and pf.estado = 1
order by p.apellidos, f.id_funcion;


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_observaciones_asig`
--

DROP PROCEDURE IF EXISTS `sp_listar_observaciones_asig`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_observaciones_asig`(
in id_esq int,
in id_asig int
)
BEGIN

set @rev = (select id_revision from revision where id_asignacion = id_asig);

SELECT
d.`id_detalle`,
d.`id_esquema`,
es.descripcion as esquema,
d.`capitulo`,
d.`nombre`,
d.`contenido`,
d.`orden`,
o.id_observacion,
o.id_revision,
o.observacion,
o.fecha,
o.estado,
e.descripcion as estado_des
FROM observacion o
left join detalle_esquema d on o.id_detalle_esquema = d.id_detalle
inner JOIN esquema_tesis es ON d.id_esquema = es.id_esquema
inner join estado e on o.estado = e.id_estado
where es.id_esquema = id_esq and o.id_revision = @rev
order by d.orden;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_persona`
--

DROP PROCEDURE IF EXISTS `sp_listar_persona`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_persona`()
BEGIN

select p.*,t.nombre as tipo_persona, e.descripcion as estado_d from persona p
inner join tipo_persona t on p.id_tipo_persona = t.id_tipo_persona
inner join estado e on p.estado =e.id_estado
order by p.apellidos, p.nombres;


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_tesis`
--

DROP PROCEDURE IF EXISTS `sp_listar_tesis`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_tesis`()
BEGIN

SELECT t.id_tesis,t.titulo,concat(pa.apellidos,', ',pa.nombres ) as autor,
concat(pr.apellidos,', ',pr.nombres ) as recepcionista,

t.fecha_sustentacion,t.fecha_registro,ifnull(tr.fecha_recepcion,t.fecha_registro) as fecha_ult_recep,
es.nombre as escuela,l.nombre as linea_inv,e.descripcion as esquema,
t.estado,
est.descripcion as estado_des

 FROM tesis t
INNER JOIN persona pa ON t.id_autor = pa.id_persona
INNER JOIN persona pr ON t.id_recepcionista = pr.id_persona
INNER JOIN linea_investigacion l ON t.id_linea = l.id_linea
INNER JOIN esquema_tesis e ON t.id_esquema = e.id_esquema
-- LEFT JOIN (select ter.* from tesis_recepcion ter order by ter.fecha_recepcion) tr ON t.id_tesis = tr.id_tesis
LEFT JOIN tesis_recepcion tr ON t.id_tesis = tr.id_tesis
INNER JOIN escuela es ON l.id_escuela = es.id_escuela
INNER JOIN estado est ON t.estado = est.id_estado

GROUP BY t.id_tesis
ORDER BY t.titulo;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_tesis_finalizadas`
--

DROP PROCEDURE IF EXISTS `sp_listar_tesis_finalizadas`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_tesis_finalizadas`()
BEGIN

SELECT a.id_asignacion, a.id_tesis_recepcion, t.id_tesis,t.id_esquema,
tr.fecha_recepcion, a.fecha_asignacion, concat(pa.apellidos,', ',pa.nombres) as autor,
t.titulo, l.nombre as linea_inv, et.descripcion as esquema, es.nombre as escuela,
concat(rev.apellidos,', ',rev.nombres) as revisor,
t.estado  as estado,
e.descripcion as estado_d

FROM asignacion a
INNER JOIN tesis_recepcion tr ON a.id_tesis_recepcion = tr.id_tesis_recepcion
INNER JOIN tesis t ON tr.id_tesis = t.id_tesis
INNER JOIN persona pa ON t.id_autor = pa.id_persona
INNER JOIN persona rev ON a.id_revisor = rev.id_persona
INNER JOIN linea_investigacion l ON t.id_linea = l.id_linea
INNER JOIN esquema_tesis et ON t.id_esquema = et.id_esquema
INNER JOIN escuela es ON l.id_escuela = es.id_escuela
LEFT JOIN revision r ON a.id_asignacion = r.id_asignacion
LEFT JOIN estado e ON t.estado = e.id_estado

where t.estado = 12
order by t.id_tesis, a.fecha_asignacion desc;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_listar_tesis_sin_asignar`
--

DROP PROCEDURE IF EXISTS `sp_listar_tesis_sin_asignar`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_tesis_sin_asignar`()
BEGIN


SELECT tr.id_tesis_recepcion,t.id_tesis,t.titulo,concat(pa.apellidos,', ',pa.nombres ) as autor,
concat(pr.apellidos,', ',pr.nombres ) as recepcionista,

t.fecha_sustentacion,t.fecha_registro,ifnull(tr.fecha_recepcion,t.fecha_registro) as fecha_ult_recep,
es.nombre as escuela,l.nombre as linea_inv,e.descripcion as esquema,
est.id_estado, est.descripcion as estado

 FROM tesis_recepcion tr
INNER JOIN tesis t ON tr.id_tesis = t.id_tesis
INNER JOIN persona pr ON tr.id_recepcionista = pr.id_persona
INNER JOIN persona pd ON tr.id_director = pd.id_persona
INNER JOIN linea_investigacion l ON t.id_linea = l.id_linea
INNER JOIN persona pa ON t.id_autor = pa.id_persona
INNER JOIN escuela es ON l.id_escuela = es.id_escuela
INNER JOIN esquema_tesis e ON t.id_esquema = e.id_esquema
INNER JOIN estado est ON tr.estado = est.id_estado

WHERE tr.estado = 3
ORDER BY tr.fecha_recepcion, t.titulo, pa.apellidos;


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_apertura_revision`
--

DROP PROCEDURE IF EXISTS `sp_registro_apertura_revision`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_apertura_revision`(
in id_asignacion_i int,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

set @actual = now();

set @val = (select count(*) from revision where id_asignacion = id_asignacion_i);

set @te_re = (select id_tesis_recepcion from asignacion where id_asignacion = id_asignacion_i);

set @tesis = (select id_tesis from tesis_recepcion where id_tesis_recepcion = @te_re);

-- PARA SABER SI LA TEISIS QUE SE ESTA REVISANDO ES NUEVA O ES UN REINGRESO PARA LEVANTAR OBSERVACIONES
-- VALIDACION

-- sabremos cuantas recepciones tiene esta tesis:: >1 significa que tiene reingresos
set @n_tesis = (select count(*) from tesis_recepcion where id_tesis = @tesis);


if (@val = 0) then

insert into revision
values
(
null,
id_asignacion_i,
'SIN OBSERVACIONES',
@actual,
default
);

set @rev_actual = (select id_revision from revision where id_asignacion = id_asignacion_i
and fecha = @actual);


if (@n_tesis > 1) then
-- tesis reingreso
-- la ultima recepcion con estado 10 = CON OBSERVACIONES o 12 = FINALIZADA
set @recep_anterior = (select id_tesis_recepcion from tesis_recepcion
where id_tesis = @tesis and (estado = 10 or estado = 12) order by fecha_recepcion desc limit 1);

set @asig_anterior = (select id_asignacion from asignacion where id_tesis_recepcion = @recep_anterior);

set @rev_anterior = (select id_revision from revision where id_asignacion = @asig_anterior);

--  se pasan las observaciones de la revision anterior a la nueva revision

  INSERT INTO observacion
  SELECT null,id_detalle_esquema,@rev_actual,observacion,fecha,@actual,estado
  from observacion where id_revision = @rev_anterior;

--

end if;
-- FIN VALIDACION


update tesis_recepcion set estado = 11 where id_tesis_recepcion = @te_re;
update tesis set estado = 11 where id_tesis = @tesis;

set @val = (select count(*) from revision where id_asignacion = id_asignacion_i
and fecha = @actual);

if (@val = 1) then
  COMMIT;
  set salida = 'OK';
else
  ROLLBACK;
  set salida = 'NO';
end if;

else
  set salida = 'DUPLICIDAD';

end if;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_asignacion`
--

DROP PROCEDURE IF EXISTS `sp_registro_asignacion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_asignacion`(
in id_recepcion_i int,
in id_jefe_i int,
in id_revisor_i int,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

SET @estado = (SELECT estado FROM tesis_recepcion WHERE id_tesis_recepcion = id_recepcion_i);

if (@estado = 3 and id_revisor_i > 0) then -- solo si el estado es RECEPCIONADO

INSERT INTO asignacion(id_asignacion,id_tesis_recepcion,id_jefe,id_revisor,fecha_asignacion)
VALUES(
NULL,
id_recepcion_i,
id_jefe_i,
id_revisor_i,
NOW()
);

SET @tesis = (SELECT id_tesis FROM tesis_recepcion WHERE id_tesis_recepcion = id_recepcion_i);

UPDATE tesis_recepcion SET estado = 4 WHERE id_tesis_recepcion = id_recepcion_i;
UPDATE tesis SET estado = 4 WHERE id_tesis = @tesis AND estado = 3; -- solo cuando estado = RECEPCIONADO

COMMIT;

SET salida = 'OK';

else

  SET salida = 'ASIGNADO';

end if;

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_cierre_revision`
--

DROP PROCEDURE IF EXISTS `sp_registro_cierre_revision`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_cierre_revision`(
in id_asignacion_i int,
in comentario_i text,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

-- en la tab la revision si se FINALIZA LA REVISION
-- estado = 12
update revision set comentario = upper(comentario_i), estado = 12
where id_asignacion = id_asignacion_i;

set @recep = (select t.id_tesis_recepcion from asignacion a
inner join tesis_recepcion t on a.id_tesis_recepcion = t.id_tesis_recepcion
where a.id_asignacion = id_asignacion_i);

-- id_tesis
set @tesis = (select id_tesis from tesis_recepcion where id_tesis_recepcion = @recep);

-- asignacion del estado para la tesis o recepcion de tesis
set @revision = (select id_revision from revision where id_asignacion = id_asignacion_i);

-- no tiene observaciones
set @nro_obs = (select count(*) from observacion where id_revision = @revision);
-- 6 : CORREGIDO
-- 7 : pediente de correccion
set @nro_corr = (select count(*) from observacion where id_revision = @revision and estado = 7);

if ( @nro_obs = 0 or @nro_corr = 0) then

  -- 12 = REVISION FINALIZADA
  update tesis_recepcion set estado = 12 where id_tesis_recepcion = @recep;
  update tesis set estado = 12 where id_tesis = @tesis;

else

  -- 10 = CON OBSERVACIONNES
  update tesis_recepcion set estado = 10 where id_tesis_recepcion = @recep;
  update tesis set estado = 10 where id_tesis = @tesis;

end if;

COMMIT;

set salida = 'OK';

END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_fin_revision`
--

DROP PROCEDURE IF EXISTS `sp_registro_fin_revision`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_fin_revision`(
in tesis int,
out salida varchar(10)
)
BEGIN


DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;


UPDATE tesis set estado = 5 where id_tesis = tesis;

commit;

set salida = 'OK';


END $$
/*!50003 SET SESSION SQL_MODE=@TEMP_SQL_MODE */  $$

DELIMITER ;

--
-- Definition of procedure `sp_registro_observacion_asignacion`
--

DROP PROCEDURE IF EXISTS `sp_registro_observacion_asignacion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_observacion_asignacion`(
in id_detalle_i int,
in id_asignacion_i int,
in observacion_i  text,
out salida varchar(10)
)
BEGIN

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

set @rev = (select id_revision from revision where id_asignacion = id_asignacion_i);

set @actual = now();

-- se obvia la validacion para que el revisor pueda ingresar cuantas observaciones desee
-- SET @val = (select count(*) from observacion where id_revision = @rev and id_detalle_esquema = id_detalle_i);
-- obviando la validacion
set @val = 0;

if (@val = 0) then

insert into observacion
values(
null,
id_detalle_i,
@rev,
upper(observacion_i),
@actual,
null,
default
);

SET @val = (select count(*) from observacion
where id_revision = @rev and id_detalle_esquema = id_detalle_i and fecha = @actual);

if (@val = 1) then
  commit;
  set salida = 'OK';
else
  rollback;
  set salida = 'NO';

end if;

else
  set salida = 'EXISTE';

end if;

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
-- Definition of procedure `sp_registro_persona_funcion`
--

DROP PROCEDURE IF EXISTS `sp_registro_persona_funcion`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registro_persona_funcion`(
in id_persona_i int,
in id_funcion_i int,
out salida varchar(10)
)
BEGIN


DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
  ROLLBACK;
END;

START TRANSACTION;

set @existe = (select count(*) from persona_funcion
where id_persona= id_persona_i and id_funcion= id_funcion_i and estado = 1);

if (@existe = 0)then

  insert into persona_funcion values (null, id_persona_i,id_funcion_i,default);

  set @existe = (select count(*) from persona_funcion
  where id_persona= id_persona_i and id_funcion= id_funcion_i and estado = 1);

  if (@existe = 1) then
    commit;
    set salida = 'OK';
  else
    rollback;
    set salida = 'NO';

  end if;

else
  set salida = 'OK';

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

  CALL sp_registro_tesis_recepcion(@tesis,id_recepcionista_i,id_director_i,'T',@salida);

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
in ingreso varchar(1),
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

set @actual = now();

if (@activo = 0) then

  INSERT INTO tesis_recepcion(id_tesis_recepcion,id_tesis,id_recepcionista,id_director,fecha_recepcion,reingreso,estado)
  VALUES(
  NULL,
  id_tesis_i,
  id_recepcionista_i,
  id_director_i,
  @actual,
  DEFAULT,
  DEFAULT
  );

  if(ingreso = 'R') then

  UPDATE tesis_recepcion set reingreso = 1 where id_tesis = id_tesis_i and fecha_recepcion = @actual;

  end if;

  SET @registro =(SELECT count(*) FROM tesis_recepcion
  WHERE id_tesis = id_tesis_i and id_recepcionista = id_recepcionista_i
  and estado = 3 and fecha_recepcion = @actual);

  UPDATE tesis set estado = 3 where id_tesis = id_tesis_i;

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

--
-- Definition of procedure `sp_validar_recepcion_tesis`
--

DROP PROCEDURE IF EXISTS `sp_validar_recepcion_tesis`;

DELIMITER $$

/*!50003 SET @TEMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_ENGINE_SUBSTITUTION' */ $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_validar_recepcion_tesis`(
in tesis int
)
BEGIN

-- si no encuentra registros : se puede registrar la recepcion
-- de lo contrario se oculta la opcion

select r.* from tesis_recepcion r
where (r.estado = 3 or r.estado = 4 or r.estado = 11)  and r.id_tesis = tesis
order by r.fecha_recepcion desc
limit 1;


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

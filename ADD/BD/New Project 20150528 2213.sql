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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `escuela`
--

/*!40000 ALTER TABLE `escuela` DISABLE KEYS */;
/*!40000 ALTER TABLE `escuela` ENABLE KEYS */;


--
-- Definition of table `esquema_tesis`
--

DROP TABLE IF EXISTS `esquema_tesis`;
CREATE TABLE `esquema_tesis` (
  `id_esquema` int(11) NOT NULL AUTO_INCREMENT,
  `id_formato` int(11) NOT NULL,
  `descripcion` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_esquema`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `esquema_tesis`
--

/*!40000 ALTER TABLE `esquema_tesis` DISABLE KEYS */;
INSERT INTO `esquema_tesis` (`id_esquema`,`id_formato`,`descripcion`,`estado`) VALUES 
 (1,1,'ESQUEMA CUANTITATIVO 2014',1),
 (2,2,'ESQUEMA CUALITATIVO 2014',1);
/*!40000 ALTER TABLE `esquema_tesis` ENABLE KEYS */;


--
-- Definition of table `estado`
--

DROP TABLE IF EXISTS `estado`;
CREATE TABLE `estado` (
  `id_estado` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_estado`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
 (8,'PENDIENTE ASIGNACIÓN');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;


--
-- Definition of table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
CREATE TABLE `facultad` (
  `id_facultad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_facultad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `facultad`
--

/*!40000 ALTER TABLE `facultad` DISABLE KEYS */;
/*!40000 ALTER TABLE `facultad` ENABLE KEYS */;


--
-- Definition of table `formato_tesis`
--

DROP TABLE IF EXISTS `formato_tesis`;
CREATE TABLE `formato_tesis` (
  `id_formato` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id_formato`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `formato_tesis`
--

/*!40000 ALTER TABLE `formato_tesis` DISABLE KEYS */;
INSERT INTO `formato_tesis` (`id_formato`,`nombre`) VALUES 
 (1,'ENFOQUE CUANTITATIVO'),
 (2,'ENFOQUE CUALITATIVO');
/*!40000 ALTER TABLE `formato_tesis` ENABLE KEYS */;


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `linea_investigacion`
--

/*!40000 ALTER TABLE `linea_investigacion` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
 (12,2,'SANTOS CHUMACERO','JUAN JOSÉ','',1);
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `persona_funcion`
--

/*!40000 ALTER TABLE `persona_funcion` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tesis`
--

/*!40000 ALTER TABLE `tesis` DISABLE KEYS */;
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
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`id_tesis_recepcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tesis_recepcion`
--

/*!40000 ALTER TABLE `tesis_recepcion` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tipo_persona`
--

/*!40000 ALTER TABLE `tipo_persona` DISABLE KEYS */;
INSERT INTO `tipo_persona` (`id_tipo_persona`,`nombre`,`estado`) VALUES 
 (1,'SECRETARIA',1),
 (2,'JEFE DE INVESTIGACIÓN',1),
 (3,'DIRECTOR DE ESCUELA',1),
 (4,'ASISTENTE DE ESCUELA',1),
 (5,'ALUMNO',1);
/*!40000 ALTER TABLE `tipo_persona` ENABLE KEYS */;


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;


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

-- si existe un registro similar
SET @val = (SELECT count(*) FROM persona WHERE concat(apellidos,nombres) = UPPER(concat(apellidos_i,nombres_i)));

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

	  COMMIT;
	  SET salida = 'OK';

	else
	  ROLLBACK;
	  SET salida = 'NO';

	end if;

else

  set salida = 'EXISTE';

end if;

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

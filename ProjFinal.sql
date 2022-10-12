CREATE DATABASE dbProjFinal;
USE dbProjFinal;

SELECT * FROM computador;	
CREATE TABLE `computador` (
  `idComputador` varchar(11) NOT NULL,
  `Tipo` varchar(120) DEFAULT NULL,
  `Sala` varchar(30) DEFAULT NULL,
  `Empresa` varchar(20) DEFAULT NULL,
  `PlacaMae` bit(1) DEFAULT NULL,
  `HD` bit(1) DEFAULT NULL,
  `PlacaRede` bit(1) DEFAULT NULL,
  `RAM` bit(1) DEFAULT NULL,
  `Fonte` bit(1) DEFAULT NULL,
  `PlacaVideo` bit(1) DEFAULT NULL,
  `Processador` bit(1) DEFAULT NULL,
  `Drive` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idComputador`)
);


/*CREATE TABLE `usuario` (
  `idUsuario` int(4) NOT NULL AUTO_INCREMENT,
  `login` varchar(25) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
);*/
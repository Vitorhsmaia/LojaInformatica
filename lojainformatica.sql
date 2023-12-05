create database lojainformatica;

USE lojainformatica;

CREATE TABLE Computador (
    idComputador INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    hd VARCHAR(10) NOT NULL,
	processador VARCHAR(50) NOT NULL
);

SELECT * FROM Computador;

DELETE FROM Computador
WHERE idComputador = 1;
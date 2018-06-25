CREATE DATABASE IF NOT EXISTS VetSpa;

USE VetSpa;

CREATE TABLE IF NOT EXISTS DISTRITO (
	CODDIST	CHAR(3) PRIMARY KEY,
	NOMDIST VARCHAR(300)
);

CREATE TABLE IF NOT EXISTS USUARIO(
	ID INT PRIMARY KEY AUTO_INCREMENT,
	USERNAME VARCHAR(300),
	PASS VARCHAR(300),
	UNIQUE(USERNAME)
);

CREATE TABLE IF NOT EXISTS CLIENTE(
	ID INT PRIMARY KEY AUTO_INCREMENT,
	DNICLI CHAR(8) NOT NULL,
	NOMCLI VARCHAR(300),
	NOMSEGCLI VARCHAR(300),
	APEPATCLI VARCHAR(300),
	APEMATCLI VARCHAR(300),
	FECNACCLI DATE,
	SEXCLI BOOLEAN,
	CELCLI VARCHAR(10),
	DIRCLI VARCHAR(200),
	CODDIST CHAR(3),
	UNIQUE(DNICLI),
	FOREIGN KEY(CODDIST) REFERENCES DISTRITO(CODDIST) 
);

-- USUARIO
INSERT INTO USUARIO (USERNAME, PASS) VALUES ('admin', 'admin');


-- DISTRITO
INSERT INTO DISTRITO VALUES ('D01','ATE');
INSERT INTO DISTRITO VALUES ('D02','JESÚS MARÍA');
INSERT INTO DISTRITO VALUES ('D03','SAN ISIDRO');
INSERT INTO DISTRITO VALUES ('D04','LA MOLINA');
INSERT INTO DISTRITO VALUES ('D05','SAN MIGUEL');
INSERT INTO DISTRITO VALUES ('D06','MIRAFLORES');
INSERT INTO DISTRITO VALUES ('D07','BARRANCO');
INSERT INTO DISTRITO VALUES ('D08','CHORRILLOS');
INSERT INTO DISTRITO VALUES ('D09','SAN BORJA');
INSERT INTO DISTRITO VALUES ('D10','LINCE');
INSERT INTO DISTRITO VALUES ('D11','BREÑA');
INSERT INTO DISTRITO VALUES ('D12','MAGDALENA');
INSERT INTO DISTRITO VALUES ('D13','RIMAC');
INSERT INTO DISTRITO VALUES ('D14','SURQUILLO');
INSERT INTO DISTRITO VALUES ('D15','PUEBLO LIBRE');
INSERT INTO DISTRITO VALUES ('D16','BELLAVISTA');
INSERT INTO DISTRITO VALUES ('D17','CALLAO');
INSERT INTO DISTRITO VALUES ('D18','SAN MARTIN DE PORRES');
INSERT INTO DISTRITO VALUES ('D19','SANTA ANITA');
INSERT INTO DISTRITO VALUES ('D20','LOS OLIVOS');
INSERT INTO DISTRITO VALUES ('D21','INDEPENDENCIA');
INSERT INTO DISTRITO VALUES ('D22','LIMA - CERCADO');
INSERT INTO DISTRITO VALUES ('D23','LA VICTORIA');
INSERT INTO DISTRITO VALUES ('D24','SAN LUIS');
INSERT INTO DISTRITO VALUES ('D25','EL AGUSTINO');
INSERT INTO DISTRITO VALUES ('D26','SAN JUAN DE LURIGANCHO');
INSERT INTO DISTRITO VALUES ('D27','ATE - VITARTE');
INSERT INTO DISTRITO VALUES ('D28','SAN JUAN DE MIRAFLORES');
INSERT INTO DISTRITO VALUES ('D29','CARMEN DE LA LEGUA');
INSERT INTO DISTRITO VALUES ('D30','COMAS');
INSERT INTO DISTRITO VALUES ('D31','VILLA MARÍA DEL TRIUNFO');
INSERT INTO DISTRITO VALUES ('D32','VILLA EL SALVADOR');
INSERT INTO DISTRITO VALUES ('D33','LA PERLA');
INSERT INTO DISTRITO VALUES ('D34','VENTANILLA');
INSERT INTO DISTRITO VALUES ('D35','PUENTE PIEDRA');
INSERT INTO DISTRITO VALUES ('D36','CARABAYLLO');
INSERT INTO DISTRITO VALUES ('D37','SANTA MARIA');
INSERT INTO DISTRITO VALUES ('D38','LA PUNTA');


-- CLIENTE
INSERT INTO CLIENTE (DNICLI, NOMCLI, NOMSEGCLI, APEPATCLI, APEMATCLI, FECNACCLI, SEXCLI, CELCLI, DIRCLI, CODDIST) VALUES ('74243850', 'LUIS', 'RENATO','MUÑOZ', 'URIBE', '2017-12-09-','1', '987654321','CALLE LA CHULAPI 666', 'D01');
INSERT INTO CLIENTE (DNICLI, NOMCLI, NOMSEGCLI, APEPATCLI, APEMATCLI, FECNACCLI, SEXCLI, CELCLI, DIRCLI, CODDIST) VALUES ('12345677', 'BRUNO', 'ALBERTO','MARQUEZ', 'MURILLO', '2017-12-09','1', '987654321','CALLE LA CHULAPI 666', 'D11');
INSERT INTO CLIENTE (DNICLI, NOMCLI, NOMSEGCLI, APEPATCLI, APEMATCLI, FECNACCLI, SEXCLI, CELCLI, DIRCLI, CODDIST) VALUES ('54811772', 'DANTE', 'JESUS','CHAVEZ', 'ABARCA', '2017-12-09','1', '987654321','CALLE LA CHULAPI 666', 'D05');
INSERT INTO CLIENTE (DNICLI, NOMCLI, NOMSEGCLI, APEPATCLI, APEMATCLI, FECNACCLI, SEXCLI, CELCLI, DIRCLI, CODDIST) VALUES ('73490503', 'ANGELO', '','MUÑOZ', 'URIBE', '2017-12-09','1', '987654321','CALLE LA CHULAPI 666', 'D07');
INSERT INTO CLIENTE (DNICLI, NOMCLI, NOMSEGCLI, APEPATCLI, APEMATCLI, FECNACCLI, SEXCLI, CELCLI, DIRCLI, CODDIST) VALUES ('42452342', 'FRANCISCO', '','IBAÑEZ', 'SALAZAR', '2017-12-09','1', '987654321','CALLE LA CHULAPI 666', 'D09');



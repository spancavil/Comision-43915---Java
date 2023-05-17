-- DDL
CREATE TABLE cliente (
	id INTEGER,
	nombre VARCHAR(255),
	pais VARCHAR(255),
	habilitado BIT,
  	saldo DECIMAL(10, 2),
	PRIMARY KEY(id)
);

-- DML
INSERT into cliente VALUES 
	(1, 'Jorge', 'Argentina',0, 120),
	(2, 'Lisa', 'Chile',1, 400.89),
	(3, 'Oscar', 'Uruguay',1, 389.21),
	(4, 'Joao', 'Brasil',1, 1200.78),
	(5, 'Veronica', 'Bolivia',1, 540.78),
	(6, 'Ernesto', 'Brasil',1, 690.34),
	(7, 'Marge', 'Brasil',1, 874.25),
	(8, 'Azucena', 'Chile',1, 900.23),
    (9, 'Damián', 'Argentina',1, 121.10),
	(10, 'Jorgelina', 'Argentina',0, 45.23);


-- DQL
SELECT * from cliente;

-- Seleccionar solo los clientes de Brasil
SELECT * from cliente where pais = 'Brasil'

-- Contar todos los clientes y ordenar por país en forma descendente
SELECT COUNT(id) as cantidad, pais
FROM cliente
GROUP BY pais
ORDER BY cantidad DESC;

-- Contar sólo los clientes de Brasil
SELECT COUNT(id), pais
FROM cliente
GROUP BY pais
HAVING pais = 'Brasil';

-- Contar los clientes de Argentina que estén habilitados
SELECT COUNT(id) as clientes_habilitados, pais
FROM cliente
WHERE habilitado = 1
GROUP BY pais
HAVING pais = 'Argentina';

-- Otra forma
SELECT COUNT(id) as clientes_habilitados, pais
FROM cliente
WHERE habilitado = 1 AND pais = 'Argentina'
GROUP BY pais;

-- Sumar todos los saldos de todos los paises y ordenarlos de menor a mayor
SELECT SUM(cliente.saldo) as suma_saldos, pais
FROM cliente
GROUP by pais
ORDER by suma_saldos ASC;

-- Realizar un promedio de saldos por país y ordenarlo de menor a mayor
SELECT AVG(cliente.saldo) as promedio_saldos, pais
FROM cliente
GROUP by pais
ORDER by promedio_saldos ASC;
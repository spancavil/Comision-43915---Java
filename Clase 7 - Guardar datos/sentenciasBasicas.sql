-- DDL (en sqlite online no hay que crear nada, ya viene con la DB demo)
CREATE DATABASE coderhouse;

USE Coderhouse;

-- Creación de tabla (sin PK ni FK)
CREATE TABLE alumno (
    nombre VARCHAR(150) NOT NULL, 
    apellido varchar(150) NOT NULL, 
    dni int not null, 
	legajo int not null,
    PRIMARY KEY(dni)
);

-- Esto es algo propio de MS SQL | análogo a describe
exec sp_columns alumno;

-- DML
-- Forma 1 de insertar
insert into alumno (nombre, apellido, dni, legajo) values
	('Sebas', 'Ancavil', 222321112, 1),
    ('Marcos', 'Lopez', 21311231, 2);
    
-- Forma 2 de insertar sin especificar campos
insert into alumno values ('Juana', 'De Arco', 222123123, 3);

-- Select con variantes
-- Seleccionar solo un campos
select apellido from alumno;

-- Seleccionar con una condición
select * from alumno where nombre = "Sebas";

-- Alter table, agregando fecha de nacimiento (tipo DATE YYYY-MM-DD
alter table alumno add fecha_nacimiento date;

-- Actualizamos las fechas de nacimiento
update alumno set fecha_nacimiento='1990-06-24' where legajo = 1;

-- Foreign keys

-- Agregamos una tabla adicional para las notas con la FK que referencia al dni de la tabla alumno (que es PK)
-- Además agregamos un id para cada nota autoincremental (IDENTITY)

CREATE table nota_alumno (
    id INT IDENTITY(1,1),
    dni INT NOT NULL,
    nota INT NOT NULL,
    curso VARCHAR(255),
    primary key (id),
    foreign key (dni) references alumno(dni)
);

-- Agregamos algunas notas.
insert into nota_alumno values
	(222321112, 7, 'Javascript'),
    (21311231, 8, 'Java Inicial');

-- DNI inexistente, qué debería pasar?
insert into nota_alumno values
	(22, 7, 'Javascript');
    
-- Cláusula JOIN. Inner Join me trae datos de FK que coincidan en ambas tablas.
-- Ejemplo hay un alumno que no tiene nota, entonces ese registro no vendrá, a menos que le coloquemos LEFT JOIN

SELECT *
FROM Coderhouse.alumno AS a
INNER JOIN Coderhouse.nota_alumno AS n
ON a.dni = n.dni;

SELECT a.nombre, a.apellido, n.nota, n.curso
FROM Coderhouse.alumno AS a
INNER JOIN Coderhouse.nota_alumno AS n
ON a.dni = n.dni;
    

    



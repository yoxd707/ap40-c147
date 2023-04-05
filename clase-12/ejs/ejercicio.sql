-- Enunciado:
-- La empresa Qatar2022, desea realizar un sistema que permita almacenar la siguiente información:
-- ● Los empleados que trabajan en la empresa. De cada empleado se sabe DNI, nombre,
--   apellido, nacionalidad y en qué departamento trabaja (logística, sistemas, compras, etc.)
-- ● De cada departamento que posee la empresa se sabe el presupuesto que maneja.

-- 1) Realizar el modelo relacional del enunciado propuesto.
-- 2) Generar el modelo en algún motor de DB (oracle, mysql, sqlite, etc.)

DROP DATABASE IF EXISTS clase12;
CREATE DATABASE clase12;

USE clase12;

CREATE TABLE departamento(
	id int NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    presupuesto int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE empleado(
	dni int NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    nacionalidad varchar(100) NOT NULL,
    id_departamento int NOT NULL,
    PRIMARY KEY (dni),
    FOREIGN KEY (id_departamento) REFERENCES departamento(id)
);

INSERT departamento (nombre, presupuesto) VALUES ('logística', 500000);
INSERT departamento (nombre, presupuesto) VALUES ('compras', 320000);
INSERT departamento (nombre, presupuesto) VALUES ('sistemas', 760000);

-- 3) Realizar consultas para: (puntos del 4 al 8)

-- 4) Insertar un empleado nuevo en la nómina de trabajo.

INSERT empleado VALUES (26711628, 'Jorge', 'Prada', 'Argentino', 1);
INSERT empleado VALUES (28611762, 'Egroj', 'Prada', 'Argentino', 2);
INSERT empleado VALUES (27918293, 'Random', 'Random', 'Random', 3);

-- 5) Modificar la nacionalidad de algún empleado.

UPDATE empleado SET nacionalidad='Mexicano' WHERE dni=26711628;

-- 6) Eliminar un departamento.

-- Pimero elimino a los empleados del departamento, de lo contrario obtendría un error.
DELETE FROM empleado WHERE id_departamento=2;
DELETE FROM departamento WHERE id=2;

-- 7) Conocer los empleados que trabajan en el departamento de “logística” (puede ser
--    cualquiera de los que agreguen).

SELECT * FROM empleado WHERE id_departamento=1;

-- 8) Mostrar todos los departamentos ordenados alfabéticamente.

SELECT * FROM departamento ORDER BY nombre ASC;

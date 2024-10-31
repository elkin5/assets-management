CREATE TABLE activo
(
    id             serial PRIMARY KEY,
    responsable    VARCHAR(255),
    fecha_compra   DATE,
    numero_factura VARCHAR(50),
    descripcion    TEXT,
    estado         VARCHAR(50)
);

-- Crear la tabla 'Tecnologico' para representar la subclase Tecnologico
CREATE TABLE tecnologico
(
    id                        serial PRIMARY KEY,
    marca                     VARCHAR(100),
    ubicacion                 VARCHAR(100),
    detalle                   TEXT,
    fecha_expiracion_garantia DATE,
    detalle_garantia          TEXT,
    activo_id                INT REFERENCES activo (id)
);

-- Crear la tabla 'Muebleria' para representar la subclase Muebleria
CREATE TABLE muebleria
(
    id           serial PRIMARY KEY,
    fabricante   VARCHAR(100),
    ubicacion    VARCHAR(100),
    cantidad     INT,
    detalle      TEXT,
    estado       VARCHAR(50),
    activo_id   INT REFERENCES activo (id)
);

-- Crear la tabla 'Abstracto' para representar la subclase Abstracto
CREATE TABLE abstracto
(
    id           serial PRIMARY KEY,
    url          VARCHAR(200),
    estado       VARCHAR(50),
    activo_id   INT REFERENCES activo (id)
);

-- Crear la tabla 'Licencia' para representar la subclase Licencia
CREATE TABLE licencia
(
    id                serial PRIMARY KEY,
    proveedor         VARCHAR(100),
    fecha_vencimiento DATE,
    estado varchar(50),
    abstracto_id        INT REFERENCES abstracto (id)
);

-- Crear las tablas adicionales para las subclases de Tecnologico y Muebleria si es necesario

-- Ejemplo: Tabla 'Computador' para la subclase 'Computador'
CREATE TABLE computador
(
    id           serial PRIMARY KEY,
    procesador   VARCHAR(100),
    ram          INT,
    disco_duro   VARCHAR(100),
    tecnologico_id   INT REFERENCES tecnologico (id)
);

-- Ejemplo: Tabla 'Monitor' para la subclase 'Monitor'
CREATE TABLE monitor
(
    id           serial PRIMARY KEY,
    pulgadas     INT,
    tecnologico_id   INT REFERENCES tecnologico (id)
);

-- Ejemplo: Tabla 'Mantenimiento' para la subclase 'Mantenimiento'
CREATE TABLE mantenimiento
(
    id                        serial PRIMARY KEY,
    responsable_mantenimiento VARCHAR(100),
    muebleria_id                INT REFERENCES muebleria (id)
);

-- Ejemplo: Tabla 'Fijo' para la subclase 'Fijo'
CREATE TABLE fijo
(
    id           serial PRIMARY KEY,
    muebleria_id   INT REFERENCES muebleria (id)
);

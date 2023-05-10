-- Se coloca entre "" los campos y los nombres porque sino por default las convierte en UPPERCASE

CREATE TABLE client(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(75) NOT NULL,
    lastname VARCHAR(75) NOT NULL,
    docnumber VARCHAR(11) UNIQUE NOT NULL
);

CREATE TABLE product(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(150),
    code VARCHAR(50) UNIQUE NOT NULL,
    stock INTEGER,
    price DOUBLE
);
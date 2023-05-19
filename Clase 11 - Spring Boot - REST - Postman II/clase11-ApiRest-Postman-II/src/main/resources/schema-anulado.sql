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

CREATE TABLE invoice(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    created_at VARCHAR(12) NOT NULL,
    total DOUBLE,
    client_id INTEGER,
    CONSTRAINT FK_CLIENT_ID FOREIGN KEY(client_id) REFERENCES client(id)
);

CREATE TABLE invoice_detail(
    invoice_detail_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    invoice_id INTEGER,
    quantity INTEGER,
    product_id INTEGER,
    price DOUBLE,
    CONSTRAINT FK_INVOICE_ID FOREIGN KEY(invoice_id) REFERENCES invoice(id),
    CONSTRAINT FK_PRODUCT_ID FOREIGN KEY(product_id) REFERENCES product(id)
);
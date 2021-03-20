DROP TABLE customers IF EXISTS;

CREATE TABLE customers (
  idCustomer  INTEGER IDENTITY PRIMARY KEY,
  nameCu VARCHAR(30),
  surName1  VARCHAR(30),
  surName2  VARCHAR(30),
  identityDocNumber  VARCHAR(30)
);
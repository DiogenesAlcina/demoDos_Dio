CREATE TABLE IF NOT EXISTS vets (
  idCustomer  INT(4) NOT NULL  PRIMARY KEY,
  nameCu VARCHAR(30),
  surName1  VARCHAR(30),
  surName2  VARCHAR(30),
  identityDocNumber  VARCHAR(30)

) engine=InnoDB;


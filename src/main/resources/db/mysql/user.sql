CREATE DATABASE IF NOT EXISTS customers;

ALTER DATABASE customers
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON customers.* TO 'customers'@'%' IDENTIFIED BY 'customers';

DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

CREATE TABLE db_test.user (
  id   INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255)
);

INSERT INTO db_test.user (name) VALUES ('tom');

SELECT *
FROM db_test.user;

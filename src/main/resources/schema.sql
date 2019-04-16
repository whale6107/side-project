drop table app_role if exists;
drop table app_user if exists;
drop table user_role if exists;
drop table product if exists;

CREATE TABLE product (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  price float DEFAULT NULL,
  picture_url varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE USER (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  USERNAME varchar(100) NOT NULL,
  PASSWORD varchar(100) NOT NULL,
  FIRSTNAME varchar(255) NOT NULL,
  LASTNAME varchar(255) NOT NULL,
  EMAIL varchar(255) NOT NULL,
  ENABLED bit,
  LASTPASSWORDRESETDATE TIMESTAMP NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE AUTHORITY (
  ID bigint(20) NOT NULL AUTO_INCREMENT,
  NAME varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE USER_AUTHORITY AS 
  (SELECT USER.ID as USER_ID, 
          AUTHORITY.ID as AUTHORITY_ID
   FROM   USER 
          INNER JOIN AUTHORITY 
                  ON USER.ID = AUTHORITY.ID);



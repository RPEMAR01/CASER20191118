--sqlplus sys/oracle as sysdba @oracle-install.sql
--DROP USER sakila CASCADE;

CREATE USER sakila IDENTIFIED BY sakila;
/
ALTER USER sakila DEFAULT TABLESPACE users
              QUOTA UNLIMITED ON users;
/
ALTER USER sakila TEMPORARY TABLESPACE temp;
/
GRANT CREATE SESSION, CREATE VIEW, ALTER SESSION, CREATE SEQUENCE TO sakila;
GRANT CREATE SYNONYM, CREATE DATABASE LINK, RESOURCE , UNLIMITED TABLESPACE TO sakila;
/
--CONNECT sys/oracle AS SYSDBA
--/
--GRANT execute ON sys.dbms_stats TO sakila;
--/
CONNECT sakila/sakila
/
@oracle-sakila-schema.sql
/
@oracle-sakila-schema-pl-sql.sql
/
@oracle-sakila-insert-data.sql
/
exit
/
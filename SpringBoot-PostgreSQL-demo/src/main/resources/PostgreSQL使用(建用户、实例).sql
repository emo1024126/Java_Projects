
--创建用户
CREATE USER "BSITS" WITH
	LOGIN
	SUPERUSER
	CREATEDB
	NOCREATEROLE
	INHERIT
	REPLICATION
	CONNECTION LIMIT -1
	PASSWORD 'xxxxxx';



--创建数据库实例
CREATE DATABASE "BSITS"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

GRANT ALL ON DATABASE "BSITS" TO "BSITS";



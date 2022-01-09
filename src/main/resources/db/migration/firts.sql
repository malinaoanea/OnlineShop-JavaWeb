CREATE TABLE if not exists users(
    id        SERIAL   NOT NULL primary key,
	email        VARCHAR(45) NOT NULL,
    surname        VARCHAR(45) NOT NULL,
    name       VARCHAR(45) NULL,
    user_type      VARCHAR(45) NULL
);


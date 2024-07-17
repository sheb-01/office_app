DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username text
    );

DROP TABLE IF EXISTS schedules;

CREATE TABLE schedules (
    id SERIAL PRIMARY KEY,
    date date
    );
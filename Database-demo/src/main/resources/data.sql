/*
create table person(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);
*/

INSERT INTO person(id,name,location,birth_date) VALUES(10001, 'Sekh', 'Bhola', sysdate());
INSERT INTO person(id,name,location,birth_date) VALUES(10002, 'Mahadi', 'Dhaka', sysdate());
INSERT INTO person(id,name,location,birth_date) VALUES(10003, 'Rupon', 'Khulna', sysdate());
INSERT INTO person(id,name,location,birth_date) VALUES(10004, 'Arisha', 'Barishal', sysdate());



create table users(
	username varchar(50) not null primary key,
	password varchar(50) not null,
	enabled boolean not null
);
create table authorities (
	id integer not null primary key,
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

INSERT INTO users (username,password,enabled)
VALUES ('admin','pass', true);
INSERT INTO users (username,password,enabled)
VALUES ('user','pass', true);

INSERT INTO authorities(id,username,authority)
VALUES(1,'user','USER');
INSERT INTO authorities(id,username,authority)
VALUES(2,'admin','ADMIN');
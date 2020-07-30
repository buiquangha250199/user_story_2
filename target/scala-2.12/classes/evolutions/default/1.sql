# --- !Ups
CREATE TABLE user(
                     id int not null AUTO_INCREMENT,
                     email varchar(255) not null unique,
                     password varchar(255) not null,
                     primary key (id)
);
INSERT INTO user (id, email, password) VALUE (1,'ha_bq@mail.com','123');
INSERT INTO user (id, email, password) VALUE (2,'qh25@mail.com','123');

# --- !Downs
DROP TABLE user;

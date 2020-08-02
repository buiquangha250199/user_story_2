# --- !Ups
CREATE TABLE post (
                      id int NOT NULL AUTO_INCREMENT,
                      title varchar(255) not null ,
                      description varchar(255),
                      user_email varchar(100) not null,
                      PRIMARY KEY (id)
);
INSERT INTO post (title, description, user_email) VALUE ('First blog','This is a desciption from blog 1', "ha@gmail.com");
INSERT INTO post (title, description, user_email) VALUE ('Second blog','This is a desciption from blog 2', "ha_bq@gmail.com");
INSERT INTO post (title, description, user_email) VALUE ('Third blog','This is a desciption from blog 3', "ha_25@gmail.com");
INSERT INTO post (title, description, user_email) VALUE ('4th blog','This is a desciption from blog 4', "haqh@gmail.com");
INSERT INTO post (title, description, user_email) VALUE ('5th blog','This is a desciption from blog 5', "haabc@gmail.com");
INSERT INTO post (title, description, user_email) VALUE ('6th blog','This is a desciption from blog 6', "ha_jp@gmail.com");

# --- !Downs
DROP TABLE post;

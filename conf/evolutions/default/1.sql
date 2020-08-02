# --- !Ups
CREATE TABLE post (
                      id        		int             			NOT NULL 	AUTO_INCREMENT,
                      title     		varchar(255),
                      description  			varchar(250)            NOT NULL ,
                      user_email    varchar(100),
                      PRIMARY KEY (id)
);
INSERT INTO post (id, title, description, user_email) VALUE (1,'First blog','This is a desciption from blog 1', "ha@gmail.com");
INSERT INTO post (id, title, description, user_email) VALUE (2,'Second blog','This is a desciption from blog 2', "ha_bq@gmail.com");
INSERT INTO post (id, title, description, user_email) VALUE (3,'Third blog','This is a desciption from blog 3', "ha_25@gmail.com");
INSERT INTO post (id, title, description, user_email) VALUE (4,'4th blog','This is a desciption from blog 4', "haqh@gmail.com");
INSERT INTO post (id, title, description, user_email) VALUE (5,'5th blog','This is a desciption from blog 5', "haabc@gmail.com");
INSERT INTO post (id, title, description, user_email) VALUE (6,'6th blog','This is a desciption from blog 6', "ha_jp@gmail.com");

# --- !Downs
DROP TABLE post;

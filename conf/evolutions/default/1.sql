# --- !Ups
CREATE TABLE post (
                      id        		int             			NOT NULL 	AUTO_INCREMENT,
                      title     		varchar(255),
                      description  			varchar(250)            NOT NULL ,
                      userId    	int,
                      PRIMARY KEY (id)
);
INSERT INTO post (id, title, description, userId) VALUE (1,'First blog','This is a desciption from blog 1', '1');
INSERT INTO post (id, title, description, userId) VALUE (2,'Second blog','This is a desciption from blog 2', '2');
INSERT INTO post (id, title, description, userId) VALUE (3,'Third blog','This is a desciption from blog 3', '1');
INSERT INTO post (id, title, description, userId) VALUE (4,'4th blog','This is a desciption from blog 4', '2');
INSERT INTO post (id, title, description, userId) VALUE (5,'5th blog','This is a desciption from blog 5', '1');
INSERT INTO post (id, title, description, userId) VALUE (6,'6th blog','This is a desciption from blog 6', '2');

# --- !Downs
DROP TABLE post;

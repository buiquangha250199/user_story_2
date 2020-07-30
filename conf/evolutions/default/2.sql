# --- !Ups
CREATE TABLE posts (
   id BIGINT(20) NOT NULL AUTO_INCREMENT,
   title VARCHAR(255) NOT NULL,
   content TEXT NOT NULL,
   created_at DATETIME NOT NULL DEFAULT NOW(),
   PRIMARY KEY (id));
# --- !Downs
# DROP TABLE posts;

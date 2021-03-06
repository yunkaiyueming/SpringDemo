CREATE TABLE Student(
   ID   INT NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(20) NOT NULL,
   AGE  INT NOT NULL,
   PRIMARY KEY (ID)
);


CREATE TABLE user(
   id   INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   age  INT NOT NULL,
   PRIMARY KEY (id)
);

CREATE TABLE people(
   id   INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   age  INT NOT NULL,
   PRIMARY KEY (id)
);

CREATE TABLE `user2` (
  `uid` tinyint(2) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) DEFAULT NULL,
  `usex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `item` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `itemid` varchar(20) DEFAULT NULL,
  `num` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
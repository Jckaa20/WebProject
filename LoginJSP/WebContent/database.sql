CREATE TABLE datadetail(
id int not null auto_increment,
sname varchar(50),
pass varchar(30),
cpass varchar(30),
email varchar(200),
contact long,
primary key(id)
)

CREATE TABLE issuebook(
id int not null auto_increment,
bname varchar(60),
bauthor varchar(60),
bid integer(100),
sname varchar(60),
sid int(200),
primary key(id)
)

CREATE TABLE returnbook(
id int not null auto_increment,
bname varchar(60),
bauthor varchar(60),
bid integer(100),
sname varchar(60),
sid int(200),
primary key(id)
)
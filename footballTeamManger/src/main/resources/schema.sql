
create table team(
TEAM_ID int auto_increment PRIMARY KEY NOT NULL,
name varchar(225) ,
acronym varchar(100),
budget int
);
create table player(
player_ID int auto_increment PRIMARY KEY,
name varchar(225) ,
position varchar(255),
TEAM_ID int NOT NULL
);
ALTER TABLE player
ADD CONSTRAINT FK_team
FOREIGN KEY (TEAM_ID) REFERENCES team(TEAM_ID);

insert into team(name,acronym,budget) values ('ogc Nice','OGCN',50000000);
insert into player(name,position,TEAM_ID) values ('khéphren Thuram','milieu',1);
--insert into player(name,position,TEAM_ID) values ('terem moffi','attaquant',1);
--insert into player(name,position,TEAM_ID) values ('jean_clair Todibo','defenseur',1);





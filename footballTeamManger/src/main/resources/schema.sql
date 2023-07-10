
create table team(
idTeam int auto_increment PRIMARY KEY NOT NULL,
nameTeam varchar(225) ,
acronym varchar(100),
budget int
);
create table player(
idPlayer int auto_increment PRIMARY KEY,
namePlayer varchar(225) ,
position varchar(255),
TEAM_ID int NOT NULL
);
ALTER TABLE player
ADD CONSTRAINT FK_team
FOREIGN KEY (TEAM_ID) REFERENCES team(idTeam);

insert into team(nameTeam,acronym,budget) values ('ogc Nice','OGCN',50000000);



--insert into player(name,position,TEAM_ID) values ('terem moffi','attaquant',1);
--insert into player(name,position,TEAM_ID) values ('jean_clair Todibo','defenseur',1);





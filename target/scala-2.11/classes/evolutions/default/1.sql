# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table device (
  id                        integer auto_increment not null,
  mac                       varchar(255),
  version                   varchar(255),
  type                      varchar(255),
  constraint pk_device primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table device;

SET FOREIGN_KEY_CHECKS=1;


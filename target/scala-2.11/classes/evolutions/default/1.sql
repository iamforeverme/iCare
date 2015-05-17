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

create table protege (
  id                        integer auto_increment not null,
  name                      varchar(255),
  id_card_num               varchar(255),
  telphone                  varchar(255),
  mobile                    varchar(255),
  contacts_name1            varchar(255),
  contacts_tel1             varchar(255),
  contacts_name2            varchar(255),
  contacts_tel2             varchar(255),
  history                   varchar(255),
  province                  varchar(255),
  city                      varchar(255),
  address                   varchar(255),
  photo_dir                 varchar(255),
  age                       integer,
  monitoring_level          varchar(255),
  constraint uq_protege_id_card_num unique (id_card_num),
  constraint pk_protege primary key (id))
;

create table staff (
  id                        integer auto_increment not null,
  staff_id                  varchar(255),
  name                      varchar(255),
  id_card_num               varchar(255),
  password                  varchar(255),
  gender                    varchar(255),
  age                       integer,
  tel                       varchar(255),
  version                   varchar(255),
  type                      varchar(255),
  constraint pk_staff primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table device;

drop table protege;

drop table staff;

SET FOREIGN_KEY_CHECKS=1;


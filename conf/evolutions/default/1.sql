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

create table monitor_data (
  id                        integer auto_increment not null,
  protege_id                integer,
  signal_type_id            integer,
  rec_time                  datetime,
  constraint pk_monitor_data primary key (id))
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

create table signal_type (
  id                        integer auto_increment not null,
  type                      varchar(255),
  constraint pk_signal_type primary key (id))
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

create table warning_type (
  id                        integer auto_increment not null,
  type                      varchar(255),
  constraint pk_warning_type primary key (id))
;

alter table monitor_data add constraint fk_monitor_data_protege_1 foreign key (protege_id) references protege (id) on delete restrict on update restrict;
create index ix_monitor_data_protege_1 on monitor_data (protege_id);
alter table monitor_data add constraint fk_monitor_data_signalType_2 foreign key (signal_type_id) references signal_type (id) on delete restrict on update restrict;
create index ix_monitor_data_signalType_2 on monitor_data (signal_type_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table device;

drop table monitor_data;

drop table protege;

drop table signal_type;

drop table staff;

drop table warning_type;

SET FOREIGN_KEY_CHECKS=1;


-- create  type  group_type as enum ('FAUNDATION','JAVA',
--                                   'FLUTTER','FRONTEND','C','PYHTON');

-- create  type  group_status as enum ('CANCELED','IN_PROGRESS','FINISHED','PAUSED');

create table "group"
(
    id         uuid primary key,
    name       varchar(50) not null,
    mentor_id  uuid        not null,
    start_date date        not null,
    type       varchar     not null,
    status     varchar     not null
);
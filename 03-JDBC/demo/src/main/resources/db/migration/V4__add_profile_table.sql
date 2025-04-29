create table profiles
(
    id             bigint        null,
    bio            varchar(500),
    phone_number   varchar(15) ,
    date_of_birth  date ,
    loyalty_points int  default 0 ,
    constraint profiles_users_id_fkak
        foreign key (id) references users (id)
);
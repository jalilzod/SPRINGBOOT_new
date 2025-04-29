create table profiles
(
    id             bigint        null,
    bio            varchar(255)  not null,
    phone_number   varchar(255)  not null,
    date_of_birth  varchar(255)  not null,
    loyalty_points int default 0 null,
    constraint profiles_users_id_fk
        foreign key (id) references users (id),
    constraint check_loyalty_points_positive
        check (loyalty_points>=0)
);
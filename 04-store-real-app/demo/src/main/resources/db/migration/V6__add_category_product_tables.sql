create table categories(
    id tinyint primary key auto_increment,
    name varchar(255)
);


create table products(
    id bigint primary key auto_increment,
    name varchar(255),
    price decimal(10,2),
    category_id tinyint,
    foreign key (category_id) references categories(id)
);
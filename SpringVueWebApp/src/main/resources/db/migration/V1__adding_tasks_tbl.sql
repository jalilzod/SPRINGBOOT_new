create table tasks(
   id bigint primary key auto_increment not null,
   title varchar(255) not null,
    description varchar(500) not null ,
    status ENUM('in_progress','completed','new') not null default 'new'

);
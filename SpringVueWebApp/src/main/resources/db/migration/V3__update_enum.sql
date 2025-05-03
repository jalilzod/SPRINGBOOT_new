alter table tasks
    modify status enum ('NEW', 'IN_PROGRESS', 'COMPLETED') default 'NEW' not null;
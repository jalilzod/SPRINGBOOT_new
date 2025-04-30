create table wishlist(
    product_id bigint not null,
    user_id bigint not null,
    constraint pk_wishlist primary key (product_id,user_id)
);
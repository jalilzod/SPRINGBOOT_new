alter table wishlist
    add constraint fk_wishlist_on_product foreign key (product_id) references products(id),
    add constraint fk_wishlist_on_user foreign key (user_id) references users(id);
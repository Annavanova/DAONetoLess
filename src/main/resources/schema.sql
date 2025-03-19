create table CUSTOMERS
(
    id           bigserial,
    name         varchar(255) not null,
    surname      varchar(255) not null,
    age          int          not null default 18,
    phone_number varchar(20),
    primary key (id)
);

create SEQUENCE id_seq OWNED BY CUSTOMERS.id;

create table ORDERS
(
    id           bigserial,
    date        varchar(255) not null,
    customer_id  bigserial    not null,
    product_name    varchar(255) not null,
    amount int,
    primary key (id),
	foreign key (customer_id) references CUSTOMERS (id)
);
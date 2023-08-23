CREATE schema onlinestore;

CREATE table products(
product_id int not null auto_increment,
product_name varchar(255),
primary key(product_id)
);

CREATE table Customers(
customer_id int not null auto_increment,
customer_name varchar(255),
customer_email varchar(255),
customer_phone varchar(255),
primary key(customer_id)
);

CREATE table Orders(
order_id int not null auto_increment,
order_name varchar(255),
primary key(order_id),
foreign key(customer_id)
);
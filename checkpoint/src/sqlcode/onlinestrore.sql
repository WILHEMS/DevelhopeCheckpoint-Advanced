CREATE schema onlinestore;

CREATE table Products(
product_id int not null auto_increment,
product_name varchar(255),
primary key(product_id)
);

CREATE table Customers(
customer_id int not null auto_increment,
customer_name varchar(255),
customer_email varchar(255),
customer_phone varchar(255),
order_id int null,
primary key(customer_id),
foreign key(order_id)  references Orders(order_id)
);

CREATE table Orders(
order_id int not null auto_increment,
customer_id int not null,
product_id int not null,
order_name varchar(255),
primary key(order_id),
foreign key(product_id)  references Products(product_id)
);
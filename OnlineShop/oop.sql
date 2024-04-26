create database shop;
use shop;

-- Roles will be ethier s for seller or c for customer
create table users(
ID INT primary key auto_increment,
First_Name varchar(40) not null,
Last_name varchar(40) not null,
roles char(1) not null,
userName varchar(30) unique not null,
age date not null,
shipping_info text not null
);

alter table users
add constraint rolescons check(roles = 's' or roles = 'c'); 

CREATE TABLE cart (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    total DECIMAL(10, 2) NOT NULL,
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(ID)
);

alter table cart
add constraint totalcons check(total>0.00);

create table orders(
ID int primary key auto_increment,
price decimal(10,2) not null,
odate date default(CURRENT_TIMESTAMP),
user_id int not null,
foreign key (user_id) references users(ID)
);

alter table orders
add constraint opricecons check(price>0.00);

create table product(
ID int primary key,
p_name varchar(70) not null,
price decimal(10,2) not null,
Manfacturer varchar(50),
seller int not null,
foreign key(seller) references users(ID)
);

alter table product
add constraint ppricecons check(price>0.00);

-- many to many
create table cart_products(
ID int primary key auto_increment,
cart int,
product int,
foreign key(cart) references cart(ID),
foreign key(product) references product(ID)
);

alter table product
modify ID int auto_increment;

-- many to many
create table Order_Product(
order_id int not null,
product int not null,
foreign key (product) references product(ID),
foreign key(order_id) references orders(ID)
);


alter table users 
add column password text not null;


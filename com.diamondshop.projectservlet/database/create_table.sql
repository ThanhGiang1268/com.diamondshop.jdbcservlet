use jdbcservlet;
create table user(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    username varchar(150) NOT NULL,
    password varchar(150) NOT NULL,
    fullname varchar(150) null,
    status int not null,
    roleid bigint not null,
    createddate TIMESTAMP NULL,
    modifieddate TIMESTAMP NULL,
    createdby VARCHAR(255) null,
    modifiedby varchar(255) null
);

CREATE TABLE role(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    name varchar(255) NOT NULL,
    code varchar(255) NOT NULL,
    createddate TIMESTAMP NULL,
    modifieddate TIMESTAMP NULL,
    createdby VARCHAR(255) null,
    modifiedby varchar(255) null
);

alter table user add constraint fk_user_role foreign key (roleid) references role(id);

create table category (
	id bigint not null primary key auto_increment,
    name varchar(150) not null,
    code varchar(150) not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null,
    idproducts bigint not null
);

create table products (
	id bigint not null primary key auto_increment,
    sizes varchar(150)  not null,
    name varchar(150) not null,
    price double not null,
    sale int null,
    title varchar(150) null,
    highlight int null,
    newproduct int null,
    description text not null,
    idcolor bigint not null
);

alter table category add constraint fk_category_products foreign key (idproducts) references products(id);

create table color (
	id bigint not null primary key auto_increment,
	code varchar(150) not null,
    img blob null
);

alter table products add constraint fk_products_color foreign key (idcolor) references color(id);

    
create table slide (
	id bigint not null primary key auto_increment,
	img blob not null,
    caption varchar(150) null,
    content varchar(150) null
);
use jdbcservlet;

insert into role(code,name) values('ADMIN','ADMIN');
insert into role(code,name) values('USER','USER');

insert into user(username,password,fullname,status, roleid) values('admin','1234','admin',1,1);
insert into user(username,password,fullname,status, roleid) values('nguyenvana','1234','nguyen van a',1,2);
insert into user(username,password,fullname,status, roleid) values('nguyenvanb','1234','nguyen van b',1,2);

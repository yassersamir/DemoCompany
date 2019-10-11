create database companyDemo;
create table employee (
id int not null ,
name varchar(255) not null ,
email varchar(255) not null ,
phone varchar(255) not null ,
 PRIMARY KEY (id));
create table department (
id int not null ,
name varchar(255) not null ,
 PRIMARY KEY (id));
ALTER TABLE employee ADD dept_id int ;
ALTER TABLE employee
ADD CONSTRAINT FK_empdept
FOREIGN KEY (dept_id) REFERENCES department(id);
insert into department (id,name) values (1,'computer science') ,(2,'math'),(3,'it');
insert into employee (id,name,email,phone ,dept_id) 
values ( 4 , 'hamed' , 'hamed@email.com' , '01234567ff89', 1 ),
	   ( 5 , 'hassan' , 'hassan@email.com' , '012f345895489', 2 ),
	   ( 6 , 'omar' , 'omar@email.com' , '015f523456789', 2 );
insert into employee (id,name,email,phone ,dept_id) 
values ( 1, 'ahmed' , 'ahmed@email.com' , '0123456789', 3 ),
	   ( 2 , 'mohammed' , 'mohammed@email.com' , '012345895489', 3),
	   ( 3 , 'ali' , 'ali@email.com' , '015523456789', 1 );
insert into department (id ,name) values (4 ,'is');

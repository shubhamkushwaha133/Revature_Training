use demo_revature;
create table student(
     id int primary key,
     name varchar(20)
     );
     
     -- rename table demo1 to student;
     
	 insert into student (id,name) values (1,"shubham"),(2,"shashank"),(3,"harsh"),(4,"deepak");
	 select * from student;
     
     update student set name="anuj" where id=4;
     select name from student where id=4;
     
     alter table student add column age int not null default 18;
     alter table student add column  degree varchar(20) not null default 'b.tech';
     select * from student;
     update student set age=20 where id=1;
     select * from student;
     insert into student (id,name,age,degree) values (5,'pankaj',23,'b.com');
     select * from student; 
     alter table student add column mobileNo varchar(15) unique;
     select * from student;
     insert into student (id,name,age,degree,mobileNo) values (6,'ranuj',22,'b.sc','9788997739');
     
     
     
      -- set sql_safe_updates=0;
	  -- delete  from student;
	  --  set sql_safe_updates=1;
        



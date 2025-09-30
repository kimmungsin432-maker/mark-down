## add
https://github.com/kimmungsin432-maker/mark-down/blob/main/%EB%AA%A8%EB%93%A0%20%EC%B1%95%ED%84%B0%20%ED%82%A4%EC%9B%8C%EB%93%9C/02-1.md


docker run -d `
  --name mysql-container `
  -e MYSQL_ROOT_PASSWORD=123456 `
  -p 23306:3306 `
  mysql:8.0


GRANT ALL PRIVILEGES ON mysql.* TO 'testuser'@'%';

database 예시
-- update product set product_id = concat('A00',dummy)
-- where product_id like concat('A00',dummy)

-- limit 1;

-- select product_id,concat('A00',dummy)
-- from product
-- where  concat('A00',dummy) = 'A002'

-- update product set dummy = dummy + 100

-- select * from product

-- insert into (product_id,product_name)
-- values('A003','벤츠 자동차')

DELIMITER$$
create trigger tr_product_ins
after insert on product
FOR EACH ROW
begin

update product
set product_name = '종이배'
where product_name like '%드론배'
end $$
DELIMITER;

INSER IN product (product_id,product_name)
valuse ('2997','품질 좋은 드론 팝니다.');

insert into product (product_id)
values ('학생')


create trigger tr_ins_productalter 
begin
	insert product...
end

SHOW Triggers like 'produst';

drop TRUGGER tr_product_ins

create database zoo;
use zoo;
create table eagle(ete varchar(200));
show tables;
select *  from eagle;
insert into eagle(eye) values('독수리눈');
delete from eagle;
drop table eagle;
drop database zoo;
show databases;

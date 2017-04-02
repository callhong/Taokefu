create table tag
(
	tid number primary key,
	tname varchar2(100) not null,
	tcount number check(tcount > 0)
);

create table favorite(
	fid number primary key,
	flabel varchar2(100) not null,
	furl varchar2(255) not null,
	ftags varchar2(100),
	fdesc varchar2(1024)
);

insert into tag
select 1, 'java', 2 from dual union
select 2, 'struts', 1 from dual union
select 3, 'oracle', 1 from dual ;

insert into tag values(seq_tag.nextval,'搜索引擎',3)
insert into tag values(seq_tag.nextval,'客服',1)

insert into favorite 
select 1, 'Apache Struts', 'http://struts.apache.org', 'java,struts', 'struts官方网站' from dual union
select 2, 'Oracle', 'http://www.oracle.com', 'java,oracle', 'oracle官方网站' from dual;

create sequence seq_favorite start with 3;
create sequence seq_tag start with 4;

select * from tag;
select * from favorite;

insert into FAVORITE values(seq_favorite.nextval,'Tencent','http://www.tencent.com','hhbhb','腾讯')
insert into FAVORITE values(seq_favorite.nextval,'XWKJ','http://virtualnet.com.cn',null,'虚网')
insert into FAVORITE values(seq_favorite.nextval,'淘客服','http://taokefu.com','客服,招聘','专业客服招聘')
insert into FAVORITE values(seq_favorite.nextval,'Baidu','http://www.baidu.com','搜索引擎','百度-最大的中文搜索引擎')
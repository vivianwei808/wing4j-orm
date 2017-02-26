����һ��markdown�ļ�����ʾ����
```wing4j configure
--��������
--@dialect=mySQL
--�����ռ�
--@namespace=org.wing4j.orm
```
#[��ѯ�û���Ϣ](selectDemo)#

����һ��markdown�ļ�����ʾ����
```wing4j param
--ǿ��ˢ�»���
--@flushCacheRequired=true
--ʹ�û���ر�
--@useCache=false
--��ȡ��¼��С
--@fetchSize=1
--��ʱʱ��
--@timeout=1000
--@paramEntity=org.wing4j.orm.markdown.ParamEntity//����ʵ��
--@resultEntity=org.wing4j.orm.markdown.ResultEntity//���ʵ��
```
```sql
select * 
from tb_demo_wing4j_inf t
where t.col1=#{col2:VRACHAR}
/*#     if col2 == null                  */
and col2=#{col2:VRACHAR}
/*#     fi                               */
/*#     if col3 is not null              */
and col3=#{col2:NUMBER}
/*#     fi                               */
```

[��������](insert)
================================
```wing4j param
--@paramEntity=org.wing4j.orm.markdown.ParamEntity//����ʵ��
```
```sql
insert into table1(col1, col2, col3)
values('col1', 'col2', 3)
```

[�����û�ID��������](updateById)
================================
```wing4j param
--@paramEntity=org.wing4j.orm.markdown.ParamEntity//����ʵ��
```
```sql
update table t
set t.col1 = #{col2:VRACHAR}
where t.col1='col1'
/*#     if col2 is not null              */
and col2=#{col2:VRACHAR}
/*#     fi                               */
/*#     if col3 is not null              */
and col3=#{col3:NUMBER}
/*#     fi                               */
```


[�����û�IDɾ������](deleteById)
================================
```wing4j param
--@paramEntity=org.wing4j.orm.markdown.ParamEntity//����ʵ��
```
```sql
delete from table t
where t.col1='col1'
/*#     if col2 is not null              */
and col2=#{col2:VRACHAR}
/*#     fi                               */
/*#     if col3 is not null              */
and col3=#{col3:NUMBER}
/*#     fi                               */
```
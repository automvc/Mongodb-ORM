
MongoDB ORM(Bee)
=========
## 此工程为MongoDB ORM的Exam工程. 
**Mongodb ORM** 是Bee提供众多ORM功能的一部分;  
**Bee** 是一个简单，易用，功能强大，开发速度快，编码少的 JAVA ORM 框架。  

Bee，互联网新时代的Java ORM框架,  
同时支持JDBC(比如JavaWeb),Android和Harmony;  
支持Sharding分片;  
支持多种关系型数据库(MySQL,MariaDB,Oracle,H2,SQLite,PostgreSQL,SQL Server,Access,金仓,达梦等),  
还支持NoSQL的Cassandra,Mongodb等.  

### V2.1 Mongodb ORM主要功能
面向对象Sharding分片
批量插入分片  
广播表批量插入所有库  
分片键分片支持的运算符  
=,in,between;其中in支持Number,List,Set  
    注意不参与分片:not in, not between,>=,<=  
使用MongodbRawSql接口可直接执行原生语句(Mongodb shell命令)  
事务  
创建索引,删除索引  
支持查询嵌入式文档  
地理信息插入、查询  

#### [MongoDB ORM(Bee)详细功能列表](MongodbORM-Function-List.md) 


Bee最新版本: V2.1 (2023-05)  
**Bee** 网址:  
https://github.com/automvc/bee  
或者:  
https://gitee.com/automvc/bee  

#### Bee与Spring boot整合:  
**[查看 bee-spring-boot](../../../bee-springboot)**  
**[查看 bee-spring-boot-starter](../../../bee-spring-boot-starter)** 


快速开始:
=========	
## 1 单个测试用例运行 
*  1).在bee.properties配置数据源: 
     bee.db.url = mongodb://localhost:27017/bee/
     bee.db.username = 
     bee.db.password = 
*  2).选择src/test/java-->org.teasoft.exam包中的某一个类-->(right click)Coverage As-->JUnit Test   

## 2 整个工程个测试用例运行 
Test Coverage: select src/test/java-->org.teasoft.exam.mongodb->(right click)Coverage As-->JUnit Test   

联系与欢迎:
=========	
#### 作者的电子邮箱email:    honeysoft@126.com  
#### 如有任何相关建议,欢迎给作者发邮件,不胜感激!  
#### 更多设计思想,请关注微信公众号: 软件设计活跃区  

#### 为了能及时解答大家的疑问，可以加入Bee的技术QQ群：992650213

#### 同时,也欢迎你加入到Bee框架的开发之中,相信有你的加入,Bee会更加美好! 
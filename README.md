# 品牌服装商店实现 v1.0


# 2016.05.21
  * 服装字段
  ```
      private Integer id;
      private String name;
      private String image;
      private float price;
      private Integer cateId;
      
  ```

# 2016.05.19
 * 初始化 品牌服装商店功能：
 * 完成数据库设计与项目构建；

# 数据库设计
  * 用户表 (user) ： id ，姓名（name）,头像（head）
  * 分类表（cate）  ： id , 分类内容(content)
  * 服装表（clothes） ： id , 名称（name） , 价格（price）,图片（image）,cateId
  * 尺寸表（sizes）  ： id , 尺寸（size） , 数量（count）, clothesId
  * 评论表 (comment) ： id , 内容（content),评论时间(dt),userId,clothesId
  
  ```
    create table cate(
            id int(11) not null primary key auto_increment,
            content varchar(100) not null
          )DEFAULT CHARSET=utf8
  
    create table clothes(
         id int(11) not null primary key auto_increment,
         name varchar(100) not null,
         image varchar(100) not null,
         price float not null default '0',
         cateId int(11)
       )DEFAULT CHARSET=utf8
       
    create table sizes(
          id int(11) not null primary key auto_increment,
          size int(11) not null,
          count int(11) not null default '0',
          clothesId int(11)
        )DEFAULT CHARSET=utf8     
  
  ```

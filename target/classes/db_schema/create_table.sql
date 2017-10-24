create table icode_user(
        id int primary key auto_increment,
        username varchar(40),
        password varchar(120),
        insert_time_for_his TIMESTAMP DEFAULT CURRENT_TIMESTAMP  ,--插入数据库时，保存当前时间。更新操作不变
        update_time_for_his TIMESTAMP ON UPDATE CURRENT_TIMESTAMP--在创建新记录的时候把这个字段设置为0，以后修改时刷新它
);

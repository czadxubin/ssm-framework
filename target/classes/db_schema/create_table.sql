create table icode_user(
        id int primary key auto_increment,
        username varchar(40),
        password varchar(120),
        insert_time_for_his TIMESTAMP DEFAULT CURRENT_TIMESTAMP  ,--�������ݿ�ʱ�����浱ǰʱ�䡣���²�������
        update_time_for_his TIMESTAMP ON UPDATE CURRENT_TIMESTAMP--�ڴ����¼�¼��ʱ�������ֶ�����Ϊ0���Ժ��޸�ʱˢ����
);

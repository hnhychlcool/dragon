DROP TABLE IF EXISTS `school`;
CREATE TABLE school (
`id` BIGINT NOT NULL AUTO_INCREMENT,
`name` varchar(100) NOT NULL COMMENT '学校名称',
`enrollment_year` int NOT NULL COMMENT '入学年份',
`graduation_year` int NOT NULL COMMENT '毕业年份',
`type` int  COMMENT '学校阶段:0-大学 1-大专 2-高中 3-中专 4-初中 5-小学',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='学校信息表';
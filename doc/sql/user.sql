DROP TABLE IF EXISTS `user`;
CREATE TABLE user (
`id` BIGINT NOT NULL AUTO_INCREMENT,
`name` varchar(100) NOT NULL COMMENT '姓名',
`password` varchar(100) NOT NULL COMMENT '密码',
`phone` varchar(50) NOT NULL COMMENT '手机',
`email` varchar(60) DEFAULT NULL COMMENT '邮箱',
`age` int  COMMENT '年龄',
`sex` TINYINT(1)  COMMENT '性别:0 男, 1 女',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';
DROP TABLE IF EXISTS `user_picture`;
CREATE TABLE user_picture (
`id` BIGINT NOT NULL AUTO_INCREMENT,
`user_id` BIGINT NOT NULL COMMENT '用户id',
`user_picture_group_id` BIGINT NOT NULL COMMENT '用户相册组id',
`phone` varchar(50) NOT NULL COMMENT '手机',
`email` varchar(60) DEFAULT NULL COMMENT '邮箱',
`age` int  COMMENT '年龄',
`sex` TINYINT(1)  COMMENT '性别:0 男, 1 女',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户相册表';
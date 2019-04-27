DROP TABLE IF EXISTS `user_picture_group`;
CREATE TABLE user_picture_group (
`id` BIGINT NOT NULL AUTO_INCREMENT,
`name` varchar(100) NOT NULL COMMENT '相册组名称',
`email` varchar(60) DEFAULT NULL COMMENT '邮箱',
`count` int COMMENT '分组内照片数量',
`share_type` int  COMMENT '相册开放类型:0 对所有人开放,1:仅对自己开放,2:对所有人开放',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户相册组表';
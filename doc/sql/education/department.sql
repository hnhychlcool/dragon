DROP TABLE IF EXISTS `department`;
CREATE TABLE department (
`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
`school_id` INT UNSIGNED NOT NULL COMMENT  '所属学校id',
`name` varchar(100) NOT NULL COMMENT '院系名称',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='学校院系信息表';
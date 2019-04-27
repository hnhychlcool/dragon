CREATE TABLE interesting_group (
`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
`school_id` INT UNSIGNED NOT NULL COMMENT '学校id',
`name` VARCHAR(100) COMMENT '小组名称',
`icon` VARCHAR(100) COMMENT '小组logo标签',
`title` VARCHAR(100) COMMENT '小组标签',
`group_desc` VARCHAR(10240) COMMENT '小组简介',
`group_category` int UNIQUE COMMENT '小组分类',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='兴趣组基本信息表';

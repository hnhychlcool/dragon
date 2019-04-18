CREATE TABLE interesting_group (
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`school_id` bigint(20) unsigned NOT NULL COMMENT '学校id',
`name` VARCHAR(100) COMMENT '小组名称',
`title` VARCHAR(100) COMMENT '小组标签',
`desc` VARCHAR(10240) COMMENT '小组简介',
`desc` VARCHAR(10240) COMMENT '小组简介',
 PRIMARY KEY (`id`),
 INDEX idx_key_1 (`key_1`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='兴趣组';

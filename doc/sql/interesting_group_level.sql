DROP TABLE IF EXISTS `interesting_group_level`;
CREATE TABLE interesting_group_level (
 `id` BIGINT NOT NULL AUTO_INCREMENT,
 `level_seq` int NOT NULL COMMENT '等级序号',
 `name` VARCHAR(100) NOT NULL COMMENT  '等级名称',
 `touch_count` int COMMENT '等级所需积分',
 `icon` VARCHAR(100) COMMENT '等级icon url',
 `create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
 `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='兴趣小组级别表';
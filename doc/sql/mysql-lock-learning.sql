CREATE TABLE gap_lock_test (
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`key_1` int (10) unsigned COMMENT '带此标签的评论id',
`key_2` int (10) unsigned COMMENT '标签数量',
 PRIMARY KEY (`id`),
 INDEX idx_key_1 (`key_1`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='间隙锁测试表';

DROP TABLE IF EXISTS `department`;
CREATE TABLE interesting_group_member_ref (
 `id` BIGINT NOT NULL AUTO_INCREMENT,
 `group_id` BIGINT NOT NULL COMMENT  '兴趣组id',
 `user_id` BIGINT NOT NULL COMMENT '用户id',
 `level_id` BIGINT DEFAULT 0 COMMENT '成员兴趣组级别id',
 `create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
 `update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='兴趣小组成员关系表';
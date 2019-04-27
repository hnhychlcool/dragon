CREATE TABLE topic_content (
  `id` INT UNSIGNED  NOT NULL AUTO_INCREMENT,
  `topic_id` INT UNSIGNED NOT NULL COMMENT '所属话题id',
  `user_id` INT UNSIGNED NOT NULL COMMENT '内容发起人id',
  `topic_content` TEXT COMMENT 'topic内容',
  `good_count` int  COMMENT '点赞人数',
  `bad_count` int  COMMENT '点差人数',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='话题内容表';

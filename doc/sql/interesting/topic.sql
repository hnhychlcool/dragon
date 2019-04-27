CREATE TABLE topic (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `group_id` INT UNSIGNED NOT NULL COMMENT '兴趣小组id',
  `user_id` INT UNSIGNED NOT NULL COMMENT '话题发起人id',
  `name` VARCHAR(100) COMMENT 'topic名称',
  `short_tips` VARCHAR(100) COMMENT '小组名称前的短分类介绍',
  `group_desc` VARCHAR(10240) COMMENT '小组简介',
  `group_category` int COMMENT '小组分类',
  `visit_count` int  COMMENT '话题访问人数',
  `message_count` int  COMMENT '话题留言讨论人数',
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='话题表';

参考
http://xiaozu.renren.com/xiaozu/214788/thread?wc=threadList

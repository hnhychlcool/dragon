
// 商家评论信息
CREATE TABLE vendor_comment {
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`vendor_id` bigint(20) unsigned NOT NULL COMMENT '评论所属商家id',
`one_star_comment_count` int (10) unsigned COMMENT '一星评论数量',
`two_star_comment_count` int (10) unsigned COMMENT '二星评论数量',
`three_star_comment_count` int (10) unsigned COMMENT '三星评论数量',
`four_star_comment_count` int (10) unsigned COMMENT '四星评论数量',
`five_star_comment_count` int (10) unsigned COMMENT '五星评论数量',
`total_comment_goal` FLOAT (5,2) COMMENT '总评分',
`comment_content` VARCHAR (300) COMMENT '评论内容',
`vendor_reply_content` VARCHAR (300) COMMENT '商家回复内容',
`comment_pictures` VARCHAR (300) COMMENT '评论图片地址',
`create_time` datetime DEFAULT NULL,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`),
 UNIQUE KEY `uk_vendor_id` ('vendor_id')
}

// 用户评论标签信息
CREATE TABLE user_label {
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`comment_id` int (10) unsigned COMMENT '带此标签的评论id',
`label_count` int (10) unsigned COMMENT '标签数量',
`label_content` VARCHAR (50) COMMENT '标签内容',

`create_time` datetime DEFAULT NULL,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
}



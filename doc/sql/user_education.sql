DROP TABLE IF EXISTS `user_education`;
CREATE TABLE user_education (
`id` BIGINT NOT NULL AUTO_INCREMENT,
`u_school_id` int COMMENT '大学学校id',
`h_school_id` int COMMENT '高中学校id',
`m_school_id` int COMMENT '中学学校id',
`p_school_id` int COMMENT '小学学校id',
`create_time` timestamp DEFAULT CURRENT_TIMESTAMP,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`),
 INDEX `idx_school_id`(`school_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户教育信息表';
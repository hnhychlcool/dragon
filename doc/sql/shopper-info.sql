
CREATE TABLE shopper_basic_detail (
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`city_id` int(10) unsigned NOT NULL COMMENT '商家所处城市id',
`shopper_title` VARCHAR (50) NOT NULL COMMENT '商家店铺招牌',
`shopper_desc` VARCHAR (100) COMMENT '商家描述',
`shopper_tips` VARCHAR (100) COMMENT '商家服务简介',
`store_price` DECIMAL (10, 2) NOT NULL COMMENT '门店价格',
`favorable_price` DECIMAL (10, 2) NOT NULL COMMENT '优惠价格',
`sold_count` int(10) unsigned COMMENT '已售数量',
`comment_id` bigint(20) COMMENT '评论id',
`latitude` DECIMAL (10, 2) COMMENT '经度',
`longtitude` DECIMAL (10, 2) COMMENT '纬度',
`create_time` datetime DEFAULT NULL,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='商家信息表';


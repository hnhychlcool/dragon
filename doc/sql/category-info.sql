/**
*商品一级分类
 */
CREATE TABLE sku_category (
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`category_name` varchar(100) DEFAULT NULL COMMENT '分类名称',
`create_time` datetime DEFAULT NULL,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='商品分类信息表';

// 商品具体分类
CREATE TABLE sku_detail_category (
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`category_id` varchar(100) DEFAULT NULL COMMENT '明细分类所属上级分类key',
`detail_category_name` varchar(100) DEFAULT NULL COMMENT '具体分类名称',
`create_time` datetime DEFAULT NULL,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='商品详情信息表';
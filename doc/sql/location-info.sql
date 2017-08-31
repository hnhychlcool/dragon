
// 商圈信息
CREATE TABLE trading_area {
`id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
`trading_area_pingyin` varchar(100) DEFAULT NULL COMMENT '商圈名称拼音',
`trading_area_name` varchar(100) DEFAULT NULL COMMENT '商圈名称拼音',
`category_name` varchar(100) DEFAULT NULL COMMENT '分类名称',
`latitude` DECIMAL (10, 2) COMMENT '经度',
`longtitude` DECIMAL (10, 2) COMMENT '纬度',
`create_time` datetime DEFAULT NULL,
`update_time` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
}
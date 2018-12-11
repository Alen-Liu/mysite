
DROP TABLE IF EXISTS `t_logger_infos`;
CREATE TABLE `t_logger_infos` (
  `ali_id` int(11) NOT NULL AUTO_INCREMENT,
  `ali_client_ip` varchar(30) DEFAULT NULL COMMENT '客户端请求IP地址',
  `ali_uri` varchar(100) DEFAULT NULL COMMENT '日志请求地址',
  `ali_type` varchar(50) DEFAULT NULL COMMENT '终端请求方式,普通请求,ajax请求',
  `ali_method` varchar(10) DEFAULT NULL COMMENT '请求方式method,post,get等',
  `ali_param_data` longtext COMMENT '请求参数内容,json',
  `ali_session_id` varchar(100) DEFAULT NULL COMMENT '请求接口唯一session标识',
  `ali_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '请求时间',
  `ali_returm_time` varchar(50) DEFAULT NULL COMMENT '接口返回时间',
  `ali_return_data` longtext COMMENT '接口返回数据json',
  `ali_http_status_code` varchar(10) DEFAULT NULL COMMENT '请求时httpStatusCode代码，如：200,400,404等',
  `ali_time_consuming` int(8) DEFAULT '0' COMMENT '请求耗时（毫秒单位）',
  PRIMARY KEY (`ali_id`)
) ENGINE=InnoDB AUTO_INCREMENT=106119 DEFAULT CHARSET=utf8 COMMENT='请求日志信息表';



DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users` (
  `uid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `homeUrl` varchar(200) DEFAULT NULL,
  `screenName` varchar(32) DEFAULT NULL,
  `created` int(10) unsigned DEFAULT '0',
  `activated` int(10) unsigned DEFAULT '0',
  `logged` int(10) unsigned DEFAULT '0',
  `groupName` varchar(16) DEFAULT 'visitor',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `name` (`username`),
  UNIQUE KEY `mail` (`email`)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8 COMMENT='用户信息表';

-- ----------------------------
--  Records of `t_users`
-- ----------------------------
BEGIN;
INSERT INTO `t_users` VALUES ('1', 'admin', 'a66abb5684c45962d887564f08346e8d', 'xxxx.qq.com', null, 'admin', '1490756162', '0', '0', 'visitor');
COMMIT;



DROP TABLE IF EXISTS `t_contents`;
CREATE TABLE `t_contents` (
  `cid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `titlePic` varchar(55) DEFAULT NULL,
  `slug` varchar(200) DEFAULT NULL,
  `created` int(10) unsigned DEFAULT '0',
  `modified` int(10) unsigned DEFAULT '0',
  `content` text COMMENT '内容文字',
  `authorId` int(10) unsigned DEFAULT '0',
  `type` varchar(16) DEFAULT 'post',
  `status` varchar(16) DEFAULT 'publish',
  `tags` varchar(200) DEFAULT NULL,
  `categories` varchar(200) DEFAULT NULL,
  `hits` int(10) unsigned DEFAULT '0',
  `commentsNum` int(10) unsigned DEFAULT '0',
  `allowComment` tinyint(1) DEFAULT '1',
  `allowPing` tinyint(1) DEFAULT '1',
  `allowFeed` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`cid`),
  UNIQUE KEY `slug` (`slug`),
  KEY `created` (`created`)
) ENGINE=InnoDB DEFAULT CHARACTER SET utf8 COMMENT='文章内容';
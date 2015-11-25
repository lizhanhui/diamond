CREATE TABLE `config_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `data_id` varchar(255) NOT NULL,
  `group_id` varchar(255) NOT NULL,
  `content` mediumtext,
  `md5` varchar(100) DEFAULT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `data_grp_idx` (`data_id`,`group_id`),
  KEY `grp_idx` (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
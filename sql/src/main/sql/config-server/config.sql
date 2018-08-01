use config_db;

CREATE TABLE IF NOT EXISTS `properties` (
  `id` INT(11) NOT NULL,
  `key` VARCHAR(50) NOT NULL,
  `value` VARCHAR(500) NOT NULL,
  `application` VARCHAR(50) NOT NULL COMMENT '应用名称',
  `profile` VARCHAR(50) NOT NULL COMMENT '应用模块',
  `label` VARCHAR(50) NOT NULL COMMENT '应用环境',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO properties VALUES(1, 'key1', 'value1', 'config-server', 'dev', 'master');
INSERT INTO properties VALUES(2, 'test-key1', 'test-value1', 'config-server', 'test', 'master');
INSERT INTO properties VALUES(3, 'key1', 'value1', 'user-service', 'dev', 'master');
INSERT INTO properties VALUES(4, 'test-key1', 'test-value1', 'user-service', 'test', 'master');
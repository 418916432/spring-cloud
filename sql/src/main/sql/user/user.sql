use user_db;

CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(11) NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(100) NOT NULL ,
  `mobile` VARCHAR(50) NOT NULL COMMENT ''用户手机号'',
  `created_at` DATE NOT NULL,
  `updated_at` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES(1, 'admin', 'admin', '110', current_time, current_time);
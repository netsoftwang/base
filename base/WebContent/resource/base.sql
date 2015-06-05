DROP TABLE if EXISTS `tree`
create TABLE `tree`(
`id` LONG NOT NULL auto_increment,
`parentId` Long NOT NULL COMMENT '',
`entId` LONG NOT NULL COMMENT '',
`label` VARCHAR(32) COMMENT'',
`type` TINYINT NOT NULL DEFAULT 0 COMMENT'',
`name` VARCHAR(32) COMMENT '',
`icon` VARCHAR(32) COMMENT '',
`action` VARCHAR(32) COMMENT'',
`url` VARCHAR(255) COMMENT'',
`left` INT COMMENT'',
`right` INT COMMENT '',
PRIMARY KEY id 
)

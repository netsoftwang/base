DROP TABLE IF EXISTS seeds.cusField;
CREATE TABLE seeds.cusField(
id  BIGINT UNSIGNED NOT NULL auto_increment COMMENT '主键id',
entId BIGINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '改字段所属企业',
name VARCHAR(32) NOT NULL COMMENT '字段在列中显示的中文名称',
field VARCHAR(32) NOT NULL COMMENT '在数据库中保存的字段名称',
type VARCHAR (32) NOT NULL DEFAULT 'strType' COMMENT '字段类型',
tableName VARCHAR(32) NOT NULL COMMENT '表名称',
viewNum TINYINT  DEFAULT 0 COMMENT '该字段在列表中显示的顺序',
status TINYINT DEFAULT 0 COMMENT '字段的状态，0：再用，1：关闭，',
isShow  TINYINT DEFAULT 1 COMMENT '是否在列表中显示',
width TINYINT  DEFAULT 0 COMMENT '改字段在列表中显示的宽度',
isUse TINYINT DEFAULT 1 COMMENT '是否在用',
isSearch TINYINT DEFAULT 0 COMMENT '该字段是否用于搜索,0：关闭，1：启用',
searchGroupId BIGINT UNSIGNED DEFAULT 0 COMMENT '如果该字段可以用来搜索，且属于一个搜索组，则字段表示搜索组id',
isMutiValSerch TINYINT DEFAULT 0 COMMENT '是否开启多值搜索，即搜索时是否出入多个值,如果开启有三个值，则参数形式 field1="val1",field2="val2",0：关闭，1：启用',
regexpForm VARCHAR(125) DEFAULT '' COMMENT '改字段的正则表达式',
viewNumForm TINYINT DEFAULT 0 COMMENT '该字段在编辑框中显示的顺序',
isShowForm TINYINT DEFAULT 1 COMMENT '是否在表单中显示0：关闭，1：开启',
isEditForm TINYINT DEFAULT 1 COMMENT '在表单中是否可以编辑0:关闭，1：开启',
formTypeForm VARCHAR(32) DEFAULT 'text' COMMENT '表单类型',
groupIdFormId	BIGINT UNSIGNED DEFAULT 0 COMMENT '在表单中如果进行分组的话，表示本字段所属的组',
optionKV VARCHAR(32) DEFAULT '' COMMENT '如果该字段是下拉列表，则改列代表下拉列表中的值,参数形式为：key1:val1,key2:val2',
theClass  VARCHAR(32) DEFAULT '' COMMENT '显示的样式',
funcs VARCHAR(32) DEFAULT '' COMMENT '该字段的函数处理',
action VARCHAR(64) DEFAULT '' COMMENT '权限控制代码',
createTime int DEFAULT 0 COMMENT '创建时间',
PRIMARY KEY (id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 auto_increment=1;



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

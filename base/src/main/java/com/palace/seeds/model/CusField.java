package com.palace.seeds.model;

/*id  BIGINT UNSIGNED NOT NULL auto_increment COMMENT '����id',
entId BIGINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '���ֶ�������ҵ',
name VARCHAR(32) NOT NULL COMMENT '�ֶ���������ʾ����������',
field VARCHAR(32) NOT NULL COMMENT '�����ݿ��б�����ֶ�����',
type VARCHAR (32) NOT NULL DEFAULT 'strType' COMMENT '�ֶ�����',
viewNum TINYINT  DEFAULT 0 COMMENT '���ֶ����б�����ʾ��˳��',
isShow  TINYINT DEFAULT 1 COMMENT '�Ƿ����б�����ʾ',
width TINYINT  DEFAULT 0 COMMENT '���ֶ����б�����ʾ�Ŀ��',
isSearch TINYINT DEFAULT 0 COMMENT '���ֶ��Ƿ���������,0���رգ�1������',
searchGroupId BIGINT UNSIGNED DEFAULT 0 COMMENT '������ֶο�������������������һ�������飬���ֶα�ʾ������id',
isMutiValSerch TINYINT DEFAULT 0 COMMENT '�Ƿ�����ֵ������������ʱ�Ƿ������ֵ,�������������ֵ���������ʽ field1="val1",field2="val2",0���رգ�1������',
regexpForm VARCHAR(125) DEFAULT '' COMMENT '���ֶε�������ʽ',
viewNumForm TINYINT DEFAULT 0 COMMENT '���ֶ��ڱ༭������ʾ��˳��',
isShowForm TINYINT DEFAULT 1 COMMENT '�Ƿ��ڱ�����ʾ0���رգ�1������',
isEditForm TINYINT DEFAULT 1 COMMENT '�ڱ����Ƿ���Ա༭0:�رգ�1������',
formTypeForm VARCHAR(32) DEFAULT 'text' COMMENT '������',
groupIdFormId	BIGINT UNSIGNED DEFAULT 0 COMMENT '�ڱ���������з���Ļ�����ʾ���ֶ���������',
optionKV VARCHAR(32) DEFAULT '' COMMENT '������ֶ��������б�����д��������б��е�ֵ,������ʽΪ��key1:val1,key2:val2',
theClass  VARCHAR(32) DEFAULT '' COMMENT '��ʾ����ʽ',
funcs VARCHAR(32) DEFAULT '' COMMENT '���ֶεĺ�������',
action VARCHAR(64) DEFAULT '' COMMENT 'Ȩ�޿��ƴ���',
PRIMARY KEY (id)*/
public class CusField {

	private Long id;
	private Long entId;
	private String name;
	private String field;
	private String type;
	private Integer viewNum;
	private Integer isUse;
	private Integer isShow;
	private Integer width;
	private Integer isSearch;
	private Long searchGroupId;
	private Integer isMutiValSerch;
	private String regexpForm;
	private Integer viewNumForm;
	private Integer isShowForm;
	private Integer isEditForm;
	private String formTypeForm;
	private Long groupIdFormId;
	private String optionKV;
	private String  theClass;
	private String funcs;
	private String action;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEntId() {
		return entId;
	}
	public void setEntId(Long entId) {
		this.entId = entId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getViewNum() {
		return viewNum;
	}
	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getIsSearch() {
		return isSearch;
	}
	public void setIsSearch(Integer isSearch) {
		this.isSearch = isSearch;
	}
	public Long getSearchGroupId() {
		return searchGroupId;
	}
	public void setSearchGroupId(Long searchGroupId) {
		this.searchGroupId = searchGroupId;
	}
	public Integer getIsMutiValSerch() {
		return isMutiValSerch;
	}
	public void setIsMutiValSerch(Integer isMutiValSerch) {
		this.isMutiValSerch = isMutiValSerch;
	}
	public String getRegexpForm() {
		return regexpForm;
	}
	public void setRegexpForm(String regexpForm) {
		this.regexpForm = regexpForm;
	}
	public Integer getViewNumForm() {
		return viewNumForm;
	}
	public void setViewNumForm(Integer viewNumForm) {
		this.viewNumForm = viewNumForm;
	}
	public Integer getIsShowForm() {
		return isShowForm;
	}
	public void setIsShowForm(Integer isShowForm) {
		this.isShowForm = isShowForm;
	}
	public Integer getIsEditForm() {
		return isEditForm;
	}
	public void setIsEditForm(Integer isEditForm) {
		this.isEditForm = isEditForm;
	}
	public String getFormTypeForm() {
		return formTypeForm;
	}
	public void setFormTypeForm(String formTypeForm) {
		this.formTypeForm = formTypeForm;
	}
	public Long getGroupIdFormId() {
		return groupIdFormId;
	}
	public void setGroupIdFormId(Long groupIdFormId) {
		this.groupIdFormId = groupIdFormId;
	}
	public String getOptionKV() {
		return optionKV;
	}
	public void setOptionKV(String optionKV) {
		this.optionKV = optionKV;
	}
	public String getTheClass() {
		return theClass;
	}
	public void setTheClass(String theClass) {
		this.theClass = theClass;
	}
	public String getFuncs() {
		return funcs;
	}
	public void setFuncs(String funcs) {
		this.funcs = funcs;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Integer getIsUse() {
		return isUse;
	}
	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	} 
	
	
	
	
}

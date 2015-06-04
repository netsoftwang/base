package com.palace.seeds.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Repository;

@Repository
public class CusFieldDao extends BaseDao implements ICusFieldDao{

	public Map getPage(Map<String, Object> params) {
		 
		Integer page=MapUtils.getInteger(params,"paage",0);
		Integer rows=MapUtils.getInteger(params,"rows",10);
		Long entId=MapUtils.getLong(params,"entId",0l);
		String tableName=MapUtils.getString(params,"tableName","customer");
		Map<String,Object> resMap=new HashMap<String, Object>();
		String sql="select * from cusField where entId=? and tableName=? limit ?,?";
		String countSql="select count(1) from cusField where entId=? and tableName=?";
		Long total=queryForLong(countSql, entId,tableName);
		List<Map<String,Object>> listMap=queryForListMap(sql,entId,tableName,page,rows);
		
		resMap.put("rows",listMap);
		resMap.put("total",total);
		return  resMap;
	}
	
}

 
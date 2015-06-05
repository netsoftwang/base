package com.palace.seeds.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;

public class BaseDao {
	private JdbcTemplate jdbcTemplate;
	
	@Resource(name="dataSource")
	private DataSource dataSource;
 
	public Map<String,Object> queryForMap(String sql,Object ...args){
		return jdbcTemplate.queryForMap(sql, args);
	}
	
	public List<Map<String,Object>> queryForListMap(String sql,Object ...args){
		return jdbcTemplate.queryForList(sql,args);
	}
	public Long insert(String sql,Object ...args){
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con = jdbcTemplate.getDataSource().getConnection();
			ps= con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			fillArgs(ps, args);
			if(ps.execute()){
				return (Long)JdbcUtils.getResultSetValue(ps.getResultSet(),1,Long.class);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DataSourceUtils.releaseConnection(con, jdbcTemplate.getDataSource());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public void save(){
		
	}
	
	
	public Map<String,Object> getPage(String totalSql,String objSql,Object args){
		Map<String,Object> map=new java.util.HashMap<String, Object>();
		map.put(com.palace.seeds.util.ConstVal.Page.TOTAL,queryForLong(totalSql,args));
		map.put(com.palace.seeds.util.ConstVal.Page.ROWS,queryForListMap(objSql, args));
		return map;
	}
	
	 public Long queryForLong(String sql,Object ...args){
		 return queryForObj(sql,Long.class, args);
	 }
	
	public <T> T queryForObj(String sql,Class<T> returnType , Object ...args){
		
		Connection con = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
		PreparedStatement ps=null;
		try {
			ps = con.prepareStatement(sql);
			fillArgs(ps, args);
			if(ps.execute()){
				java.sql.ResultSet rs = ps.getResultSet(); 
				ResultSetMetaData resMetaData = rs.getMetaData();
				if (resMetaData.getColumnCount() != 1) {
					throw new RuntimeException("返回的列个数为："+resMetaData.getColumnCount());
				}
				Object obj = JdbcUtils.getResultSetValue(rs,1,returnType);
				return (T) obj;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DataSourceUtils.releaseConnection(con, jdbcTemplate.getDataSource());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void fillArgs(PreparedStatement ps,Object ...args){
			if(com.palace.seeds.util.ConstVal.Sql.SHOWSQL)
				fillArgs(ps, args);
			
			try {
				for(int i=0;i<args.length;i++){
					ps.setObject(i+1,args[i]);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void showSql(String sql,Object...args){
		for(int i=0;i<args.length;i++){
			sql+=sql+"===para"+i+":"+args[i]+"***";
		}
		System.out.println(sql);
	}
	
}

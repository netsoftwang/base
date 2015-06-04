package com.palace.seeds.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
	public Long queryForLong(String sql,Object ...args){
		return jdbcTemplate.queryForLong(sql,args);
	}
	public void insert(String sql,Object ...args){
		DataSource ds= jdbcTemplate.getDataSource();
		Connection con;
		try {
			con = ds.getConnection();
			PreparedStatement ps= con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ;
	}
	public void save(){
		
	}
	
}

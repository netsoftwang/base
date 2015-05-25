package com.palace.seeds.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.jdbc.CallableStatement;

public class BaseDao {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public Map<String,Object> queryForMap(String sql,Object args){
		return jdbcTemplate.queryForMap(sql, args);
	}
	
	public String  geneSql(Object ...args){
		if(args.length>0){
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<args.length;i++){
				Object obj=args[i];
				if(obj ==null){
					return "error";
				}else{
					if(obj instanceof String || obj instanceof Character){
						sb.append("'"+obj+"'");
					}else if(obj instanceof Boolean){
						if(((boolean)obj)==true)
							sb.append(1);
						else 
							sb.append(0);
					}else {
						sb.append(obj);
					}
				}
			}
		}
		return null;
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

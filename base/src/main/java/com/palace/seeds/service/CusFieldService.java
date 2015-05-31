package com.palace.seeds.service;

import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palace.seeds.dao.ICusFieldDao;

@Service
public class CusFieldService  implements ICusFieldService{
	
	@Autowired
	private ICusFieldDao cusFieldDao;
	public Map getPage(Map<String, Object> params) {
		 return  cusFieldDao.getPage(params);
	}

}

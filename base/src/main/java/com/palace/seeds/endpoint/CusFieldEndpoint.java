package com.palace.seeds.endpoint;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.palace.seeds.dao.ICusFieldDao;
import com.palace.seeds.service.ICusFieldService;

@Controller
@RequestMapping("cusField")
public class CusFieldEndpoint {
 
	@Resource
	private ICusFieldService cusFieldService;
	
	public @ResponseBody Map<String,Object> getCusFieldPage(Map<String,Object> params){
		return cusFieldService.getPage(params);
	}
}

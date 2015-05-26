package com.palace.seeds.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cusField")
public class CusFieldEndpoint {

	@RequestMapping("getCusFieldPage")
	public void getPage(Long  page,Long rows){
		System.out.println("ddd");
	}
}

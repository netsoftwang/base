package com.palace.seeds.test;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.palace.seeds.dao.CusFieldDao;

public class DaoTest {
	@Test
	public void  testJdbc(){
		FileSystemXmlApplicationContext cpx =new FileSystemXmlApplicationContext("file:F:/git/base/base/src/main/resources/spring/spring-context.xml");
		CusFieldDao cf = (CusFieldDao) cpx.getBean("cusFieldDao");
		System.out.println(cf);
	}
}

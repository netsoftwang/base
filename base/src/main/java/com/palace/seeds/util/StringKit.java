package com.palace.seeds.util;

public class StringKit {
	public boolean isEmpety(String str){
		if(str==null){
			return false;
		}else{
			return str.trim().isEmpty();
		}
	}
}

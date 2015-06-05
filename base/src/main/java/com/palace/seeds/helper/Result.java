package com.palace.seeds.helper;

public class Result {

	public static final Integer WARING_CODE =100;
	public static final Integer SUCC_CODE   =200;
	public static final Integer ERROR_CODE  =400;
	
	private String msg;
	private Integer code;
	
	public Result(Integer code,String msg){
		this.msg=msg;
		this.code=code;
	}
	public static Result succ(){
		return new Result(200,"ok");
	}
	public static Result err(String msg){
		return new Result(400,msg);  
	}
}
 
package com.palace.seeds.service;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Service;

import com.palace.seeds.dao.ITreeDao;
import com.palace.seeds.helper.Result;
import com.palace.seeds.helper.TableConst;

@Service
public class TreeService implements ITreeService{
	@Resource
	private ITreeDao treeDao;
	
	public Result addNode(Map<String,Object> params){
		long i=0;
		if(MapUtils.getLong(params,"parent",0l)==0)
		  i= treeDao.addNode(params);
		else{
			Map<String,Object> parentTreeMap = treeDao.findById(TableConst.TREE,MapUtils.getString(params,"id"),"left","right");
			Integer left=MapUtils.getInteger(parentTreeMap,"left");
			Integer right=MapUtils.getInteger(parentTreeMap,"right");
			treeDao.update(TableConst.TREE," right=right+2 ", " name='"+MapUtils.getString(params,"name")
					+" and entId= "+MapUtils.getString(params,"entId")
					+" and right >="+right);
			treeDao.update(TableConst.TREE,"left=left+2", " name='"+MapUtils.getString(params,"name")
					+" and entId= "+MapUtils.getString(params,"entId")
					+" and left >"+left);
			params.put("left",left+1);
			params.put("right",left+2);
			i =treeDao.addNode(params);
		}
		if(i>0)
			return Result.succ();
		else
			return Result.err("树节点添加失败!");
	}
	
	public Result queryNode(Map<String,Object> params){
		params.put("entId",0);
		return null;
	}

}

package com.empsystem.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.empsystem.entity.TbDept;
import com.empsystem.service.IDeptService;

@Controller("deptAction")
@Scope("prototype")
public class DeptAction {

	private TbDept dept;
	
	@Resource(name="deptService")			/*依赖IDeptService*/
	private IDeptService deptService;
	private int message;			/*状态*/
	
	/**
	 * 添加部门
	 */
	public String addDept(){
		if(deptService.addDept(dept)){
			message = 1;
		}else{
			message = 0;
		}
		return "addDept";
	}

	public TbDept getDept() {
		return dept;
	}

	public void setDept(TbDept dept) {
		this.dept = dept;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}
	
}

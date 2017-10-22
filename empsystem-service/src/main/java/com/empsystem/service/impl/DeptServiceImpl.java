package com.empsystem.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.empsystem.dao.IDeptDao;
import com.empsystem.entity.TbDept;
import com.empsystem.service.IDeptService;
import com.empsystem.util.MyDateFormate;

@Service("deptService")
@Transactional(propagation=Propagation.REQUIRED)
public class DeptServiceImpl implements IDeptService {

	@Resource(name="deptDao")
	private IDeptDao deptDao;
	
	@Override
	public boolean addDept(TbDept dept) {
		System.out.println("Teacher正在执行addDept操作，日期:"+MyDateFormate.formate(new Date()));
		return deptDao.addDept(dept);
	}

	@Override
	public List findDeptList() {
		System.out.println("Teacher正在执行findDeptList操作，日期:"+MyDateFormate.formate(new Date()));
		String hql = "from TbDept";
		return deptDao.findDeptList(hql);
	}

	@Override
	public boolean updateDept(TbDept dept) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}
}

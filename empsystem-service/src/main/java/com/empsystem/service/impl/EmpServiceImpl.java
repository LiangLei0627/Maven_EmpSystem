package com.empsystem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.empsystem.dao.IEmpDao;
import com.empsystem.entity.TbEmp;
import com.empsystem.service.IEmpService;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmpServiceImpl implements IEmpService {

	@Resource(name="empDao")
	private IEmpDao empDao;
	@Override
	public boolean addEmp(TbEmp emp) {
		return empDao.addEmp(emp);
	}

	@Override
	public List findEmpList() {
		String hql = "from TbEmp e left join e.dept";
		return empDao.findEmpList(hql);
	}

	@Override
	public boolean updateEmp(TbEmp emp) {
		
		return empDao.updateEmp(emp);
	}
	
	@Override
	public TbEmp getEmpById(int eno) {
		
		return empDao.getEmpById(eno);
	}

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}
	
}

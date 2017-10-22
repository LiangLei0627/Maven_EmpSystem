package com.empsystem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.empsystem.dao.IEmpDao;
import com.empsystem.entity.TbEmp;

@Repository("empDao")
public class EmpDaoImpl extends BaseDao implements IEmpDao {

	@Override
	public boolean addEmp(TbEmp emp) {
		try {
			getSession().save(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List findEmpList(String hql) {
		
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean updateEmp(TbEmp emp) {
		try {
			getSession().update(emp);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public TbEmp getEmpById(int eno) {
		try {
			return getSession().get(TbEmp.class, eno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}

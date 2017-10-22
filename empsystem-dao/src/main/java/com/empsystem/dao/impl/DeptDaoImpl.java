package com.empsystem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.empsystem.dao.IDeptDao;
import com.empsystem.entity.TbDept;

@Repository("deptDao")
public class DeptDaoImpl extends BaseDao implements IDeptDao {

	@Override
	public boolean addDept(TbDept dept) {
		try {
			getSession().save(dept);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List findDeptList(String hql) {
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean updateDept(TbDept dept) {
		try {
			getSession().update(dept);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}

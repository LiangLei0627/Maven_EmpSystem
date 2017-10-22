package com.empsystem.dao;

import java.util.List;

import com.empsystem.entity.TbDept;

public interface IDeptDao {
	/**
	 * 添加部门
	 * @param dept 传入一个部门对象
	 * @return 成功返回true，失败返回false
	 */
	public boolean addDept(TbDept dept);
	/**
	 * 查询所有部门信息
	 * @param hql 传入hql语句
	 * @return 成功返回一个list集合，失败返回null
	 */
	public List findDeptList(String hql);
	/**
	 * 修改部门
	 * @param dept 传入一个部门对象
	 * @return 成功返回true，失败返回false
	 */
	public boolean updateDept(TbDept dept);
}

package com.empsystem.dao;

import java.util.List;

import com.empsystem.entity.TbEmp;

public interface IEmpDao {
	/**
	 * 添加员工
	 * @param emp 传入一个emp对象
	 * @return	成功返回true，失败返回false
	 */
	public boolean addEmp(TbEmp emp);
	/**
	 * 查询员工
	 * @param hql 传入hql语句
	 * @return 成功返回一个list集合，失败返回null
	 */
	public List findEmpList(String hql);
	/**
	 * 修改员工
	 * @param emp 传入一个emp对象
	 * @return 成功返回true，失败返回false
	 */
	public boolean updateEmp(TbEmp emp);
	/**
	 * 通过emp的ID查询出emp信息
	 * @param emp 传入一个emp对象
	 * @return 成功返回一个TbEmp对象，失败返回null
	 */
	public TbEmp getEmpById(int eno);
}

package com.empsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_dept")
public class TbDept {

	private int dno;			/*部门编号*/
	private String dname;			/*部门名称*/
	
	public TbDept() {
		super();
	}

	public TbDept(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
}

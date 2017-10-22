<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>修改员工</h2>
	<s:if test="#parameters.message[0]==1">
		<p style="color:green;">修改成功</p>
	</s:if>
	<s:elseif test="#parameters.message[0]==0">
		<p style="color:red;">修改失败</p>
	</s:elseif>
	<s:form method="post" action="empAction_doUpdateEmp">
		<s:hidden name="emp.eno"/>
		员工姓名:<s:textfield name="emp.ename"/><br/>
		员工年龄:<s:textfield name="emp.eage"/><br/>
		员工性别:<s:radio list="{'男','女'}" value="%{'男'}" name="emp.esex"/><br/>
		加入部门:<s:select list="#request.deptList" name="emp.dept.dno" listKey="dno" listValue="dname" headerKey="" headerValue="请选择部门"/>
		<s:submit value="修改员工"/>
	</s:form>
</body>
</html>








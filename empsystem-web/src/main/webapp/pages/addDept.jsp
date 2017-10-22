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
	<h2>添加部门</h2>
	<s:if test="#parameters.message[0]==1">
		<p style="color:green;">添加成功</p>
	</s:if>
	<s:elseif test="#parameters.message[0]==0">
		<p style="color:red;">添加失败</p>
	</s:elseif>
	<s:form method="post" action="deptAction_addDept">
		部门名称:<s:textfield name="dept.dname"/>
		<s:submit value="添加部门"/>
	</s:form>
</body>
</html>








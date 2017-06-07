<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Categories.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="this is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="/jmSsh20170605/category/categoryAction.action">
		<input type="text" name="cate.categoryname"> <input
			type="submit" value="查询">
		<table border="1px">
			<tr>
				<th>产品编号</th>
				<th>产品名称</th>
				<th>产品说明</th>
				<th>操作</th>
				<th>删除</th>
			</tr>
			<p:forEach items="${cates}" var="c">
				<tr>
					<td>${c.categoryid}</td>
					<td>${c.categoryname}</td>
					<td>${c.description}</td>
					<td><a href="/jmSsh20170605/update.jsp">修改</a></td>
					<td><a
						href="/jmSsh20170605/category/categoryDelete.action?cate.categoryid=${c.categoryid}">删除</a></td>
				</tr>
			</p:forEach>
		</table>
	</form>
	<form action="/jmSsh20170605/category/categoryAdd.action" method="post">
		<table border="1px">
			<tr>
				<td>产品编号<input type="text" name="cate.categroyid"></td>
				<td>产品名称<input type="text" name="cate.categoryname"></td>
				<td>产品说明<input type="text" name="cate.description"></td>
			</tr>
		</table>
		<input type="submit" value="添加">
	</form>
</body>
</html>

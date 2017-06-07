<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'update.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="/jmSsh20170605/category/categoryUpdate.action" method="post">
		<table border="1px">
			<tr>
				<td>产品编号<input type="text" name="cate.categoryid"></td>
				<td>产品名称<input type="text" name="cate.categoryname"></td>
				<td>产品说明<input type="text" name="cate.description"></td>
			</tr>
		</table>
		<input type="submit" value="修改">
	</form>
</body>
</html>

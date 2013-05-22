<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="300">
		<tr>测试数据</tr>
		<s:iterator value="booksList">
			<tr>
				<s:property value="aaa" />
			</tr>
			<tr>
				<s:property value="bbb" />
			</tr>
			<tr>
				<s:property value="ccc" />
			</tr>
		</s:iterator>
	</table>
</body>
</html>
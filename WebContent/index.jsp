<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<!-- 引入bootsarp资源信息  -->
	<link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
	<!-- 引入js -->
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.js"></script>
<!-- 引入bootstarp的资源信息 -->

</head>
<body>
	
	<div class="container">
		<table class="table table-hover">
		<tr>
			<th>产品编号</th>
			<th>产品名称</th>
			<th>产品别名</th>
			<th>产品科目</th>
			<th>产品价格</th>
			<th>产品地址</th>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.id }</td>
				<td>${l.name }</td>
				<td>${l.anothername }</td>
				<td>${l.property }</td>
				<td>${l.price }</td>
				<td>${l.production }</td>
			</tr>
		</c:forEach>

		</table>
	</div>
		
</body>
</html>
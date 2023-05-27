<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<!-- 引入Bootstrap的CSS文件 -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<h2 style="color: teal">此页面使用了bootstrap框架</h2>
	<h3>插入了三个学生信息</h3>
	<table class="table">
		<thead>
		<tr>
			<th>姓名</th>
			<th>年龄</th>
			<th>电话</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${listU }" var="list">
			<tr>
				<td>${list.name }</td>
				<td>${list.age }</td>
				<td>${list.tel }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>

<!-- 引入Bootstrap的JavaScript文件，包括依赖的Popper和jQuery库 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

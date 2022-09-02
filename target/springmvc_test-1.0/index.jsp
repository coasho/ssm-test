<%--
  Created by IntelliJ IDEA.
  User: WENXUAN WANG
  Date: 2022/8/11
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>

<a href='${pageContext.request.contextPath}/student/demo.action'>student请求</a>
<a href='${pageContext.request.contextPath}/teacher/demo.action'>teacher请求</a>
<br><br><br><br>
<form action="${pageContext.request.contextPath}/teacher/demo.action" method="get">
    <input type="submit" value="请求方式测试">
</form>
<br><br><br><br>
<form action="${pageContext.request.contextPath}/teacher/demo1.action" method="post">
    <input name="name">
    <input name="age">
    <input type="submit" value="提交参数与方法参数直接匹配">
</form>
<br><br><br><br>
<form action="${pageContext.request.contextPath}/teacher/demo2.action">
    <input name="name">
    <input name="age">
    <input type="submit" value="提交参数与方法参数实体类的成员变量名匹配">
</form>
<br><br><br><br>
<form action="${pageContext.request.contextPath}/teacher/demo3/张三/55.action" method="get">
    <input type="submit" value="数据直接在请求路径上通过占位符提交">
</form>
<br><br><br><br>
<form action="${pageContext.request.contextPath}/teacher/demo4.action">
    <input name="name">
    <input name="age">
    <input type="submit" value="前后端参数不一致通过注解匹配">
</form>
<br><br><br><br>
<form action="${pageContext.request.contextPath}/student/getlist">
    <input name="id">
    <input name="gender">
    <input name="startRow">
    <input type="submit" value="getlist">
</form>
</body>
</html>

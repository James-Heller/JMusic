<%--
  Created by IntelliJ IDEA.
  User: JamesTang
  Date: 2020/9/28
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="RegisterServlet" method="post" >
    输入昵称:<input name="name" type="text"><br><br>
    输入邮箱:<input name="id" type="text" ><br><br>
    输入密码:<input name="password" type="password"><br><br>
    <input type="reset"value="重置"><input type="submit"value="注册">
</form>
<a href="login.jsp">已有账号？去登陆</a>
</body>
</html>

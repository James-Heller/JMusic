<%--
  Created by IntelliJ IDEA.
  User: JamesTang
  Date: 2020/9/27
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<form action="LoginServlet" method="post">
    昵称：<input type="text" name="name" placeholder="nickName">
    邮箱：<input type="email" name="id" placeholder="example@example.com">
    密码:<input type="password" name="password" >

</form>
</body>
</html>
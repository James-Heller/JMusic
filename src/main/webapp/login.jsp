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
    昵称：<input type="text" name="name" placeholder="nickName"><br><br>
    邮箱：<input type="email" name="id" placeholder="example@example.com"><br><br>
    密码:<input type="password" name="password" ><br><br>
    <input type="submit"value="登录"name="login"><input type="reset"value="重置"><br>
</form>
</body>
</html>
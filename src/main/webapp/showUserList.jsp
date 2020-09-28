<%--
  Created by IntelliJ IDEA.
  User: JamesTang
  Date: 2020/9/28
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="edu.JamesTang.JMusic.entity.MyUser" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.JamesTang.JMusic.dao.UserDao" %>
<%@ page import="edu.JamesTang.JMusic.dao.UserDaoImplements" %>
<%@ page import="java.lang.ref.ReferenceQueue" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>用户清单</title>
</head>
<body>
<%
    String path=request.getContextPath();
    String basepath=request.getScheme()+"://"+ request.getServerName()+":"+request.getServerPort()+"/";
%>

<c:forEach var="U" items="${requestScope.all}">
    <form action="UserListServlet" method="post">
        <tr>
            <td><input type="text" value="${U.name}" name="name" ></td>
            <td><input type="text" value="${U.passwordMD5}" name="password"></td>
            <td><input type="text" value="${U.ID}" name="id"></td>
            <td><a href="DeleteServlet?id=${U.ID}">删除</a> <input type="submit" value="更新"/></td>
        </tr>
    </form>
</c:forEach>
</body>
</html>

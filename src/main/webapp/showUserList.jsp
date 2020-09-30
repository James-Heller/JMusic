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
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
</head>
<body class="layui-main layui-bg-black">
<%
    String path=request.getContextPath();
    String basepath=request.getScheme()+"://"+ request.getServerName()+":"+request.getServerPort()+"/";
%>

<c:forEach var="U" items="${requestScope.all}">
    <form action="UserListServlet" method="post" class="layui-form">

        <div class="layui-container">

            <div class="layui-row">
                <div class="layui-col-md9">
                    <div class="layui-form-label">
                        <label class="layui-form-label">昵称：</label>
                    </div>
                    <div class="layui-input-block">
                        <input type="text" value="${U.name}" name="name" class="layui-input"/>
                    </div>

                    <div class="layui-form-label">
                        <label class="layui-form-label">邮箱：</label>
                    </div>
                    <div class="layui-input-block">
                        <input type="email" value="${U.ID}" name="id" class="layui-input"/>
                    </div>

                    <div class="layui-form-label">
                        <label class="layui-form-label">密码：</label>
                    </div>
                    <div class="layui-input-block">
                        <input type="password" value="${U.passwordMD5}" name="password" readonly="readonly" class="layui-input"/>
                    </div>
                    
                </div>
            </div>

        </div>

    </form>
</c:forEach>
</body>
</html>

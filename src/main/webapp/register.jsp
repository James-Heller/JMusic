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
    <link rel="stylesheet" href="layui/css/layui.css" type="text/css">
</head>
<body>
<form action="RegisterServlet" method="post" class="layui-form">

    <div class="layui-container">

        <div class="layui-row">
            <div class="layui-col-md9">
                <div class="layui-form-label">
                    <label class="layui-form-label">昵称：</label>
                </div>
                <div class="layui-input-block">
                    <input type="text" name="name" class="layui-input"/>
                </div>
            </div>
        </div>

        <div class="layui-row">
            <div class="layui-col-md9">
                <div class="layui-form-label">
                    <label class="layui-form-label">邮箱：</label>
                </div>
                <div class="layui-input-block">
                    <input type="email" name="id" class="layui-input"/>
                </div>
            </div>
        </div>

        <div class="layui-row">
            <div class="layui-col-md9">
                <div class="layui-form-label">
                    <label class="layui-form-label">密码：</label>
                </div>
                <div class="layui-input-block">
                    <input type="password" name="password" class="layui-input"/>
                </div>
            </div>
        </div>

        <div class="layui-row">
            <div class="layui-col-md3">
                <input type="submit" value="注册" class="layui-btn layui-btn-warm"/>
                <input type="reset" value="重置" class="layui-btn layui-btn-danger" />
            </div>
        </div>
        <a href="login.jsp">已有账号？去登陆</a>
    </div>

</form>

</body>
</html>

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
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css" />
</head>
<body class="layui-main layui-bg-black">

<form action="LoginServlet" method="post" class="layui-form">
    <div class="layui-container" style="top: 350px">
        <div class="layui-row">
            <div class="layui-col-md9">
                <div class="layui-form-label">
                    <lable class="layui-form-label">昵称：</lable>
                </div>
                <div class="layui-input-block">
                    <input type="text" name="name" placeholder="nickName" class="layui-input"/>
                </div>
            </div>
        </div>
        <div class="layui-row">
            <div class="layui-col-md9">
                <div class="layui-form-label">
                    <label class="layui-form-label">邮箱：</label>
                </div>
                <div class="layui-input-block">
                    <input type="email" name="id" placeholder="exp@example.com" class="layui-input"/>
                </div>
            </div>
        </div>
        <div class="layui-row">
            <div class="layui-col-md9">
                <div class="layui-form-label">
                    <label class="layui-form-label">密码：</label>
                </div>
                <div class="layui-input-block">
                    <input type="password" name="password" placeholder="PassWord" class="layui-input"/>
                </div>
            </div>
        </div>
        <div class="layui-row">
            <div class="layui-col-md3 layui-col-md-offset3">
                <input type="submit" value="登录" name="login" class="layui-btn layui-btn-warm"/>
                <input type="reset" value="重置" name="reset" class="layui-btn layui-btn-normal"/>
            </div>
        </div>
    </div>
</form>
</body>
</html>
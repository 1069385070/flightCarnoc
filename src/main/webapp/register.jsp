<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/addUser.do" method="post">
    用户名:<input type="text" name="userName" /><br/>
    密码:<input type="password" name="userPassword"><br/>
    <input type="submit" value="提交" />
</form>
</body>
</html>

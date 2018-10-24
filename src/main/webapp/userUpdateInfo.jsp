<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateUser.do" method="post">
    用户ID:<input type="text" value="${user.userId}" name="userId" readonly="readonly" /><br/>
    用户名:<input type="text" value="${user.userName}" name="userName" /><br/>
    密码：<input type="password" name="userPassword" /><br/>
    <input type="submit" value="提交" />
</form>

</body>
</html>

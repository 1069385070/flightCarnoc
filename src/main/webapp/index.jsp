<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>Title</title>
    <script src="jquery/jquery-3.3.1.min.js"></script>
</head>
<body>
<div>
    根据id搜索:<input type="text" id="userId" name="userId2">&nbsp;&nbsp;
    根据姓名搜索:<input type="text" id="userName" name="userName2">&nbsp;
    <button onclick="select()">搜索</button>
    <%--<input type="button" onclick="select()" value="搜索" /><br/>--%>
</div>


<table border="1">
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${user}" var="m">
        <tr>
            <td>${m.userId}</td>
            <td>${m.userName}</td>
            <td>
                <input type="button" onclick="update('${m.userId}')" value="修改" />
                <input type="button" onclick="del('${m.userId}')" value="删除" />
            </td>
        </tr>
    </c:forEach>
</table>
<input type="button" onclick="add()" value="增加">
<script>
    function update(userId) {
        location.href="/getUserByID.do?userId="+userId+"";
    }

    function del(userId) {
        location.href="/deleteUser.do?userId="+userId+"";
    }

    function select() {
        var userId = $('#userId').val();
        // alert('1');
        var userName = $('#userName').val();
        $.ajax({
            url:"/getUser.do",
            data:{userId:userId},
            dataType:"json"
        });
    }

    function add(){
        location.href="register.jsp";
    }
</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<title>登录</title>
<link href="/css/style1.css" rel="stylesheet" type="text/css" media="all"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<script src="/js/jquery-1.7.2.min.js"></script>
<meta name="keywords" content="登录" />
</head>
<body>
<div class="login-form">
			<!-- <div class="top-login">
				<span><img src="images/group.png" alt=""/></span>
			</div> -->
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
			<!-- <h1>登录</h1> -->
			<h1>航班统计系统</h1>
			<div class="login-top">
			<form action="/login.do" method="post" id="myform">
				<div class="login-ic">
					<i></i>
					<input type="text" id="uname"  name="username" placeholder="用户名" />
					<div class="clear"> </div>
				</div>
				<div class="login-ic">
					<i class="icon"></i>
					<input type="password" id="upwd" name="password" placeholder="密码" />
					<div class="clear"> </div>
				</div>
				<div class="log-bwn">
					<input type="button" value="Login" onclick="verify()">
					<%--<input type="submit" value="Login"/>--%>
				</div>
			</form>
			</div>
             <p align="center">www.carnoc.com版权所有</p>
           <p align="center"><a href="http://www.miitbeian.gov.cn">湘ICP备18014513号</a></p>
</div>		
<script type="text/javascript">
    function verify(){
        $("#myform").submit();
    	/*$.ajax({
    		 type:"post",
    		 url:"/login.do",
    		 data:{
    			 username:$("#uname").val(),
                 password:$("#upwd").val(),
    		 },
    	 	 success : function(data){
    		 // if(data > 0){
    			//  window.location.href="index.jsp";
    		 // }else{
    			//  alert("用户名或密码错误");
    		 //  }
    	    }
    	 });*/
    }
</script>
</body>
</html> 
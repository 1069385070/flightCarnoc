<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/28
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="assets/css/ace.min.css" />
<!--[if lte IE 8]>
<link rel="stylesheet" href="assets/css/ace-ie.min.css" />
<![endif]-->
<script src="js/jquery-1.9.1.min.js"></script>  <script src="assets/dist/echarts.js"></script>
<script src="js/lrtk.js" type="text/javascript" ></script>
<body>
    <div id="scrollsidebar" class="left_Treeview">
        <div class="show_btn" id="rightArrow"><span></span></div>
        <div class="widget-box side_content" >
            <div class="side_title"><a title="隐藏" class="close_btn"><span></span></a></div>
            <div class="side_list">
                <div class="widget-header header-color-green2">
                    <h4 class="lighter smaller">分类</h4>
                </div>
                <div class="widget-body">
                    <ul class="b_P_Sort_list">
                        <li> <a href="airstrip.jsp">1. 机位使用率</a></li>
                        <li> <a href="Bybridge.jsp">2. 靠桥率</a></li>
                        <li> <a href="airbridge.jsp">3. 廊桥使用率</a></li>
                        <li> <a href="flight-delay.jsp">4. 各航空公司航班延误统计</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

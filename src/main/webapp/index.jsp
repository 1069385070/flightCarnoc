<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>网站后台管理系统  </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="assets/css/font-awesome.min.css" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <link rel="stylesheet" href="assets/css/ace.min.css" />
    <!--<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />-->
    <link rel="stylesheet" href="css/style.css"/>
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
    <![endif]-->
    <!--<script src="assets/js/ace-extra.min.js"></script>-->
    <!--[if lt IE 9]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.min.js"></script>
    <![endif]-->
    <!--[if !IE]> -->
    <script src="js/jquery-1.9.1.min.js"></script>
    <!-- <![endif]-->
    <!--[if IE]>
    <script type="text/javascript">window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");</script>
    <![endif]-->
    <script type="text/javascript">
        if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
    </script>

    <script src="assets/layer/layer.js" type="text/javascript" ></script>
    <script type="text/javascript" src="js/H-ui.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <!--<script src="assets/js/typeahead-bs2.min.js"></script>-->
    <!--[if lte IE 8]>
    <script src="assets/js/excanvas.min.js"></script>
    <![endif]-->
    <!--<script src="assets/js/ace-elements.min.js"></script>-->
    <script src="assets/js/ace.min.js"></script>

    <%--<script src="../lib/jquery.js"></script>--%>
    <script src="/jquery-validation-1.18.0/dist/jquery.validate.min.js"></script>
    <script src="./jquery-validation-1.18.0/dist/localization/messages_zh.js"></script>
    <style>
        .error{
            color:red;
        }
    </style>
    <script type="text/javascript">
        $(function(){
            var cid = $('#nav_list> li>.submenu');
            cid.each(function(i){
                $(this).attr('id',"Sort_link_"+i);

            })
        })
        jQuery(document).ready(function(){
            $.each($(".submenu"),function(){
                var $aobjs=$(this).children("li");
                var rowCount=$aobjs.size();
                var divHeigth=$(this).height();
                $aobjs.height(divHeigth/rowCount);
            });
            //初始化宽度、高度

            $("#main-container").height($(window).height()-76);
            $("#iframe").height($(window).height()-140);

            $(".sidebar").height($(window).height()-99);
            var thisHeight = $("#nav_list").height($(window).outerHeight()-173);
            $(".submenu").height();
            $("#nav_list").children(".submenu").css("height",thisHeight);

            //当文档窗口发生改变时 触发
            $(window).resize(function(){
                $("#main-container").height($(window).height()-76);
                $("#iframe").height($(window).height()-140);
                $(".sidebar").height($(window).height()-99);

                var thisHeight = $("#nav_list").height($(window).outerHeight()-173);
                $(".submenu").height();
                $("#nav_list").children(".submenu").css("height",thisHeight);
            });
            $(document).on('click','.iframeurl',function(){
                var cid = $(this).attr("name");
                var cname = $(this).attr("title");
                $("#iframe").attr("src",cid).ready();
                $("#Bcrumbs").attr("href",cid).ready();
                $(".Current_page a").attr('href',cid).ready();
                $(".Current_page").attr('name',cid);
                $(".Current_page").html(cname).css({"color":"#333333","cursor":"default"}).ready();
                $("#parentIframe").html('<span class="parentIframe iframeurl"> </span>').css("display","none").ready();
                $("#parentIfour").html(''). css("display","none").ready();
            });



        });
        /******/
        $(document).on('click','.link_cz > li',function(){
            $('.link_cz > li').removeClass('active');
            $(this).addClass('active');
        });
        /*******************/

        /*********************点击事件*********************/
        $( document).ready(function(){
            $('#nav_list,.link_cz').find('li.home').on('click',function(){
                $('#nav_list,.link_cz').find('li.home').removeClass('active');
                $(this).addClass('active');
            });
//时间设置
            function currentTime(){
                var d=new Date(),str='';
                str+=d.getFullYear()+'年';
                str+=d.getMonth() + 1+'月';
                str+=d.getDate()+'日';
                str+=d.getHours()+'时';
                str+=d.getMinutes()+'分';
                str+= d.getSeconds()+'秒';
                return str;
            }

            setInterval(function(){$('#time').html(currentTime)},1000);
            $('#Exit_system').on('click', function(){
                layer.confirm('是否确定退出系统？', {
                        btn: ['是','否'] ,//按钮
                        icon:2,
                    },
                    function(){
                        location.href="/logout";
                    });
            });
        });
        function link_operating(name,title){
            var cid = $(this).name;
            var cname = $(this).title;
            $("#iframe").attr("src",cid).ready();
            $("#Bcrumbs").attr("href",cid).ready();
            $(".Current_page a").attr('href',cid).ready();
            $(".Current_page").attr('name',cid);
            $(".Current_page").html(cname).css({"color":"#333333","cursor":"default"}).ready();
            $("#parentIframe").html('<span class="parentIframe iframeurl"> </span>').css("display","none").ready();
            $("#parentIfour").html(''). css("display","none").ready();
        }
    </script>
</head>
<body>
456
<%--<shiro:hasPermission name="admin:create">
    <input type="button" value="用户管理" onclick="window.location='${pageContext.request.contextPath}/admin/user_management.do'">
</shiro:hasPermission>--%>
123
<div class="navbar navbar-default" id="navbar">
    <script type="text/javascript">
        try{ace.settings.check('navbar' , 'fixed')}catch(e){}
    </script>
    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <img src="" width="470px">
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->
        <div class="navbar-header operating pull-left">

        </div>
        <div class="navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <shiro:user>
                            <span  class="time"><em id="time"></em></span><span class="user-info"><small>欢迎光临</small>[<shiro:principal/>]</span>
                            <input id="username" type="hidden" value="<shiro:principal/>">
                        </shiro:user>
                        <%--<span  class="time"><em id="time"></em></span><span class="user-info"><small>欢迎光临,</small>超级管理员</span>--%>
                        <i class="icon-caret-down"></i>
                    </a>
                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

                        <li><a href="javascript:void(0)" title="个人信息" class="iframeurl" id="updatepassword"><i class="icon-user"></i>个人资料</a></li>
                        <li class="divider"></li>
                        <li><a href="javascript:void(0)" id="Exit_system"><i class="icon-off"></i>退出</a></li>
                    </ul>
                </li>

            </ul>
            <!-- <div class="right_info">

               <div class="get_time" ><span id="time" class="time"></span>欢迎光临,管理员</span></div>
                <ul class="nav ace-nav">
                    <li><a href="javascript:ovid(0)" class="change_Password">修改密码</a></li>
                    <li><a href="javascript:ovid(0)" id="Exit_system">退出系统</a></li>

                </ul>
            </div>-->
        </div>
    </div>
</div>
<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>
    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="#">
            <span class="menu-text"></span>
        </a>
        <div class="sidebar" id="sidebar">
            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
            </script>
            <!-- #sidebar-shortcuts -->
            <div id="menu_style" class="menu_style">
                <ul class="nav nav-list" id="nav_list">
                    <c:forEach items="${sessionScope.menuList}" var="list">
                        <c:if test="${list.fid==0}">
                            <c:if test="${list.id==1}">
                                <li class="home"><a href="javascript:void(0)" name="${list.url}" class="iframeurl" title="${list.name}"><i class="${list.icon}"></i><span class="menu-text">${list.name}</span></a></li>
                            </c:if>
                            <c:if test="${list.id!=1}">
                                <li>
                                    <c:if test="${list.url==null}">
                                        <a href="#" class="dropdown-toggle"><i class="${list.icon}"></i><span class="menu-text">${list.name} </span><b class="arrow icon-angle-down"></b></a>
                                    </c:if>
                                    <c:if test="${list.url!=null}">
                                        <li><a href="javascript:void(0)" name="${list.url}" class="iframeurl" title="${list.name}"><i class="${list.icon}"></i><span class="menu-text">${list.name}</span></a></li>
                                    </c:if>
                                    <ul class="submenu">
                                        <c:forEach items="${sessionScope.menuList}" var="li">
                                            <c:if test="${li.fid==list.id}">
                                                <li class="home"><a href="javascript:void(0)" name="${li.url}" title="${li.name}" class="iframeurl"><i class="icon-double-angle-right"></i>${li.name}</a></li>
                                            </c:if>
                                        </c:forEach>
                                    </ul>
                                </li>

                            </c:if>
                        </c:if>
                    </c:forEach>
                    <%--<li class="home"><a href="javascript:void(0)" name="/flight/Flight-dynamics.jsp" class="iframeurl" title="航班动态信息 "><i class="icon-home"></i><span class="menu-text"> 航班动态信息 </span></a></li>

                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-credit-card"></i><span class="menu-text"> 数据采集 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="/flight/Automatic-collection.jsp" title="自动采集" class="iframeurl"><i class="icon-double-angle-right"></i>自动采集</a></li>
                            <li class="home"><a href="javascript:void(0)" name="/flight/BD-maintenance.jsp" title="基础数据维护" class="iframeurl"><i class="icon-double-angle-right"></i>基础数据维护</a></li>

                        </ul>
                    </li>
                    <li>
                        <a href="#" class="dropdown-toggle"><i class="icon-user"></i><span class="menu-text"> 统计分析 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="/flight/Normal-flight.jsp" title="航班正常性"  class="iframeurl"><i class="icon-double-angle-right"></i>航班正常性</a></li>
                            <li class="home"><a href="javascript:void(0)" name="/flight/Aviation-resources.jsp" title="航保资源统计"  class="iframeurl"><i class="icon-double-angle-right"></i>航保资源统计</a></li>
                            <li class="home"><a href="javascript:void(0)" name="/flight/business-analysis.jsp" title="经营分析统计"  class="iframeurl"><i class="icon-double-angle-right"></i>经营分析统计</a></li>

                        </ul>
                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-laptop"></i><span class="menu-text"> 用户管理 </span><b class="arrow icon-angle-down"></b></a>
                        <ul class="submenu">
                            <li class="home"><a href="javascript:void(0)" name="/admin/userlist.jsp" title="用户信息" class="iframeurl"><i class="icon-double-angle-right"></i>用户信息</a></li>
                            <li class="home"><a href="javascript:void(0)" name="/admin/user-group.jsp" title="用户组信息" class="iframeurl"><i class="icon-double-angle-right"></i>用户组信息</a></li>
                        </ul>
                    </li>

                    <li><a href="#" class="dropdown-toggle"><i class="icon-bookmark"></i><span class="menu-text"> 数据维护 </span> </a>

                    </li>
                    <li><a href="#" class="dropdown-toggle"><i class="icon-cogs"></i><span class="menu-text"> 数据导出 </span> </a>

                    </li>--%>

                </ul>
            </div>

            <div class="sidebar-collapse" id="sidebar-collapse">
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>
            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
            </script>
        </div>

        <div class="main-content">

            <div class="breadcrumbs" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li>
                        <i class="icon-home home-icon"></i>
                        <a href="index.jsp"></a>
                    </li>
                    <li class="active"><span class="Current_page iframeurl"></span></li>
                    <li class="active" id="parentIframe"><span class="parentIframe iframeurl"></span></li>
                    <li class="active" id="parentIfour"><span class="parentIfour iframeurl"></span></li>
                </ul>
            </div>

            <iframe id="iframe" style="border:0; width:100%; background-color:#FFF;"name="iframe" frameborder="0" src="flight/Flight-dynamics.jsp">  </iframe>


            <!-- /.page-content -->
        </div><!-- /.main-content -->

    </div><!-- /.main-container-inner -->

</div>
<!--底部样式-->

<div class="footer_style" id="footerstyle">
    <script type="text/javascript">try{ace.settings.check('footerstyle' , 'fixed')}catch(e){}</script>
    <p class="l_f">版权所有：xxxxx  xxxx</p>
    <p class="r_f">地址：xxxxxx  邮编：xxxxxx 技术支持：xxxx</p>
</div>
<!--修改密码样式-->
<div class="add_menber" id="add_menber_style">
<%--<div class="change_Pass_style" id="change_Pass">--%>
    <form method="post" id="commentForm" class="cmxform" action="/updatePassword.do">
        <input type="hidden" name="username" id="username1"/>
        <ul class="xg_style">
            <li><label class="label_name">原&nbsp;&nbsp;密&nbsp;码</label><input name="firstPassword" type="password" class="" id="firstPassword" onblur="judgePassword()"><span id="firstPasswordId"></span></li>
            <li style="display: none" id="l1"><label class="label_name">新&nbsp;&nbsp;密&nbsp;码</label><input name="password" type="password" class="" id="password" ></li>
            <li style="display: none" id="l2"><label class="label_name">确认密码</label><input name="confirm_password" type="password" class="" id="confirm_password" ></li>
        </ul>
    <div style="display: none"><input type="submit" name="" id="" ></div>
    </form>
    <%--</div>--%>
</div>
<!-- /.main-container -->
<!-- basic scripts -->

</body>
<script type="text/javascript">
    $('#updatepassword').on('click', function(){
        document.getElementById("commentForm").reset();
        layer.open({
            type: 1,
            title: '修改密码',
            maxmin: true,
            shadeClose: true, //点击遮罩关闭层
            area : ['800px' , ''],
            content:$('#add_menber_style'),
            btn:['提交','取消'],
            //submit:['提交','取消'],
            yes:function(index,layero){
                // var num=0;
                // var str="";
                // $(".add_menber input[type$='text']").each(function(n){
                //     if($(this).val()=="")
                //     {
                //
                //         layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                //             title: '提示框',
                //             icon:0,
                //         });
                //         num++;
                //         return false;
                //     }
                //
                // });
                // if(num>0){  return false;}
                // else{
                //
                //
                // }
                alert(123);
                $("#commentForm").submit();
                //layer.msg('已删除!',{icon:1,time:1000});
                // $("#commentForm").validate({
				// 	submitHandler: function(form) {
				// 		alert("提交事件!");
				// 		form.submit();
				// 	}
				// });
            }
        });
    });
        $("#commentForm").validate({
            rules:{
                firstPassword:{
                    required:true,
                    minlength:6
                },
                password:{
                    required:true,
                    minlength:6
                },
                confirm_password:{
                    required:true,
                    minlength:6,
                    equalTo:"#password"
                }
            },
            messages:{
                firstPassword:{
                    required:"请输入密码",
                    minlength:"密码长度不能小于6个字母"
                },
                password:{
                    required:"请输入密码",
                    minlength:"密码长度不能小于6个字母"
                },
                confirm_password:{
                    required:"请输入密码",
                    minlength:"密码长度不能小于6个字母",
                    equalTo:"两次密码输入不一致"
                }
            }
        });

    function judgePassword(){
        var password=$("#firstPassword").val();
        var username=$("#username").val();
        $("#username1").val(username);
        if (password.length>5){
            $.ajax({
                url: '/judgeUsernameExit.do',
                type: 'post',  // 请求类型
                data: {"password":password,"username":username},  // post时请求体
                dataType: 'text',  // 返回请求的类型，有text/json两种
                async: true,   // 是否异步
                /*  cache: true,   // 是否缓存 */
                timeout:null,  // 设置请求超时
                contentType: 'application/x-www-form-urlencoded',
                success:function(data){
                    alert(data)
                    if (data==1){
                        $("#firstPasswordId").html("原密码错误，请重新输入！");
                        document.getElementById("firstPasswordId").className="error";
                    }else{
                        $("#firstPasswordId").html("");
                        document.getElementById("firstPasswordId").className="";
                        document.getElementById("l1").style="";
                        document.getElementById("l2").style="";
                    }
                }
            });
        }
    }
</script>
</html>




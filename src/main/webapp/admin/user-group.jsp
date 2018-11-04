<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" type="text/css" href="../common/css/pagination.css" media="screen">
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css" />
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css" />

    <!--  <link rel="stylesheet" href="font/css/font-awesome.min.css" />-->

    <script type="text/javascript">
        window.jQuery || document.write("<script src='../assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
    </script>
    <script type="text/javascript">
        if("ontouchend" in document) document.write("<script src='../assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
    </script>
    <!-- page specific plugin scripts -->

    <script src="../assets/layer/layer.js" type="text/javascript" ></script>
    <script type="text/javascript" src="../js/H-ui.js"></script>

    <script src="../common/js/highlight.min.js"></script>
    <!-- <script src="../My97DatePicker/WdatePicker.js"></script> -->
    <script src="../common/js/jquery.pagination.js"></script>
    <title>用户组</title>
</head>

<body>
<div class="margin clearfix">
    <div class="Shops_Audit">
        <div class="border clearfix"> <span class="l_f"> <a href="javascript:" id="member_add" class="btn btn-warning"><i class="icon-plus"></i>添加用户组</a> </span> <span class="r_f" id="count"></span> </div>
        <!--申请列表-->
        <div class="audit_list">
            <table class="table table-striped table-bordered table-hover" id="sample-table">
                <thead>
                <tr>
                    <th width="25">
                        <label><input type="checkbox" class="ace">
                            <span class="lbl"></span></label></th>
                    <th  >用户组编号</th>
                    <th  >用户组名称</th>
                    <th  >用户组状态</th>
                    <th  >操作</th>
                </tr>
                </thead>
                <tbody id="tbody">
                <%--<tr>
                    <td><label>
                        <input type="checkbox" class="ace">
                        <span class="lbl"></span></label></td>
                    <td>001</td>
                    <td>普通用户</td>
                    <td class="td-status"><span class="label label-success radius">正常</span></td>
                    <td class="td-manage">
                        <a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                        <a title="用户组详情" href="user-group-list.jsp" class="btn btn-xs btn-info Refund_detailed">用户组详情</a>
                        <a title="修改权限" href="javascript:;"  onclick="member_edit('550')" class="btn btn-xs btn-warning">修改权限</a>

                    </td>
                </tr>--%>
                <%--<tr>
                    <td><label>
                        <input type="checkbox" class="ace">
                        <span class="lbl"></span></label></td>
                    <td>002</td>
                    <td>管理员</td>
                    <td class="td-status"><span class="label label-success radius">正常</span></td>
                    <td class="td-manage">
                        <a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                        <a title="用户组详情" href="user-group-list.jsp" class="btn btn-xs btn-info Refund_detailed">用户组详情</a>
                        <a title="修改权限" href="javascript:;"  onclick="member_edit('550')" class="btn btn-xs btn-warning">修改权限</a>

                    </td>
                </tr>--%>
                <%--<tr>
                    <td><label>
                        <input type="checkbox" class="ace">
                        <span class="lbl"></span></label></td>
                    <td>003</td>
                    <td>超级管理员</td>
                    <td class="td-status"><span class="label label-success radius">正常</span></td>
                    <td class="td-manage">
                        <a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a>
                        <a title="用户组详情" href="user-group-list.jsp" class="btn btn-xs btn-info Refund_detailed">用户组详情</a>
                        <a title="修改权限" href="javascript:;"  onclick="member_edit('550')" class="btn btn-xs btn-warning">修改权限</a>


                    </td>
                </tr>--%>
                </tbody>
            </table>

        </div>
    </div>
</div>


<!--添加用户图层-->
<form class="add_menber" id="add_menber_style" style="display:none">
    <ul class=" page-content">
        <li>
            <label class="label_name" style="width:100px !important">用户组编号：</label>
            <span class="add_name">
            <input value="" name="roleCode" type="text"  class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>

        <li>
            <label class="label_name"  style="width:100px !important"> 用户组名称：</label>
            <span class="add_name">
            <input name="name" type="text"  class="text_add"/>
            </span>
            <div class="prompt r_f"></div>
        </li>
    </ul>
</form>

<!--修改权限图层-->
<form class="member_edit" id="member_edit_style" style="display:none">
    <div class="Assign_style">
        <div class="Select_Competence" id="div">
            <%--<dl class="permission-list">
                <dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox" id="id-disable-check"><span class="lbl">产品管理</span></label></dt>
                <dd>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0" id="id-disable-check"><span class="lbl">产品列表</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>
                    </dl>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1" id="user-Character-0-1"> <span class="lbl">品牌管理</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>
                    </dl>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1" id="user-Character-0-1"> <span class="lbl">分类管理</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                        </dd>
                    </dl>
                </dd>
            </dl>--%>


            <%--</dd>
            </dl>--%>
            <!--交易管理-->
            <%--<dl class="permission-list">
                <dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox" id="id-disable-check"><span class="lbl">数据管理</span></label></dt>
                <dd>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0" id="id-disable-check"><span class="lbl">操作信息</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>
                    </dl>


                </dd>
            </dl>--%>

            <!--会员管理-->
            <%--<dl class="permission-list">
                <dt><label class="middle"><input name="user-Character-0" class="ace" type="checkbox" id="id-disable-check"><span class="lbl">用户管理</span></label></dt>
                <dd>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-0" id="id-disable-check"><span class="lbl">用户信息</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>
                    </dl>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1" id="user-Character-0-1"> <span class="lbl">登记管理</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>
                    </dl>
                    <dl class="cl permission-list2">
                        <dt><label class="middle"><input type="checkbox" value="" class="ace"  name="user-Character-0-1" id="user-Character-0-1"> <span class="lbl">会员积分</span></label></dt>
                        <dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>
                    </dl>
                </dd>
            </dl>--%>
        </div>
    </div>
</form>
</div>
</body>
</html>
<script>
    var n1=0;
    $().ready(function() {
        selectAllAdminRole();

    });

    /*按钮选择*/
    $(function(){
        $.ajax({
            url: '/selectAllMenu.do',
            type: 'post',  // 请求类型
            //data: $("#add_menber_style").serialize(),  // post时请求体
            dataType: 'json',  // 返回请求的类型，有text/json两种
            async: true,   // 是否异步
            /*  cache: true,   // 是否缓存 */
            timeout:null,  // 设置请求超时
            contentType: 'application/x-www-form-urlencoded',
            success:function(data){
                console.log(data)
                //$("#div").html(data);
                var html="";
                var str="";
                var str1="";
                var str2="";
                var menu=data[0];
                var menu1=data[1];
                var menu2=data[2];
                $.each(menu1, function (index,element) {
                    str+="<dl class='permission-list'>";
                    str+="<dt><label class='middle'><input name='user-Character-0' class='ace' type='checkbox' id='id-disable-check' value='"+element.id+"'><span class='lbl'>"+element.name+"</span></label></dt>";
                    str+="<dd>";
                    $.each(menu, function (index1,element1) {
                        if (element.id==element1.fid){
                            str1+="<dl class='cl permission-list2'>";
                            str1+="<dt><label class='middle'><input type='checkbox' value='"+element1.id+"' class='ace'  name='user-Character-0-"+index1+"' id='id-disable-check'><span class='lbl'>"+element1.name+"</span></label></dt>";
                            str1+="<dd>";
                            $.each(menu2, function (index2,element2) {
                                if (element2.fid==element1.id){
                                    str2+="<label class='middle'><input type='checkbox' value='"+element2.id+"' class='ace' name='user-Character-0-0-0' id='user-Character-0-0-"+index2+"'><span class='lbl'>"+element2.name+"</span></label>";
                                }
                            });
                            str1+=str2;
                            str2="";
                            str1+="</dd>";
                            str1+="</dl>";
                        }
                    });
                    str+=str1;
                    str1="";
                    str+="</dd></dl>";
                });

                $("#div").html(str);
                $(".permission-list dt input:checkbox").click(function(){
                    $(this).closest("dl").find("dd input:checkbox").prop("checked",$(this).prop("checked"));
                });
                $(".permission-list2 dd input:checkbox").click(function(){
                    var l =$(this).parent().parent().find("input:checked").length;
                    var l2=$(this).parents(".permission-list").find(".permission-list2 dd").find("input:checked").length;
                    if($(this).prop("checked")){
                        $(this).closest("dl").find("dt input:checkbox").prop("checked",true);
                        $(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",true);
                    }
                    else{
                        if(l==0){
                            $(this).closest("dl").find("dt input:checkbox").prop("checked",false);
                        }
                        if(l2==0){
                            $(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",false);
                        }
                    }

                });
            }
        });

    });

    /*用户组-编辑*/
    function member_edit(id){
        layer.open({
            type: 1,
            title: '修改用户组权限',
            maxmin: true,
            shadeClose:false, //点击遮罩关闭层
            area : ['800px' , ''],
            content:$('#member_edit_style'),
            btn:['提交','取消'],
            yes:function(index,layero){
                var num=0;
                var str="";
                var s="";
                var arr=$("input[type='checkbox']");
                    for (var i = 0; i < arr.length; i++) {
                    if(arr[i].checked==true){
                        str=arr[i].value+",";
                        s+=str;
                    }
                }
                if (s=="") {
                    layer.alert("请勾选权限",{
                        title: '提示框',
                        icon:0,
                    });
                }else{
                    s = s.substring(0,s.lastIndexOf(","))
                    $.ajax({
                        url: '/updateAdminRole.do',
                        type: 'post',  // 请求类型
                        data: {"menuId":s,"id":id},  // post时请求体
                        dataType: 'json',  // 返回请求的类型，有text/json两种
                        async: true,   // 是否异步
                        /*  cache: true,   // 是否缓存 */
                        timeout:null,  // 设置请求超时
                        contentType: 'application/x-www-form-urlencoded',
                        success:function(data){

                            if (data>0){
                                layer.alert('修改成功！',{
                                    title: '提示框',
                                    icon:1,
                                });
                                layer.close(index);
                                selectAllAdminRole()
                            }

                        }
                    });

                }


                /*$(".member_edit input[type$='text']").each(function(n){
                    if($(this).val()=="")
                    {

                        layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                            title: '提示框',
                            icon:0,
                        });
                        num++;
                        return false;e
                    }
                });
                if(num>0){  return false;}
                else{
                    $('#member_edit_style').submit();
                    layer.alert('修改成功！',{
                        title: '提示框',
                        icon:1,
                    });
                    layer.close(index);
                }*/
            }
        });
    }
    /*用户组-添加*/
    $('#member_add').on('click', function(){
        document.getElementById("add_menber_style").reset();
        layer.open({
            type: 1,
            title: '添加用户组',
            maxmin: true,
            shadeClose: true, //点击遮罩关闭层
            area : ['800px' , '200px'],
            content:$('#add_menber_style'),
            btn:['提交','取消'],
            yes:function(index,layero){
                var num=0;
                var str="";
                $(".add_menber input[type$='text']").each(function(n){
                    if($(this).val()=="")
                    {

                        layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                            title: '提示框',
                            icon:0,
                        });
                        num++;
                        return false;
                    }
                });
                if(num>0){  return false;}
                else{
                    $.ajax({
                        url: '/addAdminRole.do',
                        type: 'post',  // 请求类型
                        data: $("#add_menber_style").serialize(),  // post时请求体
                        dataType: 'json',  // 返回请求的类型，有text/json两种
                        async: true,   // 是否异步
                        /*  cache: true,   // 是否缓存 */
                        timeout:null,  // 设置请求超时
                        contentType: 'application/x-www-form-urlencoded',
                        success:function(data){
                            if (data>0){
                                layer.alert('添加成功！',{
                                    title: '提示框',
                                    icon:1,
                                });
                                layer.close(index);
                                selectAllAdminRole()
                            }

                        }
                    });
                }
            }
        });
    });

    /*用户组-停用*/
    function member_stop(obj,id){
        layer.confirm('确认要停用吗？',function(index){

           //updateAdminRole({"id":id,"roleState":0});
            $.ajax({
                url: '/updateAdminRole.do',
                type: 'post',  // 请求类型
                data:{"id":id,"roleState":0},  // post时请求体
                dataType: 'json',  // 返回请求的类型，有text/json两种
                async: true,   // 是否异步
                /*  cache: true,   // 是否缓存 */
                timeout:null,  // 设置请求超时
                contentType: 'application/x-www-form-urlencoded',
                success:function(data){
                    n1 = data;
                    console.log("进来了");
                    console.log(n1);
                    if (n1=='-1'){
                        layer.msg('不能停用!',{icon: 5,time:1000});
                    }
                    if (n1>0){
                        $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,'+id+')" href="javascript:;" title="启用"><i class="icon-ok  bigger-120"></i></a>');
                        $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
                        $(obj).remove();
                        layer.msg('已停用!',{icon: 5,time:1000});
                    }
                }
            });


        });

    }

    function a(){
        console.log(n1);
        if (n1=='-1'){
            layer.msg('不能停用!',{icon: 5,time:1000});
        }
        if (n1>0){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,'+id+')" href="javascript:;" title="启用"><i class="icon-ok  bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            layer.msg('已停用!',{icon: 5,time:1000});
        }
    }

    /*用户组-启用*/
    function member_start(obj,id){
        layer.confirm('确认要启用吗？',function(index){

            updateAdminRole({"id":id,"roleState":1});
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,'+id+')" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!',{icon: 6,time:1000});
            //alert(n);
            /*if (n == -1){
                layer.msg('不能启用!',{icon: 5,time:1000});
                n = 0;
            }*/
           /* if (n>0){
                $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,'+id+')" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
                $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
                $(obj).remove();
                layer.msg('已启用!',{icon: 6,time:1000});
                n = 0;
            }*/

        });
    }
    function selectAllAdminRole(){
        $.ajax({
            url: '/selectAllAdminRole.do',
            type: 'post',  // 请求类型
            //data: param,  // post时请求体
            dataType: 'json',  // 返回请求的类型，有text/json两种
            async: true,   // 是否异步
            /*  cache: true,   // 是否缓存 */
            timeout:null,  // 设置请求超时
            contentType: 'application/x-www-form-urlencoded',
            success:function(data){
                var str="";
                var state="";
                var spanclass="";
                var statecontent="";
                $("#count").html("共：<b>"+data.length+"</b>条");
                $.each(data, function (index,element) {
                    if (element.roleState==1){
                        state="已启用";
                        spanclass="label label-success radius";
                        statecontent="<a onClick='member_stop(this,"+element.id+")'  href='javascript:;' title='停用'  class='btn btn-xs btn-success'><i class='icon-ok bigger-120'></i>";
                    }
                    if (element.roleState==0){
                        state="已停用";
                        spanclass="label label-defaunt radius";
                        statecontent="<a onClick='member_start(this,"+element.id+")'  href='javascript:;' title='启用'  class='btn btn-xs '><i class='icon-ok bigger-120'></i>";
                    }
                    str+="<tr><td><label><input type='checkbox' class='ace'><span class='lbl'></span></label></td>";
                    str+="<td>"+element.roleCode+"</td><td>"+element.name+"</td><td class='td-status'><span class='"+spanclass+"'>"+state+"</span></td>";
                    str+="<td class='td-manage'>"+statecontent+"</a>";
                    str+="<a title='用户组详情' href='user-group-list.jsp?roleId="+element.id+"' class='btn btn-xs btn-info Refund_detailed'>用户组详情</a>";
                    str+="<a title='修改权限' href='javascript:;'  onclick='member_edit("+element.id+")' class='btn btn-xs btn-warning'>修改权限</a></td></tr>";
                });
                $("#tbody").html(str);
                //console.log(data)
            }
        });
    }
    function updateAdminRole(param){
        // $.ajax({
        //     url: '/selectAdminByAdminRole.do',
        //     type: 'post',  // 请求类型
        //     data: {"roleId":id},  // post时请求体
        //     dataType: 'json',  // 返回请求的类型，有text/json两种
        //     async: true,   // 是否异步
        //     /*  cache: true,   // 是否缓存 */
        //     timeout:null,  // 设置请求超时
        //     contentType: 'application/x-www-form-urlencoded',
        //     success:function(data){
        //         //alert(data.length)
        //         if (data.length)
        //     }
        // });
        $.ajax({
            url: '/updateAdminRole.do',
            type: 'post',  // 请求类型
            data: param,  // post时请求体
            dataType: 'json',  // 返回请求的类型，有text/json两种
            async: true,   // 是否异步
            /*  cache: true,   // 是否缓存 */
            timeout:null,  // 设置请求超时
            contentType: 'application/x-www-form-urlencoded',
            success:function(data){
                n1 = data;
                console.log("进来了");
                console.log(n1);
            }
        });
        return n1;
    }
</script>


<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/style.css"/>
    <link rel="stylesheet" href="assets/css/ace.min.css" />
    <link rel="stylesheet" href="assets/css/font-awesome.min.css" />
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/H-ui.js"></script>
    <script type="text/javascript" src="js/H-ui.admin.js"></script>
    <script src="assets/layer/layer.js" type="text/javascript" ></script>
    <title>航班动态信息</title>
</head>

<body>
<div class="page-content clearfix">
    <div id="Member_Ratings">
        <div class="d_Confirm_Order_style">

            <div class="table_menu_list" style="margin-top:20px;">
                <table class="table table-striped table-bordered table-hover" id="sample-table">
                    <thead>
                    <tr>
                        <th ><label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span></label></th>
                        <th >ID</th>
                        <th >接口名称</th>
                        <th >接口地址</th>
                        <th >更新时间</th>
                        <th >采集状态</th>
                        <th width="140">操作</th>
                    </tr>
                    </thead>
                    <tbody id="port">

                    <tr>
                        <td><label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span></label></td>
                        <td>001</td>
                        <td>机场信息系统集成API</td>
                        <td>www.jichanginfo.com</td>
                        <td>2016-6-11 11:11</td>
                        <td class="td-status"><span class="label label-success radius">自动</span></td>
                        <td class="td-manage"><a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
                    </tr>

                    </tbody>
                </table>
                <div style=" float:right; margin-right:20px;">
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <li> <a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
                            <li class="active" ><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li> <a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
<script>

    /*初始化数据*/
   window.onload=function () {
        $.ajax({
            url:"/conllection.do",
            success:function(data){
                var html="";
                $.each(data,function (index,port) {
                    html+="";
                    html2="<span class=\"label label-success radius\">自动</span>";
                    html3="<span class=\"label label-defaunt radius\">已停用</span>";
                    if(port.portStatus=='自动'){
                        html+="<tr>\n" +
                            "                        <td><label>\n" +
                            "                            <input type=\"checkbox\" class=\"ace\">\n" +
                            "                            <span class=\"lbl\"></span></label></td>\n" +
                            "                        <td>"+port.id+"</td>\n" +
                            "                        <td>"+port.name+"</td>\n" +
                            "                        <td>"+port.url+"</td>\n" +
                            "                        <td>"+port.updataTime+"</td>\n" +
                            "                        <td class=\"td-status\">"+html2+"</span></td>\n" +
                            "                        <td class=\"td-manage\"><a onClick=\"member_stop(this,"+port.id+")\"  href=\"javascript:;\" title=\"停用\"  class=\"btn btn-xs btn-success\"><i class=\"icon-ok bigger-120\"></i></a> <a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+port.id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>\n" +
                            "                    </tr>";
                    }
                    if(port.portStatus=='已停用'){
                        html+="<tr>\n" +
                            "                        <td><label>\n" +
                            "                            <input type=\"checkbox\" class=\"ace\">\n" +
                            "                            <span class=\"lbl\"></span></label></td>\n" +
                            "                        <td>"+port.id+"</td>\n" +
                            "                        <td>"+port.name+"</td>\n" +
                            "                        <td>"+port.url+"</td>\n" +
                            "                        <td>"+port.updataTime+"</td>\n" +
                            "                        <td class=\"td-status\">"+html3+"</span></td>\n" +
                            "                        <td class=\"td-manage\"><a style=\"text-decoration:none\" class=\"btn btn-xs \" onClick=\"member_start(this,"+port.id+")\" href=\"javascript:;\" title=\"启用\"><i class=\"icon-ok bigger-120\"></i></a><a title=\"删除\" href=\"javascript:;\"  onclick=\"member_del(this,"+port.id+")\" class=\"btn btn-xs btn-warning\" ><i class=\"icon-trash  bigger-120\"></i></a></td>\n" +
                            "                    </tr>";
                    }




                })
                $('#port').html(html);
            }
        });
    }

    /*-删除*/
    function member_del(obj,id){
        alert('id'+id);
        layer.confirm('确认要删除吗？',function(index){
            $(obj).parents("tr").remove();
            $.ajax({
                url:'/delPortStarusById.do',
                method:'post',
                data:{id:id},
                success:function (data) {
                    console.log(data);
                }
            })
            layer.msg('已删除!',{icon:1,time:1000});
        });
    }


    /*-停用*/
    function member_stop(obj,id){
        layer.confirm('确认要停用吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
            $(obj).remove();
            $.ajax({
                url:'/updataPortStatus.do',
                method:'post',
                data:{id:id,portStatus:'已停用'},
                success:function (data) {
                    if(data>0){
                        layer.msg('已停用!',{icon: 5,time:1000});
                    }
                    if(data<=0){
                        layer.msg('停用失败!',{icon: 5,time:1000});
                    }
                }
            })

        });
    }

    /*-启用*/
    function member_start(obj,id){
        layer.confirm('确认要启用吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">自动</span>');
            $(obj).remove();
            $.ajax({
                url:'/updataPortStatus.do',
                method:'post',
                data:{id:id,portStatus:'自动'},
                success:function (data) {
                    if(data>0){
                        layer.msg('已启用!',{icon: 6,time:1000});
                    }
                    if(data<=0){
                        layer.msg('启用失败!',{icon: 5,time:1000});
                    }
                }
            })

        });
    }
</script>

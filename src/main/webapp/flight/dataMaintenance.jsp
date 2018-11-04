<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="../common/css/pagination.css" media="screen">
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css" />
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css" />
    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/H-ui.js"></script>
    <script type="text/javascript" src="../js/H-ui.admin.js"></script>
    <script src="../assets/layer/layer.js" type="text/javascript" ></script>

    <script src="../common/js/highlight.min.js"></script>
    <!-- <script src="../My97DatePicker/WdatePicker.js"></script> -->
    <script src="../common/js/jquery.pagination.js"></script>

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
                        <th >备份名称</th>
                        <th >操作时间</th>
                        <th >状态</th>
                        <th width="140">操作</th>
                    </tr>
                    </thead>
                    <tbody id="tbody">
                    <%--<tr>
                        <td><label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span></label></td>
                        <td>001</td>
                        <td>机场信息系统集成API</td>
                        <td>2016-6-11 11:11</td>
                        <td class="td-status"><span class="label label-success radius">自动</span></td>
                        <td class="td-manage"><a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
                    </tr>--%>
                    <%--<tr>
                        <td><label>
                            <input type="checkbox" class="ace">
                            <span class="lbl"></span></label></td>
                        <td>002</td>
                        <td>安检系统</td>
                        <td>www.anjian.com</td>
                        <td>2017-2-11 17:23</td>
                        <td class="td-status"><span class="label label-success radius">自动</span></td>
                        <td class="td-manage"><a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
                    </tr>--%>
                    </tbody>
                </table>
                <div class="m-style page"></div>
                <%--<div style=" float:right; margin-right:20px;">
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
                </div>--%>
            </div>
        </div>
    </div>
</div>

</body>
<div id="Searchresult"></div>
<div id="hiddenresult"></div>
<div id="Pagination" class="m-style pagination">
    <!-- 这里显示分页 -->
</div>
</html>
<script>
    var arr;
    var ss=2;
    $().ready(function() {
        selectAllBackUp();
    });
    /*-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            $(obj).parents("tr").remove();
            layer.msg('已删除!',{icon:1,time:1000});
        });
    }


    /*-停用*/
    function member_stop(obj,id){
        var name=$("#name"+id).text();
        $.ajax({
            url: '/restoreMysql.do',
            type: 'post',  // 请求类型
            data: {"name":name,"id":id},  // post时请求体
            dataType: 'json',  // 返回请求的类型，有text/json两种
            async: true,   // 是否异步
            /*  cache: true,   // 是否缓存 */
            timeout: null,  // 设置请求超时
            contentType: 'application/x-www-form-urlencoded',
            success: function (data) {
                if (data==0){
                    layer.msg('还原失败!',{icon: 5,time:1000});
                } else{
                    $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="已还原"><i class="icon-ok bigger-120"></i></a>');
                    $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已还原</span>');
                    $(obj).remove();
                    layer.msg('已还原!',{icon: 5,time:1000});
                }
            }
        });
        // layer.confirm('确认要停用吗？',function(index){
        //     $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
        //     $(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
        //     $(obj).remove();
        //     layer.msg('已停用!',{icon: 5,time:1000});
        // });
    }

    /*-启用*/
    function member_start(obj,id){
        layer.confirm('确认要启用吗？',function(index){
            $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">自动</span>');
            $(obj).remove();
            layer.msg('已启用!',{icon: 6,time:1000});
        });
    }

    function selectAllBackUp(){
        $.ajax({
            url: '/selectAllBackUp.do',
            type: 'post',  // 请求类型
            //data: param,  // post时请求体
            dataType: 'json',  // 返回请求的类型，有text/json两种
            async: true,   // 是否异步
            /*  cache: true,   // 是否缓存 */
            timeout:null,  // 设置请求超时
            contentType: 'application/x-www-form-urlencoded',
            success:function(data){
                // if (data[1]!=null&&data[1]!=0){
                //     $("#count").html("共：<b>"+data[1]+"</b>条");
                // }
                var html="";
                if (data!=null&&data.length!=0){
                    arr = data;
                    initPagination(arr,ss);
                }else{
                    $("#tbody").html("<tr><td colspan='11' style='text-align: center;'>没有查询到符合条件的数据</td></tr>");
                    $(".page").hide();
                    $("#count").html("共：<b>0</b>条");
                }

                //initPagination(arr,ss);
                //console.log(data)
            }
        });
    }
    function pageselectCallback(api){
        var currentPage=api.getCurrent();
        var beginRows=(currentPage-1)*ss;
        var endRows=currentPage*ss-1;
        var html;
        $.each(arr, function (index,element) {
            if (element.backupState==1) {
                state="已备份"
                spanclass="label label-success radius";
                statecontent="<td class='td-manage'><a onClick='member_stop(this,"+element.id+")'  href='javascript:;' title='还原'  class='btn btn-xs btn-success'><i class='icon-ok bigger-120'></i></a></tr>";
            }
            if (element.backupState==0) {
                state="已还原"
                spanclass="label label-defaunt radius";
                statecontent="<td class='td-manage'></td></tr>";
            }
            /*<td class="td-manage"><a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a></td>
            </tr>*/

            if(index>=beginRows&&index<=endRows){
                html+="<tr><td><label><input type='checkbox' class='ace'><span class='lbl'></span></label></td>";
                html+="<td>"+element.id+"</td><td id='name"+element.id+"'>"+element.name+"</td><td>"+element.addTime+"</td><td class='td-status'><span class='"+spanclass+"'>"+state+"</span></td>";
                html+=statecontent;
            }
        });
        $("#tbody").html(html);
    }

    function init(arr,rows){
        var html="";
        $.each(arr, function (index,element) {
            if (element.backupState==1) {
                state="已备份"
                spanclass="label label-success radius";
                statecontent="<td class='td-manage'><a onClick='member_stop(this,"+element.id+")'  href='javascript:;' title='还原'  class='btn btn-xs btn-success'><i class='icon-ok bigger-120'></i></a></tr>";
            }
            if (element.backupState==0) {
                state="已还原"
                spanclass="label label-defaunt radius";
                statecontent="<td class='td-manage'></td></tr>";
            }
            if(index>=0&&index<=rows-1){
                html+="<tr><td><label><input type='checkbox' class='ace'><span class='lbl'></span></label></td>";
                html+="<td>"+element.id+"</td><td id='name"+element.id+"'>"+element.name+"</td><td>"+element.addTime+"</td><td class='td-status'><span class='"+spanclass+"'>"+state+"</span></td>";
                html+=statecontent;
            }
        });
        $("#tbody").html(html);
    }

    var initPagination = function(data,rows) {
        if(data!=null&&data.length!=0){
            $('.page').pagination({
                totalData: data.length,
                callback:pageselectCallback,
                showData: rows,
                jump: true,
                coping: true,
                homePage: '首页',
                endPage: '末页',
                prevContent: '上页',
                nextContent: '下页',
                isHide:true,
                mode: 'fixed',
                count:data.length
            },init(data,rows));
        }else{
            $("#tbody").html("<tr><td colspan='8' style='text-align: center;'>没有查询到符合条件的数据</td></tr>");
            $(".page").hide();
        }

    }

</script>

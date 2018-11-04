<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="../css/style.css"/>
    <link rel="stylesheet" href="../assets/css/ace.min.css" />
    <script src="../assets/dist/echarts.js"></script>
    <script src="../js/jquery-2.1.1.js"></script>
    <script src="../js/jquery.jqprint-0.3.js"></script>
    <script language="javascript" src="../lodop/LodopFuncs.js"></script>
    <title>无标题文档</title>

</head>
<script>

    jQuery(document).ready(function(){
        $(document).on('click','.iframeurl',function(){
            var cid = $(this).attr("name");
            $("#iframe").attr("src",cid).ready();
        });
    });

</script>
<body>
<div  style="height:auto; width:100%; border-bottom:1px solid #DDD; ">
    <form id="search_form1">
        <div class="search_style">
            <ul class="search_content clearfix" >
                <li>
                    <label class="l_f">起始时间：</label>
                    <input id="J-xl" name="startDate"  type="date"   style=" margin-left:10px;" onchange="getStartDate()">
                </li>
                <li>
                    <label class="l_f">结束时间：</label>
                    <input id="J-xl2" name="endDate" class=" "  type="date"   style=" margin-left:10px;" onchange="getEndDate()">
                </li>
                <li style="width:90px;">
                    <button type="button" class="btn_search" onclick="search_flight1()"><i class="icon-search"></i>查询</button>
                </li>
                <li style="width:130px;">
                    <button type="button" class="btn-warning btn" onclick="dayin()" > &nbsp;打印图表数据</button>
                </li>
            </ul>
        </div>
        <div class="search_style">
            <ul class="search_content clearfix" >
                <li>
                    <label class="l_f">任务性质：</label>
                    <select name="" style="width:90px">
                        <option>--所有--</option>
                        <option>训练</option>
                        <option>正班</option>
                        <option>返航</option>
                        <option>加班</option>
                    </select>
                </li>
                <li>
                    <label class="l_f">国内/外航班：</label>
                    <select name="" style="width:110px">
                        <option>国内航班</option>
                        <option>国外航班</option>
                    </select>
                </li>
                <li>
                    <label class="l_f">始发/非始发航班：</label>
                    <select name="" style="width:110px">
                        <option>始发航班</option>
                        <option>非始发航班</option>
                    </select>
                </li>

            </ul>
        </div>
    </form>
</div>
<div style="margin-top:10px;">
    <p style=" display:inline-block; width:50%; font-size:16px; font-weight:bolder; line-height:30px; margin-bottom:20px; float:left;"> 航班总架次：<span style=" color:#06C; font-style:italic;" id="flights"></span><p>
    <p style=" display:inline-block; width:50%; font-size:16px; font-weight:bolder; line-height:30px; margin-bottom:20px;">延误次架：<span style=" color:#06C; font-style:italic;" id="delayed"></span></p>
    <div id="main3">
    <div id="main1" style="height:300px; overflow:hidden; width:50%; overflow:auto; float:left;" ></div>
    <div id="main2" style="height:300px; overflow:hidden; width:50%; overflow:auto; float:left;" ></div>
    </div>
</div>
</body>

<script type="text/javascript">


    var nomal = 0;
    var noNomal=0;
    var base64 = '';
    var base644 = '';

function dayin() {
    var LODOP=getLodop();

    LODOP.ADD_PRINT_IMAGE()
    var strBASE64Code=base64;
    LODOP.ADD_PRINT_IMAGE(100,100,"100%","100%",strBASE64Code);
    LODOP.PREVIEW();



}


</script><script>
    /*查询*/
    function search_flight1(){
        var start = $('#J-xl');
        var end = $('#J-xl2');
        // var date3 = new Date(start.val());
        // var date4 = new Date(end.val());
        // var weekArr = [ '星期天','星期一', '星期二', '星期三', '星期四', '星期五', '星期六'];
        // var week = weekArr[date3.getDay()];
        // var week2 = weekArr[date4.getDay()];
        // if(date4.getTime()-date3.getTime()==518400000&&week=="星期一"&&week2=="星期天"){
        //     console.log('yes');
        // }else{
        //     console.log('no');
        // }


        $.ajax({
            type:"post",
            url:"/getFlightReportDayDaoNormal.do",
            data:{startDate:start.val(),endDate:end.val()},
            dataType:"json",
            async:false,
            success:function(data){
                $.each(data,function (index,values) {
                    // values.flights;
                    nomal = values.normalFlights;
                    noNomal = values.flights-values.normalFlights;
                    $('#flights').html(values.flights+"次");
                    $('#delayed').html(noNomal+"次");
                    console.log(nomal);
                })
                require.config({
                    paths: {
                        echarts: './assets/dist'
                    }
                });
                require(
                    [
                        'echarts',
                        'echarts/chart/pie',   // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
                        'echarts/chart/funnel'
                    ],
                    function (ec) {
                        var myChart = ec.init(document.getElementById('main1'));

                        option = {
                            title : {
                                text: '航班正常性统计',
                                subtext: '',
                                x:'center'
                            },
                            tooltip : {
                                trigger: 'item',
                                formatter: "{a} <br/>{b} : {c} ({d}%)"
                            },
                            legend: {
                                orient : 'vertical',
                                x : 'left',
                                data:['正常航班','非正常航班']
                            },
                            toolbox: {
                                show : false,

                            },
                            calculable : true,
                            series : [
                                {

                                    type:'pie',
                                    radius : '55%',
                                    center: ['50%', '60%'],
                                    data:[
                                        {value:nomal, name:'正常航班'},
                                        {value:noNomal, name:'非正常航班'},

                                    ]
                                }
                            ]
                        };
                        myChart.setOption(option);
                    }
                );
            }
        })
        // $("#search_form1").submit();
    }

    console.log(nomal);
    // require.config({
    //     paths: {
    //         echarts: './assets/dist'
    //     }
    // });
    //
    // // 使用
    // require(
    //     [
    //         'echarts',
    //         'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载
    //     ],
    //     function (ec) {
    //         // 基于准备好的dom，初始化echarts图表
    //         var myChart = ec.init(document.getElementById('main2'));
    //
    //         var option = {
    //             title : {
    //                 text: '旅行不正常原因占比',
    //                 subtext: ' '
    //             },
    //             tooltip : {
    //                 trigger: 'axis'
    //             },
    //
    //
    //             calculable : true,
    //             xAxis : [
    //                 {
    //                     type : 'category',
    //                     data : ['天气','公司','旅客','军事' ]
    //                 }
    //             ],
    //             yAxis : [
    //                 {
    //                     type : 'value'
    //                 }
    //             ],
    //             series : [
    //                 {
    //                     name:'旅行不正常原因占比',
    //                     type:'bar',
    //                     data:[20, 70, 70, 23 ],
    //                     markPoint : {
    //                         data : [
    //                             {type : 'max', name: '最大值'}
    //                         ]
    //                     },
    //                     markLine : {
    //                         data : [
    //                             {type : 'average', name: '平均值'}
    //                         ]
    //                     }
    //                 },
    //
    //             ]
    //         };
    //         // 为echarts对象加载数据
    //         myChart.setOption(option);
    //     }
    // );



    //判断时间
    function getStartDate() {
        var date = new Date();
        var year = date.getFullYear() // 年
        var month = date.getMonth() + 1; // 月
        var day  = date.getDate(); // 日


        //获得当前日期的毫秒数-一天的毫秒数得到
        var date2 = new Date(date.getTime()-86400000);
        var year2 = date2.getFullYear() // 年
        var month2 = date2.getMonth() + 1; // 月
        var day2  = date2.getDate(); // 日


        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (day >= 0 && day <= 9) {
            day = "0" + day;
        }

        if (month2 >= 1 && month2 <= 9) {
            month2 = "0" + month2;
        }
        if (day2 >= 0 && day2 <= 9) {
            day2 = "0" + day2;
        }

        var dates = year+"-"+month+"-"+day;
        var dates2 = year2+"-"+month2+"-"+day2;



        var start  = $('#J-xl');

        if(start.val()==dates){
            alert("不能查询今日");
            start.val(dates2);
        }else if(start.val()>=dates){
            alert("不能查询超过今日的");
            start.val(dates2);
        }


    }


    function getEndDate() {
        var date = new Date();
        var year = date.getFullYear() // 年
        var month = date.getMonth() + 1; // 月
        var day  = date.getDate(); // 日


        //获得当前日期的毫秒数-一天的毫秒数得到
        var date2 = new Date(date.getTime()-86400000);
        var year2 = date2.getFullYear() // 年
        var month2 = date2.getMonth() + 1; // 月
        var day2  = date2.getDate(); // 日


        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (day >= 0 && day <= 9) {
            day = "0" + day;
        }

        if (month2 >= 1 && month2 <= 9) {
            month2 = "0" + month2;
        }
        if (day2 >= 0 && day2 <= 9) {
            day2 = "0" + day2;
        }

        var dates = year+"-"+month+"-"+day;
        var dates2 = year2+"-"+month2+"-"+day2;


        var end = $('#J-xl2');

        if(end.val()==dates){
            alert("不能查询今日");
            end.val(dates2);
        }else if(end.val()>=dates){
            alert("不能查询超过今日的");
            end.val(dates2);
        }else if(end.val()<start.val()){
            alert("结束日期不能小于起始日期");
        }
    }
    window.onload=function () {
        $.ajax({
            type:"post",
            url:"/getFlightReportDayDate.do",
            dataType:"json",
            async:false,
            success:function (data) {
                // $('#normal').value(data.normalFlights);
                console.log(data);
                nomal = data.normalFlights;
                noNomal = data.flights-data.normalFlights;
                $('#flights').html(data.flights+"次");
                $('#delayed').html(noNomal+"次");
                require.config({
                    paths: {
                        echarts: '/assets/dist'
                    }
                });
                require(
                    [
                        'echarts',
                        'echarts/chart/pie',   // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
                        'echarts/chart/funnel'
                    ],
                    function (ec) {
                        var myChart = ec.init(document.getElementById('main1'));

                        option = {
                            title : {
                                text: '航班正常性统计',
                                subtext: '',
                                x:'center'
                            },
                            tooltip : {
                                trigger: 'item',
                                formatter: "{a} <br/>{b} : {c} ({d}%)"
                            },
                            legend: {
                                orient : 'vertical',
                                x : 'left',
                                data:['正常航班','非正常航班']
                            },
                            toolbox: {
                                show : false,

                            },
                            calculable : true,
                            series : [
                                {

                                    type:'pie',
                                    radius : '55%',
                                    center: ['50%', '60%'],
                                    data:[
                                        {value:nomal, name:'正常航班'},
                                        {value:noNomal, name:'非正常航班'},

                                    ]
                                }
                            ]
                        };
                        myChart.setOption(option);
                        base644 = myChart.getDataURL();
                    }
                );

            }
        })


        var weather = 0;
        var flight = 0;
        var passenger = 0;
        var military = 0;
        $.ajax({
            type:"post",
            url:"/getdelayRemark.do",
            dataType:"json",
            success:function (data) {
                $.each(data,function (index,values) {
                    if(index=='weather'){
                        weather = values;
                        console.log(weather);
                    }
                    if(index=='flight'){
                        flight = values;
                        console.log(flight);
                    }
                    if(index=='passenger'){
                        passenger = values;
                        console.log(passenger);
                    }
                    if(index=='military'){
                        military = values;
                        console.log(military);
                    }
                })
                require.config({
                    paths: {
                        echarts: '/assets/dist'
                    }
                });

                // 使用
                require(
                    [
                        'echarts',
                        'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载
                    ],
                    function (ec) {
                        // 基于准备好的dom，初始化echarts图表
                        var myChart = ec.init(document.getElementById('main2'));

                        var option = {
                            title : {
                                text: '旅行不正常原因占比',
                                subtext: ' '
                            },
                            tooltip : {
                                trigger: 'axis'
                            },


                            calculable : true,
                            xAxis : [
                                {
                                    type : 'category',
                                    data : ['天气','公司','旅客','军事' ]
                                }
                            ],
                            yAxis : [
                                {
                                    type : 'value'
                                }
                            ],
                            series : [
                                {
                                    name:'旅行不正常原因占比',
                                    type:'bar',
                                    data:[weather, flight, passenger, military ],
                                    markPoint : {
                                        data : [
                                            {type : 'max', name: '最大值'}
                                        ]
                                    },
                                    markLine : {
                                        data : [
                                            {type : 'average', name: '平均值'}
                                        ]
                                    }
                                },
                            ]
                        };
                        // 为echarts对象加载数据
                        myChart.setOption(option);
                        base64=myChart.getDataURL();
                    }
                );

            }
        })
    }

    console.log(nomal);

</script>


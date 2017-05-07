<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <script src="https://code.jquery.com/jquery-1.8.3.min.js"></script>
    <script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
    <script>
        $(document).ready(function () {
            $("#5").click(function() {
                var date = $("#4").val()
                console.log(date)
                $.ajax({
                    type: 'POST',
                    url: "./MasterCommit",
                    data: date,
                    success: function (data) {
                        console.log("data :" + data)
                        $("#6").html(data)
                        $("#6").show()
                    }
                })
            })
            $("#6").click(function(){
                $("#6").hide()
            })
        })
    </script>
    <!-- <script src="https://img.hcharts.cn/highchart/modules/exporting.js"></script> -->
    <title></title>
</head>

<body>
<form action="./option">
    <input type="submit" value="back">
    date:<input type="date" name="commit" id="4">
    <button type="button" id="5">commit</button>
</form>
<div id="6"></div>
<div id="container0" style="min-height: 300px;height: 300px"></div>
<div id="container1" style="min-height: 300px;height: 300px"></div>
<div id="container2" style="min-height: 300px;height: 300px"></div>
<script>
    $(function() {
        $('#container0').highcharts({
            title: {
                text: 'Loopback Mergeable Throuphput',
                x: -20 //center
            },
//            subtitle: {
//                text: 'throughput in mergeable path',
//                x: -20
//            },
            xAxis: {
                title: {
                    text: 'date'
                },
                categories: ${date}
            },
            yAxis: {
                title: {
                    text: 'Throughput(Mpps)'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            },
            tooltip: {
                valueSuffix: 'Mpps'
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            series: [{
                name: '64B',
                data: ${mer64}
            },{
                name: '128B',
                data: ${mer128}
            },{
                name: '256B',
                data: ${mer256}
            }]
        });
        $('#container1').highcharts({
            title: {
                text: 'Loopback No-mergeable Throuphput',
                x: -20 //center
            },
//            subtitle: {
//                text: 'throughput in normal path',
//                x: -20
//            },
            xAxis: {
                title: {
                    text: 'date'
                },
                categories: ${date}
            },
            yAxis: {
                title: {
                    text: 'Throughput(Mpps)'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            },
            tooltip: {
                valueSuffix: 'Mpps'
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            series: [{
                name: '64B',
                data: ${nor64}
            },{
                name: '128B',
                data: ${nor128}
            },{
                name: '256B',
                data: ${nor256}
            }]
        });
        $('#container2').highcharts({
            title: {
                text: 'Loopback Vector Throuphput',
                x: -20 //center
            },
//            subtitle: {
//                text: 'throughput in vector path',
//                x: -20
//            },
            xAxis: {
                title: {
                    text: 'date'
                },
                categories: ${date}
            },
            yAxis: {
                title: {
                    text: 'Throughput(Mpps)'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            },
            tooltip: {
                valueSuffix: 'Mpps'
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            },
            series: [{
                name: '64B',
                data: ${vec64}
            },{
                name: '128B',
                data: ${vec128}
            },{
                name: '256B',
                data: ${vec256}
            }]
        });
    });
</script>
</body>

</html>


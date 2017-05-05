<%--
  Created by IntelliJ IDEA.
  User: mengleil
  Date: 4/10/2017
  Time: 2:22 PM
  To change this template use File | Settings | File Templates.
--%>
<html>

<head>
    <title>options date</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.4.1.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        $("#3").click(function() {
            var start = $("#1").val()
            var end = $("#2").val()
            if (end == "") {
                if (stime == "") {
                    $("form").submit()
                } else {
                    var s = new Date(stime[0], stime[1], stime[2])
                    if (s >= new Date().getTime()) {
                        alert("start time is future")
                        return false
                    } else {
                        $("form").submit()
                    }
                }
            }
            if (start != "") {
                var stime = start.split("-")
                var etime = end.split("-")
                var s = new Date(stime[0], stime[1], stime[2])
                var e = new Date(etime[0], etime[1], etime[2])
                if (s.getTime() > e.getTime()) {
                    alert("start time is more than end time")
                    return false
                } else {
                    $("form").submit()
                }
            }
        })
    })
    </script>
    <style type="text/css">
    div {
        text-align: center;
    }
    
    #p1 {
        margin: 0 auto;
        text-align: center;
    }
    
    #in1{
        width: 20%;
        height: 5%;
    }

    table {
        text-align: center;
        border: 1px solid;
    }
    
    td,
    tr {
        border: 1px solid;
    }
    </style>
</head>

<body>
    <div>
        <div>
            <h1>Vhost/Virtio Performance Daily Trace System</h1>
        </div>
        <div>
            <p>check today performance compare with before </p> 
            <form action="./table">
                <input id="in1" type="submit" value="compare with  based release">
            </form>
        </div>
        <p>please select StartDate and EndDate</p>
        <form action="./hchart">
            Start Date:
            <input type="date" name="startDate" id="1" /> End Date:
            <input type="date" name="endDate" id="2" />
            <input type="submit" value="select time" id="3">
        </form>
    </div>
    <div>
        <p id="p1">
            Test Bench info:
            <table align="center">
                <tr>
                    <td>CPU</td>
                    <td>Intel(R) Xeon(R) CPU E5-2699 v3 @ 2.30GHz</td>
                </tr>
                <tr>
                    <td>Host OS</td>
                    <td>Ubuntu 16.10 Server Edition</td>
                </tr>
                <tr>
                    <td>Kernel</td>
                    <td>4.8.0</td>
                </tr>
                <tr>
                    <td>Gcc Version</td>
                    <td>6.2.0 20161005</td>
                </tr>
                <tr>
                    <td>Qemu Version</td>
                    <td>2.8.0</td>
                </tr>
                <tr>
                    <td>Forward Mode</td>
                    <td>MAC fwd</td>
                </tr>
            </table>
        </p>
    </div>
</body>

</html>

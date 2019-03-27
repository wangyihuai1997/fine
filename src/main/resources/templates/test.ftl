<html style="width: 100%;height: 100%;">
<head>
    <title>home</title>
</head>
<body style="height: 100%;width: 100%;">
<iframe style="width: 100%;height: 50%;"
        src="http://localhost:8080/fine_war_exploded/decision/view/report?viewlet=biz_bi/区域地图.frm"></iframe>
<div>
    start<input type="text" id="start">
    end<input type="text" id="end">
    <button id="sub">提交</button>
</div>
<iframe id="ifff" style="width: 100%;height: 50%"
        src="http://localhost:8080/fine_war_exploded/decision/view/report?viewlet=biz_bi/本区月度周报.cpt&index=0&length=10"></iframe>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
    $(function () {
        $("#sub").click(function () {
            var start = $("#start").val();
            var end = $("#end").val();
            console.debug(start);
            console.debug(end);
            $("#ifff").attr('src', 'http://localhost:8080/fine_war_exploded/decision/view/report?viewlet=biz_bi/本区月度周报.cpt&index=' + start + '&length=' + end);
        });
    });

</script>
</body>
</html>
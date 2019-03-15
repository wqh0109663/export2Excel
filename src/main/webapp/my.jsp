<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<input type="checkbox" name="List_Selected" value="1696163291be03809a473504a04ba81c">
<input type="checkbox" name="List_Selected" value="16957182d7b6574450f50c04f77a64ec">
<input type="checkbox" name="List_Selected" value="169502dd1b84bd5343bf148494390627">
<input type="checkbox" name="List_Selected" value="1694d3515bb80efc048f2aa4c49befca">
<button type="button" name="btn" onclick="check()">提交</button>

<script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
    function check() {
        var employee = [];
        $('input[name="List_Selected"]:checked').each(
            function () {
                var value = $(this).val();
                employee.push(value);
            });

        window.location.href="${pageContext.request.contextPath}/download?employee="+employee;
    }
</script>
</body>
</html>

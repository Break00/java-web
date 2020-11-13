<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/13
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js-css-jquery/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(function () {
            // $.ajax({
            //     type: "POST",
            //     url: "AjaxServlet",
            //     data: "name=lee&age=18",
            //     success: function (msg) {
            //         alert(msg);
            //     }
            // });
            // Ajax简写方式
            $.post("AjaxServlet", "name=lee&age=18", function (msg) {
                alert(msg);
            });
        })
    </script>
</head>
<body>

</body>
</html>

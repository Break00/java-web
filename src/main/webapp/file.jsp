<%--
  Created by IntelliJ IDEA.
  User: huanli9
  Date: 2020/11/11
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int i = 1 + 2;
%>
1 + 2 = <%=i%>
这是file页面
<%--参数来源：<%=request.getParameter("from")%>--%>

application:<%=application.getAttribute("name")%>
session:<%=session.getAttribute("name")%>
request:<%=request.getAttribute("name")%>
pageContext:<%=pageContext.getAttribute("name")%>

</body>
</html>

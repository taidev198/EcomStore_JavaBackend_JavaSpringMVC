<%--
  Created by IntelliJ IDEA.
  User: nguyenthanhtai
  Date: 6/1/24
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Online Shopping Mall</title>
    <jsp:include page="layout/head.jsp"/>
    <tiles:insertAttribute name="head"/>
</head>
<body>

<div class="container">
<%--    class="row" is spilit to row--%>
   <header class="row">
       <h1 class="alert alert-success">Online shopping mall</h1>
   </header>
    <nav class="row">
        <tiles:insertAttribute name="menu"/>
    </nav>
    <div class="row">
        <article class="col-sm-9">
            <tiles:insertAttribute name="body"/>
        </article>
        <aside class="col-sm-3">
            <tiles:insertAttribute name="aside"/>
        </aside>
    </div>
    <footer class="row">
        <p>@copyright 2024</p>
    </footer>
</div>

</body>
</html>

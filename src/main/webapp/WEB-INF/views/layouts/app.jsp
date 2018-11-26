<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>电商|SpringShop <rapid:block name="title"></rapid:block></title>
    <!-- 样式 -->
    <link href="/statics/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/statics/css/common.css" rel="stylesheet">
    <rapid:block name="head"></rapid:block>
</head>
<body>
<jsp:include page="layouts/_header.jsp" flush="true"></jsp:include>
<div class="container">
    <rapid:block name="content">app_content</rapid:block>
</div>
<jsp:include page="layouts/_footer.jsp" flush="true"></jsp:include>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="/statics/bootstrap/js/bootstrap.min.js"></script>
<script src="/statics/js/common.js"></script>
<rapid:block name="footer"></rapid:block>
</body>
</html>

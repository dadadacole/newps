<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>현재 날짜 출력</title>
</head>
<body>
<h1>현재 날짜 출력 실습</h1>
<%--    html 코드 내에 자바 코드를 넣어주는 걸 스크립트릿이라 한다--%>

<%
    Date d = new Date();
%>
현재 날짜 : <%= d %>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>session 내장 객체 실습</h1>
<form action="login.jsp" method="get">
    <fieldset>
        <legend>로그인 폼</legend>
        <ul>
            <li>
                <label for="userid">아이디</label>
                <input type="text" id="userid" name="userid">
            </li>
            <li>
                <label for="password">비밀번호</label>
                <input type="password" id="Password" name="Password">
            </li>
            <li><input type="submit" value="전송"></li>
        </ul>
    </fieldset>

</form>

</body>
</html>

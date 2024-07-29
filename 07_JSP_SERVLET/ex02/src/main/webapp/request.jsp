<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인 입력 화면</h1>
<%--action에 있는 경로는 form을 제출할 때 이동할 경로, 상대경로--%>
<%--현재 logInfo.jsp는 이 파일과 같은 폴더에 위치--%>
<%--form의 메소드는 get, post 두 가지이고 get사용시 뒤에 쿼리스트링이 붙는다--%>


<form action="logininfo.jsp" method="get">
<fieldset>
    <legend>로그인 폼</legend>
    <ul>
        <li>
            <label for="userid">아이디</label>
            <input type="text" id="userid" name="userid">
        </li>
        <li>
            <label for="Password">비밀번호</label>
            <input type="password" id="Password" name="Password">
        </li>
        <li><input type="submit" value="전송"></li>
    </ul>
</fieldset>
</form>

</body>
</html>

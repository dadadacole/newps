
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인 정보 세션 저장</h1>
<%
    String id= request.getParameter("userid");
    if(id==null){
        response.sendRedirect("loginForm.html");
    } else {
//        id가 제대로 입력됬을 경우
        String pw = request.getParameter("passwd");
//        session 내에 해당 값들을 저장해둠
        session.setAttribute("userid",id);
        session.setAttribute("Password",pw);
        out.print("안녕하세요"+id+"<br>");
        out.print("<a href='logininfo.jsp'>정보보기</a>");
    }
%>
</body>
</html>
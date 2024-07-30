package org.scoula.ex04;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request_redirect")
public class RequestRedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 속성 설정
        request.setAttribute("username", "홍길동");
        request.setAttribute("useraddress", "서울");

        // redirect
        response.sendRedirect("response_redirect");
    }
}

package org.scoula.ex02;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="MyServlet", urlPatterns={"/xxx", "/yyy"})
public class HelloServlet extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException{
        System.out.println("init 호출");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");

        System.out.println("HelloServlet 요청");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello Servlet</h1>");
    }

    @Override
    public void destroy(){
        System.out.println("destory 호출");
    }

}

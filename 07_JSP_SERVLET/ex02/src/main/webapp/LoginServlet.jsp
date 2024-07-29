@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

    // 요청에서 파라미터 얻기

    String userid = request.getParameter("userid");
    String passwd = request.getParameter("passwd");

    // 응답 내보내기
    response.setContentType("text/html; charset=UTF-8");

    PrintWriter out = response.getWriter();

    out.print("<html></html>
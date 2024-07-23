package ch07.exam;

public class FileDownloadServlet extends HttpServlet {

    //추상 메소드 재정의

    @Override
    public void sound() {
        System.out.println("파일 다운로드합니다");

    }
}

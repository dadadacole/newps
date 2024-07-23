package ch02.sec09;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력:");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);
//        String strY = scanner.nextInt();

        int result = x+y;
        System.out.println("x+y:" + result);
        System.out.println();


        while(true){
            System.out.println("입력 문자열:");
            String data = scanner.nextLine();

            //받아온 strX을 int로 형변환 ( String -> int)
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열:" + data);
            System.out.println();
        }

        System.out.println("종료");

    }
}

//out에다가 입력하면 안됨

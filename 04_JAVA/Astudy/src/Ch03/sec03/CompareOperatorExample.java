package Ch03.sec03;

import java.sql.SQLOutput;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
        System.out.println("result3:" + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1<char2); // A의 아스키코드값 보다 B의 아스키코드값이 크다
        System.out.println("result4:" + result4);

        int num3=1;
        double num4=1.0;
        boolean result5 = (num3 == num4); // double로 변경 되어서 둘 다 같다고 나옴
        System.out.println("result5" + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6:" + result6);
        System.out.println("result7:" + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2)); // false
        boolean result9 = (! str1.equals(str2)); // true
        System.out.println("result8:" + result8);
        System.out.println("result9:" + result9);

    }
}
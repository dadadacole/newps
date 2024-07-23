package ch07.sec10.exam02;

public class notion{
    public static void main(String[] args) {
        //재귀 함수 호출 예제
        int result = factorial(5);
        System.out.println("5!=" + result);
    }

    public static int factorial(int n) {
        //팩토리얼 계산을 재귀적으로 구현한 함수

        if(n ==1){
            return 1;
        }

        return n* factorial(n-1);
    }
}

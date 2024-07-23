package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("-----------");
        z = x++; // x 값을 z에 넣고 x를 1 증가시킨다
        System.out.println("z=" + z);
        System.out.println("x=" + x);


        System.out.println("----------");
        z = ++x;
        System.out.println("z=" + z); // 14
        System.out.println("x=" + x); // 14

        System.out.println("-----------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}







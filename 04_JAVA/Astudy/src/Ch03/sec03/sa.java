package Ch03.sec03;

import java.util.Scanner;

public class sa {
    public static void main(String[] args) {

                int rows = 5; // 출력할 줄 수
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }


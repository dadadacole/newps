package ch12.sec07;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.println("선택번호");
        for(int i=0; i<6; i++){
            selectNumber[i] = random.nextInt(45) +1;
            System.out.println(selectNumber[i] + "");
        }
        System.out.println();

        //당첨번호
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨번호");
        for(int i=0; i<6; i++){
            winningNumber[i] = random.nextInt(45)+1;
            System.out.println(winningNumber[i] + "");
        }
        System.out.println();


    }
}

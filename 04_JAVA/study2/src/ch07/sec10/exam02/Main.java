package ch07.sec10.exam02;



import java.util.List;

public class Main {
    public static void main(String[] args) {
        Combination combination = new Combination();

        int n = 5; // 예시로 n = 5
        int k = 3; // 예시로 k = 3

        List<List<Integer>> combinations = combination.combinationSum(n, k);

        // 결과 출력
        System.out.println("Combinations:");
        for (List<Integer> comb : combinations) {
            System.out.println(comb);
        }
    }
}

package ch07.sec10.exam02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, new ArrayList<>(), n, k, result);
        return result;
    }

    private void backtrack(int start, List<Integer> path, int n, int k, List<List<Integer>> result) {
        // base case
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        // recursive call
        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(i + 1, path, n, k, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combination combination = new Combination();

        int n = 6; // 예시로 n = 5
        int k = 4; // 예시로 k = 3

        List<List<Integer>> combinations = combination.combinationSum(n, k);

        // 결과 출력
        System.out.println("Combinations:");
        for (List<Integer> comb : combinations) {
            System.out.println(comb);
        }
    }
}

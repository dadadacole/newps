package ch07.sec10.exam02;

import java.util.*;

class Combination {
    public List<List<Integer>> combinationSum(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, new ArrayList<>(), n, k, result);
        return result;


    }



    private void backtrack(int start, List<Integer> path, int n, int k, List<List<Integer>> result) {
        //basecase
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        //recursive call
        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(i + 1, path, n, k, result);
            path.remove(path.size() - 1);

        }
    }
}


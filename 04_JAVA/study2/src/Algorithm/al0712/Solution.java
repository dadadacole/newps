package Algorithm.al0712;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int answer = 0;

    public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        boolean[] visited = new boolean[n];
        backtrack(k, visited, n, dungeons, 0);
        return answer;
    }

    public void backtrack(int cur_k, boolean[] visited, int n, int[][] dungeons, int cnt) {
        // base case
        if (cnt > answer) {
            answer = cnt;
        }

        // recursive call
        for (int i = 0; i < n; i++) {
            if (cur_k >= dungeons[i][0] && !visited[i]) {
                visited[i] = true;
                backtrack(cur_k - dungeons[i][1], visited, n, dungeons, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예시로 dungeons 배열 설정
        int[][] dungeons = {
                {2, 5},
                {3, 2},
                {1, 10},
                {4, 3}
        };

        // dungeons 배열을 리스트로 변환
        List<int[]> dungeonsList = new ArrayList<>();
        for (int[] dungeon : dungeons) {
            dungeonsList.add(dungeon);
        }

        int k = 80; // 예시로 k 값 설정

        int maxCnt = solution.solution(k, dungeons);

        // 결과 출력
        System.out.println("Maximum dungeons explored: " + maxCnt);

        // dungeons 리스트 출력
        System.out.println("Dungeons list:");
        for (int[] dungeon : dungeonsList) {
            System.out.println("[" + dungeon[0] + ", " + dungeon[1] + "]");
        }
    }
}

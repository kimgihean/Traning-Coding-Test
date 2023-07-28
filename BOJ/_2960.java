package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _2960 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> nums = new ArrayList<>();

        // 2~n 넣기
        for(int i=2; i <= N; i++) {
            nums.add(i);
        }

        // 가장 작은 수 찾기
        int flag = 0;
        int answer = 0;
        while(!nums.isEmpty()) {
            if(flag == K) break;

            int p = nums.get(0);
            for(int i=p ; i<=N; i = i+p) {
                if(nums.remove(Integer.valueOf(i))) {
                    flag++;
                }

                if(flag == K) {
                    answer = i;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}

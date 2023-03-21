/**
 * 연속합
 * https://www.acmicpc.net/problem/1912
 */
package Study.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n;

        n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i =0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int max = arr[0];

        for(int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}

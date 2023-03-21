/**
 * RGB 거리
 * https://www.acmicpc.net/problem/1149
 */
package Study.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[][] house = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i = 0 ; i < n; i ++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0 ; j < n; j++) {
                house[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0] = house[0];

        for(int i = 1 ; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int max = 1001;
                for(int k=0; k < n; k++) {
                    max = house[i-1][k] + house[i][j];
                    dp[i][j] = Math.min(house[i-1][k] + house[i][j], max);
                }
            }
        }

        int max2 = 1001;
        for(int i= 0 ; i < n; i++) {
            max2 = Math.min(dp[n-1][i], max2);
        }
        System.out.println(max2);
    }

}

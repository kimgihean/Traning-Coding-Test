/**
 * 파도반 수열
 * https://www.acmicpc.net/problem/9461
 */
package Study.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            System.out.println(solution(n, arr));
        }
    }

    private static int solution(int n, int[] list) {
        if(n > 3) {
            list[n] = solution(n-2, list) + solution(n-3, list);
            return list[n];
        }
        return 1;
    }
}

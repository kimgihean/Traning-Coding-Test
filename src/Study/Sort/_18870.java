package Study.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _18870 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int[] ans = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 브루트포스로 접근
        // 정렬로 접근
        Arrays.sort(arr);
        // -10 -9 2 4 4
        //  0  1  2 3 3
        // 중복된 숫자 indexOf(): 제일 먼저 나온 놈

        for(int i = 0; i<n; i++) {
            if(i == 0) {
                ans[Arrays.asList(arr).indexOf(arr[i])] = 0;
                continue;
            }

            if(arr[i-1] == arr[i]) {
                ans[Arrays.asList(arr).indexOf(arr[i])] = ans[Arrays.asList(arr).indexOf(arr[i-1])] + 1;
            }
            else {
                ans[Arrays.asList(arr).indexOf(arr[i])] = ans[Arrays.asList(arr).indexOf(arr[i])];
            }
        }

        for(int i=0; i <n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

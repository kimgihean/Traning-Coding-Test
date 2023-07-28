package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1037 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nCount = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int nums[] = new int[nCount];
        int N = 0;

        for(int i = 0; i < nCount; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);


        if(nCount%2 == 1) { // 약수의 개수 홀수일 때
            int index = nCount / 2;
            N = nums[index]*nums[index];
        }
        else {
            N = nums[0] * nums[nCount-1];
        }

        System.out.println(N);
    }
}

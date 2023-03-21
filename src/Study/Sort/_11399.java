package Study.Sort;

import java.util.*;
import java.io.*;

public class _11399 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum=0;
        int ans=0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            ans = ans + sum;
        }

        System.out.println(ans);
    }

}
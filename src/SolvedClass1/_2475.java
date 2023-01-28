package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2475 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int totSum = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            totSum += Math.pow(num, 2);
        }

        System.out.print(totSum % 10);
    }
}

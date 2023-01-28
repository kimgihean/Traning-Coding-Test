package SolvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2439 {
    public static void main(String args[]) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        char node[][] = new char[n][n];

        for(int i = n-1; i >= 0; i--) {
            for(int j = (n-1) - i; j < n ; j++) {
                node[i][j] = '*';
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j =0; j < n; j ++) {
                System.out.print(node[i][j]);
            }
            System.out.println();
        }
    }
    // todo 백준에서 오류
}

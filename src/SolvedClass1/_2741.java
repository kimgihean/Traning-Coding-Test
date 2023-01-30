package SolvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2741 {
    public static void main(String args[]) throws Exception{
        int n = Integer.parseInt(
                new BufferedReader(
                        new InputStreamReader(System.in))
                        .readLine());

        for(int i =1 ; i <= n; i++) {
            System.out.println(i);
        }
    }
}

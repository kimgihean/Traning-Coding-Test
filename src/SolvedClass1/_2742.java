package SolvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2742 {
    public static void main(String args[]) throws Exception{
        int n = Integer.parseInt(
                new BufferedReader(
                        new InputStreamReader(System.in))
                        .readLine());

        for(int i =n ; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

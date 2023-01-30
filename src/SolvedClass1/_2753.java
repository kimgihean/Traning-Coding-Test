package SolvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2753 {
    public static void main(String args[]) throws Exception{
        int n = Integer.parseInt(
                new BufferedReader(
                        new InputStreamReader(System.in))
                        .readLine());

        if(n % 400 == 0) {
            System.out.print(1);
        }
        else if(n % 100 == 0) {
            System.out.println(0);
        }
        else if(n % 4 == 0) {
            System.out.print(1);
        }
        else {
            System.out.println(0);
        }
    }
}

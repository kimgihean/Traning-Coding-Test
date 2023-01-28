package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numbers[] = new int[9];
        int max = 0;
        int idx = 0;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(bf.readLine());
            if(numbers[i] > max) {
                max = numbers[i];
                idx = i+1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}

package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int tot = a * b * c;
        int count[] = new int[10];

        String totString = String.valueOf(tot);

        for(int i = 0; i < 10; i++) {
            count[i] = check(i, totString);
            System.out.println(count[i]);
        }
    }

    public static int check(int i, String totString) {
        int count = 0;
        for(int k = 0; k < totString.length(); k++) {
            if(totString.charAt(k) == (char)(i+48)) {
                count++;
            }
        }
        return count;
    }
}

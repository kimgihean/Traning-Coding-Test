package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M >= 45) {
            System.out.println(H + " " + (M-45));
        }
        else {
            if(H == 0) {
                System.out.println(23+ " " + (60-(45-M)));
            }
            else {
                System.out.println((H-1) + " " + (60-(45-M)));
            }
        }
    }
}

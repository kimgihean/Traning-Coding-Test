package SolvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546 {
    public static void main(String args[]) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        double max = 0.0;

        double scores[] = new double[n];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < scores.length; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            if (max < scores[i]) max = scores[i];
        }

        for(int i=0; i < scores.length; i++) {
            scores[i] = scores[i] / max * 100;
        }

        double tot = 0.0;
        for(int i = 0; i < scores.length; i++) {
            tot += scores[i];
        }

        System.out.println(tot / n);
    }
}

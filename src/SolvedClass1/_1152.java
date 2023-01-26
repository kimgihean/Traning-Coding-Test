package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1152 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine().trim(), " ");
        int ans = 0;

        while(st.hasMoreTokens()) {
            ans++;
            st.nextToken();
        }

        System.out.println(ans);
    }
}

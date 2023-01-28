package SolvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// todo 고치기
public class _2675 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());

            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            List<Character> list = Solution(r, s);
            for(int j = 0; j < list.size(); j++) {
                System.out.print(list.get(i));
            }

            System.out.println();
        }
    }

    private static List<Character> Solution(int r, String s) {
        List<Character> p = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            for(int j = 0 ; j < r; j++) {
                p.add(s.charAt(i));
            }
        }

        return p;
    }
}

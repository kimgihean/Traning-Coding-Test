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
        List<testCase> testCaseList = new ArrayList<>();

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int tmpR = Integer.parseInt(st.nextToken());
            String tmpArr = st.nextToken();

            testCaseList.add(new testCase(tmpR, tmpArr));
        }

        for(int i = 0; i < testCaseList.size(); i++) {
            testCase testCase = testCaseList.get(i);
            List<Character> solution = Solution(testCase.r, testCase.arr);
            for(int j=0 ; j < solution.size(); j++) {
                System.out.print(solution.get(j));
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

class testCase {
    int r;
    String arr;

    public testCase(int r, String arr) {
        this.r = r;
        this.arr = arr;
    }
}
package SolvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//todo 이분탐색을 이해하기 위해 10816 문제 시도
public class _1654 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> arrList = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(bf.readLine());
            int line = Integer.parseInt(st.nextToken());
            arrList.add(line);
            sum += line;
        }

        int answer = 0;
        for(int i = sum/n; i > 0; i--) {
            int count = 0;
            int min = Integer.MAX_VALUE;
            int sumOfExtra = 0;
            for(int j = 0; j < arrList.size(); j++) {
                count += arrList.get(j) / i;
                sumOfExtra += arrList.get(j)%i;
            }
            if(count == n && sumOfExtra < min) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }
}

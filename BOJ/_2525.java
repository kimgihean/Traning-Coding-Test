package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String firstLine = br.readLine();
        st = new StringTokenizer(firstLine);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String secondLine = br.readLine();
        st = new StringTokenizer(secondLine);
        int C = Integer.parseInt(st.nextToken());

        if(B + C >= 60) { // 60분 넘어가면 시간 추가
            int hour = (B + C) / 60;
            int min = (B + C) % 60;

            if(A + hour >= 24) { // 00시를 넘길 경우
                A = (A+hour) - 24;
            }
            else {
                A += hour;
            }
            B = min;
        }
        else { // 일반적인 상황
            B += C;
        }

        System.out.println(Integer.toString(A) + " " + Integer.toString(B));
    }
}

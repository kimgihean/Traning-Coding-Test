import java.io.*;
import java.util.*;

public class _1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            int applicant = Integer.parseInt(br.readLine());
            int scores[][] = new int[applicant][2];

            for(int j =0; j <applicant; j++) {
                String paperInterviewScore = br.readLine();
                StringTokenizer st = new StringTokenizer(paperInterviewScore);
                scores[j][0] = Integer.parseInt(st.nextToken());
                scores[j][1] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Solution(scores));
        }

    }

    public static int Solution(int[][] scores) {
        int answer = 1;
        /*
        서류 심사를 기준으로 정렬한다
         */
        Arrays.sort(scores, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int max = scores[0][1];
        for(int i = 1; i < scores.length; i++) {
            if(max < scores[i][1]) {
                max = scores[i][1];
                answer++;
            }
        }
        return answer;
    }
}
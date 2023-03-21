package Study.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1388_ans {
    static int n, m;
    static char room[][];
    static boolean visit[][];

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        room = new char[n][m];
        visit = new boolean[n][m];
        int answer = 0;

        for(int i = 0; i < n; i++) {
            room[i] = bf.readLine().toCharArray();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(visit[i][j]) continue;
                // 가로일때
                else if(room[i][j] == '-') dfs(i, j, true);
                else dfs(i, j, false);
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void dfs(int i, int j, boolean row) {
        visit[i][j] = true;
        if(row) {
            j++;
            if(j < m && room[i][j] == '-') dfs(i, j, true);
        }
        else {
            i++;
            if(i < n && room[i][j] == '|') dfs(i, j, false);
        }
    }
}

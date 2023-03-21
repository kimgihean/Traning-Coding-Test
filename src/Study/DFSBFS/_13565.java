/**
 * 침투
 * https://www.acmicpc.net/problem/13565
 */
package Study.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _13565 {
    static int n, m;
    static int map[][];
    static boolean visited[][];
    static boolean flag;
    static int dx[] = {-1, 1, 0 ,0}; // 상 하 좌 우
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0 ; i < n; i++) {
            String s = bf.readLine();
            for(int j = 0 ; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        for(int j=0; j< m; j++) {
            // outer side 1인 부분
            if(map[0][j] == 0) {
                dfs(0, j);
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        if(x == n-1) {
            flag = true;
            return;
        }
        for(int i = 0 ; i < 4; i++) {
            int dirX = x + dx[i];
            int dirY = y + dy[i];

            if(RangeCheck(dirX, dirY) && map[dirX][dirY] == 0 && visited[dirX][dirY] == false) {
                dfs(dirX, dirY);
            }
        }
    }

    private static boolean RangeCheck(int dirX, int dirY) {
        return (dirX >= 0 && dirX < n && dirY >= 0 && dirY < m);
    }
}

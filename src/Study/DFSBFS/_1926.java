/**
 * 그림
 * https://www.acmicpc.net/problem/1926
 */
package Study.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1926 {
    static int n, m;
    static int map[][];
    static boolean visit[][];
    static int countPicture;
    static int sizePicture;
    static int dx[] = {-1, 1, 0, 0}; // 상 하 좌 우
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        for(int i =0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for(int i = 0 ; i < n; i ++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 1 && visit[i][j] == false) {
                    sizePicture = 0;
                    dfs(i, j);
                    countPicture++;
                }
                if(sizePicture >= max) {
                    max = sizePicture;
                }
            }
        }

        System.out.println(countPicture);
        System.out.println(max);
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        sizePicture++;
        for(int i = 0 ; i < dx.length; i++) {
            int dirX = x + dx[i];
            int dirY = y + dy[i];
            if(RangeCheck(dirX, dirY) && visit[dirX][dirY] == false && map[dirX][dirY] == 1) {
                dfs(dirX, dirY);
            }
        }
    }
    private static boolean RangeCheck(int dirX, int dirY) {
        return (dirX >= 0 && dirX < n && dirY >= 0 && dirY < m);
    }

}

/**
 * 점프왕 젤리
 * https://www.acmicpc.net/problem/16173
 */
package Study.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16173 {
    static int map[][];
    static boolean visited[][];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        boolean check = dfs(0,0,n);
        if(check) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }

    private static boolean dfs(int x, int y, int n) {
        int count = map[x][y];

        if (count == -1) {
            return true;
        }

        if (x + count < n && !visited[x + count][y] && dfs(x + count, y, n)) {
            return true;
        }

        if (y + count < n && !visited[x][y + count] && dfs(x, y + count, n)) {
            return true;
        }

        return false;



    }
}

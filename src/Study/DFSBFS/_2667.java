package Study.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2667 {
    static int n;
    static int map[][];
    static boolean visit[][];
    static int num = 0;
    static int roomCount = 0;
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int nowX, nowY;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(bf.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < n; i++) {
            String s = bf.readLine();
            for(int j = 0 ; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j =0; j < n; j++) {
                if(map[i][j] == 1 && visit[i][j] == false) {
                    num++;
                    roomCount = 0;
                    dfs(i, j);
                    list.add(roomCount);
                }
            }
        }

        System.out.println(num);
        for(int i : list) {
            System.out.println(i);
        }
    }

    private static void dfs(int x, int y) {
        visit[x][y] = true;
        roomCount++;

        for(int i=0; i<4; i++) {
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(RangeCheck() && visit[nowX][nowY] == false && map[nowX][nowY] == 1) {
                visit[nowX][nowY] = true;

                dfs(nowX, nowY);
            }
        }
    }

    private static boolean RangeCheck() {
        return (nowX >= 0 && nowX < n && nowY >= 0 && nowY < n);
    }
}

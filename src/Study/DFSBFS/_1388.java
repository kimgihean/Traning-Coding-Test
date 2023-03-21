/**
 * 바닥 장식
 * DFS
 */
package Study.DFSBFS;

import java.io.IOException;
import java.util.Scanner;

public class _1388 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        char[][] room = new char[n][m];
        boolean[][] visitRoom = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            String tmp = sc.next();
            room[i] = tmp.toCharArray();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(visitRoom[i][j] == true) continue;
                else if(j == m-1 || i == n-1) continue;
                else {
                    visitRoom[i][j] = true;
                    count++;
                    // - 와 | 나무 판자가 같은지 확인
                    if(room[i][j] == '-') {
                        checkRowSame(room[i][j], room, i , j, visitRoom);
                    }
                    else {
                        checkColSame(room[i][j], room, i , j, visitRoom);
                    }
                }
            }
        }

        System.out.println(count);

    }

    private static void checkColSame(char floor, char[][] room, int i, int j, boolean[][] visitRoom) {
        if(i == 3) return;
        if(floor == room[i+1][j]) {
            visitRoom[i+1][j] = true;
            checkColSame(room[i+1][j], room, i+1, j, visitRoom);
        }
    }

    private static void checkRowSame(char floor, char[][] room, int i, int j, boolean[][] visitRoom) {
        if(j == 3) return;
        if(floor == room[i][j+1]) {
            visitRoom[i][j+1] = true;
            checkRowSame(room[i][j+1], room, i, j+1, visitRoom);
        }
    }

}

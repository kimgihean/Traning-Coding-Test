import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class tomato {
    int x;
    int y;

    tomato(int x, int y) {
        x = this.x;
        y = this.y;
    }
}

public class _7576 {
    static int m; // col
    static int n; // row
    static int storage[][];
    static Queue<tomato> queue;
    static int dx[] = {-1, 1, 0, 0}; // 상하좌우
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        storage = new int[n][m];
        queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            for(int j=0; j< m; j++) {
                storage[i][j] = sc.nextInt();
                if(storage[i][j] == 1) queue.add(new tomato(i, j));
            }
        }

        int answer = Solution();
        System.out.println(answer);
    }

    public static int Solution() {

        while(!queue.isEmpty()) {
            tomato tomato = queue.poll();
            int x = tomato.x;
            int y = tomato.y;

            for(int i = 0 ; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(storage[nx][ny] == 0) {
                        queue.add(new tomato(nx, ny));
                        storage[nx][ny] = storage[x][y] + 1;
                    }
                }
            }
        }

        int result = Integer.MIN_VALUE;

        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(storage[i][j] == 0) return -1;
                result = Math.max(result, storage[i][j]);
            }
        }

        if (result == 1) {
            return 0;
        }
        else {
            return result -1;
        }
    }
}

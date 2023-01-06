import java.util.*;
import java.io.*;

class room{
    int row;
    int col;

    public room(int row, int col){
        this.row = row;
        this.col = col;
    }
}

public class _2178 {
    static Queue<room> roomQueue;
    static boolean[][] check;
    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf;
        bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] maze = new String[n];

        for(int i = 0; i < n; i++) {
            bf = new BufferedReader(new InputStreamReader(System.in));
            maze[i] = bf.readLine();
        }

        System.out.println(Solution(n,m,maze));
    }

    private static int Solution(int n, int m, String[] maze) {
        /*
        최소거리 구하기 알고리즘 필요한 것
        1. queue vertex 넣기
        2. 현재 위치를 계속 업데이트 해주기
        */
        roomQueue = new LinkedList<>();
        check = new boolean[n][m];

        int nowX = 0;
        int nowY = 0;

        return bfs(nowX, nowY);
    }

    private static int bfs(int nowX, int nowY) {


        return 0;
    }
}

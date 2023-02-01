package SolvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {
    public static void main(String args[]) throws IOException {
        // todo
        char board1[][] = {
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};
        char board2[][] = {
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        char board[][] = new char[row][col];

        for(int i = 0; i < row; i++) {
            board[i] = bf.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<=board[0].length-8;i++){
            for(int j=0; j<=board.length -8; j++) {
                int ans = check(i, j, board, board1, board2);
                if(min > ans) {
                    min = ans;
                }
            }
        }

        System.out.println(min);
    }

    private static int check(int i, int j, char[][] board, char[][] board1, char[][] board2) {
        int count1 = 0;
        int count2 = 0;

        for(int a = i; a < i+8; a++) {
            for(int b = j; b < j +8; j++) {
                if(board[a][b] != board1[a-i][b-i]) {
                    count1++;
                }
                if(board[a][b] != board2[a-i][b-i]) {
                    count2++;
                }
            }
        }

        if(count1 >= count2) return count2;
        else return count1;
    }

}

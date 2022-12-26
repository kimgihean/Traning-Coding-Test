import java.util.*;

class Solution {
    static boolean v[][];
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        // String 을 계산하기 편하게 char 로 바꿔준다
        char charBoard[][] = new char[m][n];
        for(int i = 0; i < m; i++) {
            charBoard[i] = board[i].toCharArray();
        }
        
        boolean flag = true;
        while(flag) {
            v = new boolean[m][n];
            flag = false;
            // check 하고 v true 인지 확인하기
            for(int i = 0 ; i < m-1; i++) {
                for(int j = 0; j < n-1; j++) {
                    if(charBoard[i][j] == '#') continue; // 시간 절약 부분
                    // 2*2 확인 후 v 에 true 넣기
                    if(check(i, j, charBoard)) {
                        v[i][j] = true;
                        v[i][j+1] = true;
                        v[i+1][j] = true;
                        v[i+1][j+1] = true;
                        flag = true;
                    }
                }
            }
            
            // erase
            answer += erase(m, n, charBoard);
        }
        return answer;
    }
    
    public static int erase(int m, int n, char[][] board) {
        int count = 0;
        // 2*2 먼저 "." 으로 바꿔주기
        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(v[i][j]) {
                    board[i][j] = '.';
                    count++;
                }
            }
        }
        
        for(int i = 0 ; i < n; i++) {
            Queue<Character> q = new LinkedList<>();
            for(int j = m-1; j >=0; j--) {
                if(board[j][i] != '.') {
                    q.add(board[j][i]);
                }
            }
            int idx = m-1;
            while(!q.isEmpty()) {
                board[idx][i] = q.poll();
                idx--;
            }
            
            for(int j = idx; j >=0; j--) {
                board[j][i] = '#';
            }
        }
        return count;
    }
    
    public static boolean check(int i, int j, char[][] board) {
        char block = board[i][j];
        if(board[i][j+1] == block &&
          board[i+1][j] == block &&
          board[i+1][j+1] == block) return true;
        return false;
    }
}

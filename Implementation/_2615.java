// 시간 초과
package Implementation;

import java.io.*;

public class _2615 {
	static int[][] map;
	static int max = 19;
	// 동, 남동, 남, 북동
	static int[] dx = {0, 1, 1, -1}; // 행
	static int[] dy = {1, 1, 0, 1}; // 열
	static int winner;
	static int x, y;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map = new int[19][19];
		// 입력
		for(int i = 0 ; i < max; i++) {
			String[] tmp = br.readLine().split(" ");
			for(int j = 0 ; j < max; j++) {
				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		
		// 확인
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < max; j++) {
				if(map[i][j] != 0) {
					check(i, j);
					x = i;
					y = j;
					break;
				}
			}
			if(winner != 0) {
				break;
			}
		}
		if(winner == 0) {
			System.out.println(winner);
		}
		else {
			System.out.println(winner);
			System.out.print((x+1) + " " + (y+1));
		}
	}
	
	public static void check(int x, int y) {
		int color = map[x][y];
		int cnt = 0;
		
			// 동
			try {
				for(int i = 0; i < 4; i++) {
					if(color == map[x+dx[0]][y+dy[0]+i]) {
						cnt++;
						if(cnt == 4) {
							//previous check & next check
							if(prevCheck(x-dx[0], y-dy[0], color) != color && nextCheck(x+dx[0], y+4+dx[0], color) != color) {
								winner = color;
								return;
							}
						}
					}
					else {
						cnt = 0;
						break;
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {}
			
			// 남동
			try {
				for(int i = 0; i < 4; i++) {
					//previous check
					if(color == map[x+dx[1]+i][y+dy[1]+i]) {
						cnt++;
						if(cnt == 4) {
							//previous check & next check
							if(prevCheck(x-dx[1], y-dy[1], color) != color && nextCheck(x+4+dx[1], y+4+dx[1], color) != color) {
								winner = color;
								return;
							}
						}
					}
					else {
						cnt = 0;
						break;
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {}
			
			// 남
			try {
				for(int i = 0; i < 4; i++) {
					if(color == map[x+dx[2]+i][y+dy[2]]) {
						cnt++;
						if(cnt == 4) {
							//previous check & next check
							if(prevCheck(x-dx[2], y-dy[2], color) != color && nextCheck(x+4+dx[2], y+dx[2], color) != color) {
								winner = color;
								return;
							}
						}
					}
					else {
						cnt = 0;
						break;
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {}
			
			// 북동
			try {
				for(int i = 0; i < 4; i++) {
					if(color == map[x+dx[3]-i][y+dy[3]+i]) {
						cnt++;
						if(cnt == 4) {
							//previous check & next check
							if(prevCheck(x-dx[3], y-dy[3], color) != color && nextCheck(x-4+dx[3], y+4+dx[3], color) != color) {
								winner = color;
								return;
							}
						}
					}
					else {
						cnt = 0;
						break;
					}
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {}
	}
	
	public static int prevCheck(int x, int y, int color) {
		if(x < 0 || y < 0) return color;
		else {
			int prevColor = map[x][y];
			return prevColor; 
		}
	}
	
	public static int nextCheck(int x, int y, int color) {
		if(x > max || y > max) return color;
		else {
			int nextColor = map[x][y];
			return nextColor;
		}
	}

}

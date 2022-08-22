package Implementation;

import java.util.*;

public class _1913 {
	
	static int[][] map;
	static int n;
	static int a;
	// delta 배열 : 탐색 or 방향을 위한 배열
	// 상, 우, 하, 좌
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = sc.nextInt();
		
		map = new int[n][n];
		
		draw();
		
	}
	
	public static void draw() {
		int curR = n/2;
		int curC = n/2;
		
		int go = 0; // direction check
		int count = 0;
		int max = 1;
		
		for(int i = 1; i <= n*n; i++) {
			map[curR][curC] = i;
			
			curR += dx[go % 4];
			curC += dy[go % 4];
			count++;
			
			if(count == max) {
				go++;
				count = 0;
			}
		}
		// 밑에 어려움...
	}
}

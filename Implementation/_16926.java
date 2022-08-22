// 다시
package Implementation;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class _16926 {
	static int map[][];
	static int n;
	static int m;
	static int r;
	// 하 우 상 좌
	static int dc[] = {0, 1, 0, -1};
	static int dr[] = {1, 0, -1, 0};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// Input
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String tmp[] = br.readLine().split(" ");
			for(int j = 0; j <m; j++) {
				map[i][j] = Integer.parseInt(tmp[j]);
			}
		}
		
		// 1. 바깥쪽, 안쪽 정하기 min(n,m) / 2 >> java.lang.math method
		// 2. 몇번 이동 후 방향전환
		// 3. 이동 개수
		// 어떻게 하는거야 시바...
		int group = Math.min(n, m) / 2;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < group; j++) {
				int tmp = map[j][j];
				int go = 0;
				while(go < 4) {
					int x = j + dr[go];
					int y = j + dc[go];
					
				}
			}
		}
		
	}
	
}

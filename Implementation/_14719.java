package Implementation;

import java.io.*;
import java.util.*;

public class _14719 {
	
	static int H; // 세로
	static int W; // 가로
	static int block[];
	static int map[][];
	static int count;
	
	public static void main(String[] args) throws IOException{
		
		// 좌우 열 1인 경우 물 채우기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st1.nextToken());
		W = Integer.parseInt(st1.nextToken());
		
		block = new int[W];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < W; i++) {
			block[i] = Integer.parseInt(st2.nextToken());
		}
		
		map = new int[H][W];
		
		// input
		for(int i = 0; i < W; i++) {
			for(int j = 0; j <block[i]; j++) {
				map[(H-1)-j][i] = 1;
			}
		} 
		
		// 벽(1) 찾기
		findLeftWall();
		System.out.print(count);
	}
	
	public static void findLeftWall() {
		for(int i = 0 ; i < H; i++) {
			for(int j = 0 ; j < W; j++) {
				if(map[i][j] == 1) {
					findRightWall(i,j);
					break;
				}
			}
		}
	}
	
	public static void findRightWall(int r, int lc) {
		for(int rc = W-1; rc > lc ; rc--) {
			if(map[r][rc] == 1) {
				water(r, lc ,rc);
				break;
			}
		}
	}
	
	public static void water(int r, int lc, int rc) {
		for(int i = lc; i < rc; i++) {
			if(map[r][i] != 1) count++;
		}
	}

}

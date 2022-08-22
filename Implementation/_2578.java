package Implementation;

import java.util.Scanner;

public class _2578 {
	static int[][] map;
	static int count; // bingo count
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//start
		map = new int[5][5];
		count = 0;
		for(int i = 0; i < 5; i++) {
			for(int j=0; j<5; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		//call
		for(int k = 0; k<25; k++) {
			int call = sc.nextInt();
			
			//delete
			for(int i = 0; i < 5; i++) {
				for(int j=0; j<5; j++) {
					if(map[i][j] == call) map[i][j] = 0;
				}
			}
			
			//check
			rCheck();
			cCheck();
			leftCheck();
			rightCheck();
			//stop
			if(count >= 3) {
				System.out.println(k+1);
				break;
			}
			count = 0; // 빠트린 부분
		}
		
		
	}
	
	//row check
	public static void rCheck() {
		for(int i = 0; i < 5; i++) {
			int deleteCount = 0;

			for(int j=0; j<5; j++) {
				if(map[i][j] == 0) deleteCount++;
			}
			
			if (deleteCount == 5) count++;
		}
	}
	
	//column check
	public static void cCheck() {
		for(int i = 0; i < 5; i++) {
			int deleteCount = 0;

			for(int j=0; j<5; j++) {
				if(map[j][i] == 0) deleteCount++;
			}
			
			if (deleteCount == 5) count++;
		}
	}
	
	//left > right check
	public static void leftCheck() {
		int deleteCount = 0;
		
		for(int i = 0; i < 5; i++) {
			if (map[i][i] == 0) deleteCount++;
		}
		
		if (deleteCount == 5) count++;
	}
	
	//right > left check
	public static void rightCheck() {
		int deleteCount = 0;
		
		for(int i = 0; i < 5; i++) {
			if (map[4-i][i] == 0) deleteCount++;
		}
		
		if (deleteCount == 5) count++;
	}
}

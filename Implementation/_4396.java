package Implementation;

import java.util.*;

public class _4396 {

	static String[][] map;
	static String[][] openMap;
	static String[][] result;
	
	static int bombCount;
	static int m = 10;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		sc.nextLine();
		
		map = new String[n+1][n+1];
		openMap = new String[n+1][n+1];
		result = new String[n+1][n+1];
		
		bombCount = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				map[i][j] = sc.next();
				result[i][j] = ".";
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				openMap[i][j] = sc.next();
			}
		}
		// check
		bumb();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.println(result[i][j]);
			}
		}
	}
	
	public static String checkBumb(int i, int j) {
		if(map[i-1][j-1] == "*") bombCount++;
		if(map[i-1][j] == "*") bombCount++;
		if(map[i-1][j+1] == "*") bombCount++;
		if(map[i][j-1] == "*") bombCount++;
		if(map[i][j+1] == "*") bombCount++;
		if(map[i+1][j] == "*") bombCount++;
		if(map[i+1][j-1] == "*") bombCount++;
		if(map[i+1][j+1] == "*") bombCount++;
		
		String bombCountString = Integer.toString(bombCount);
		
		bombCount = 0;
		
		return bombCountString;
	}
	
	// the bombs, *
	public static void bumb() {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if (map[i][j] == "*" && openMap[i][j] == "X") 
					result[i][j] = "*";
				else if (map[i][j] == "." && openMap[i][j] == "X") {
					result[i][j] = checkBumb(i, j);	
				}
			}
		}
	}
}

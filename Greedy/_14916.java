/***
 * 그리디 분류지만 구현으로 풀었다.
 */
package Greedy;

import java.io.*;

public class _14916 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(n > 0) {
			if(n % 5 == 0) {
				cnt = cnt + n / 5;
				break;
			}
			n = n - 2;
			cnt++;
		}
		if(n < 0) System.out.println(-1);
		else System.out.println(cnt);
	}

}

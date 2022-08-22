package Greedy;

import java.util.*;
import java.io.*;

public class _16953 {
	static int A, B;
	static int cnt = 0;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		while(A < B) {
			if(B % 10 == 1) {
				B = (B-1) / 10;
				cnt++;
			}
			else if(B % 2 == 0){
				B = B/2;
				cnt++;
			}
			else if(B % 2 == 1){
				break;
			}
		}
		if(A == B) cnt++;
		else cnt = -1;
		
		System.out.println(cnt);
	}

}
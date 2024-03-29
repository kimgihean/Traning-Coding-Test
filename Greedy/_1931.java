/*
 * 이차원 배열 정렬하는거 공부하기
 */
package Greedy;

import java.io.*;
import java.util.*;

public class _1931 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// hash map 을 사용해 보자! FAIL
		// 이차원 배열 사용하기!
		
		//__INIT__
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] p = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 두번째 열 기준으로 정렬하기!
		Arrays.sort(p, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		
		int count = 0;
		int prevTime = 0;
		
		for(int i = 0; i < n; i++) {
			if(prevTime <= p[i][0]) {
				prevTime = p[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}

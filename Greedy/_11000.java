package Greedy;

import java.util.*;
import java.io.*;

public class _11000 {
	static int N;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		int[][] lecture = new int[N][2];
		
		StringTokenizer st = null;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			lecture[i][0] = Integer.parseInt(st.nextToken());
			lecture[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 2차원 배열 정렬하기
		// 앞에 거 오름차순, 앞에 것이 같다면 뒤에것 오름차순
		Arrays.sort(lecture, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
			
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(lecture[0][1]);
		for(int i = 1 ; i < N; i++) {
			if(pq.peek() <= lecture[i][0]) pq.poll();
			pq.offer(lecture[i][1]);
		}
		
		System.out.print(pq.size());
	}

}
